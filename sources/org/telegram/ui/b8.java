package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class b8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f36733a;
    public final d8 f36734b;

    public b8(d8 d8Var, Context context) {
        this.f36734b = d8Var;
        this.f36733a = context;
    }

    public final e8 a(float f10, float f11) {
        e8 e8Var;
        d8 d8Var = this.f36734b;
        if (d8Var.f37438n == null) {
            return null;
        }
        int i9 = d8Var.f37436e;
        float measuredWidth = d8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i10 = 0;
        for (int i11 = 0; i11 < d8Var.d; i11++) {
            float f12 = (measuredWidth / 2.0f) + (i9 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i10 * dp) + AndroidUtilities.dp(44.0f);
            float f13 = dp2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= dp3 - f13 && f11 <= dp3 + f13 && (e8Var = (e8) d8Var.f37438n.get(i11, null)) != null) {
                return e8Var;
            }
            i9++;
            if (i9 >= 7) {
                i10++;
                i9 = 0;
            }
        }
        return null;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        final e8 a2;
        super.onLongPress(motionEvent);
        d8 d8Var = this.f36734b;
        g8 g8Var = d8Var.f37442x;
        if (g8Var.f38447a0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                d8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j10 = g8Var.f38464x;
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            qn qnVar = new qn(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, g8Var.getParentActivity(), g8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(g8Var.getParentActivity(), true, false);
            g1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final b8 f44762b;

                {
                    this.f44762b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    switch (r3) {
                        case 0:
                            b8 b8Var = this.f44762b;
                            g8 g8Var2 = b8Var.f36734b.f37442x;
                            b5Var = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                            if (b5Var != null) {
                                b5Var2 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                if (b5Var2.getFragmentStack().size() >= 3) {
                                    b5Var3 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                    List fragmentStack = b5Var3.getFragmentStack();
                                    b5Var4 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                    if (o2Var instanceof qn) {
                                        AndroidUtilities.runOnUIThread(new t1(b8Var, (qn) o2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            g8Var2.finishPreviewFragment();
                            return;
                        default:
                            d8 d8Var2 = this.f44762b.f36734b;
                            g8 g8Var3 = d8Var2.f37442x;
                            int i9 = a2.h;
                            g8Var3.M = i9;
                            g8Var3.L = i9;
                            g8Var3.C = true;
                            g8Var3.s0();
                            g8 g8Var4 = d8Var2.f37442x;
                            g8Var4.n0();
                            g8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
            if (g8Var.Z) {
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(g8Var.getParentActivity(), false, false);
                g1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final b8 f44762b;

                    {
                        this.f44762b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        org.telegram.ui.ActionBar.b5 b5Var4;
                        switch (r3) {
                            case 0:
                                b8 b8Var = this.f44762b;
                                g8 g8Var2 = b8Var.f36734b.f37442x;
                                b5Var = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                if (b5Var != null) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                    if (b5Var2.getFragmentStack().size() >= 3) {
                                        b5Var3 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                        List fragmentStack = b5Var3.getFragmentStack();
                                        b5Var4 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                        if (o2Var instanceof qn) {
                                            AndroidUtilities.runOnUIThread(new t1(b8Var, (qn) o2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                g8Var2.finishPreviewFragment();
                                return;
                            default:
                                d8 d8Var2 = this.f44762b.f36734b;
                                g8 g8Var3 = d8Var2.f37442x;
                                int i9 = a2.h;
                                g8Var3.M = i9;
                                g8Var3.L = i9;
                                g8Var3.C = true;
                                g8Var3.s0();
                                g8 g8Var4 = d8Var2.f37442x;
                                g8Var4.n0();
                                g8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(g8Var.getParentActivity(), false, true);
                g1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                g1Var3.setMinimumWidth(160);
                g1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final b8 f45056b;

                    {
                        this.f45056b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        switch (r2) {
                            case 0:
                                b8 b8Var = this.f45056b;
                                g8 g8Var2 = b8Var.f36734b.f37442x;
                                b5Var = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                if (b5Var.getFragmentStack().size() >= 3) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                    List fragmentStack = b5Var2.getFragmentStack();
                                    b5Var3 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                    if (o2Var instanceof qn) {
                                        org.telegram.ui.Components.y4.r(g8Var2, 1, g8Var2.getMessagesController().getUser(Long.valueOf(g8Var2.f38464x)), null, false, new a8(b8Var, (qn) o2Var), null);
                                    }
                                }
                                g8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f45056b.f36734b.f37442x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            g8Var.v = new fh.l2(this, this.f36733a, 9);
            g8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final b8 f45056b;

                {
                    this.f45056b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    switch (r2) {
                        case 0:
                            b8 b8Var = this.f45056b;
                            g8 g8Var2 = b8Var.f36734b.f37442x;
                            b5Var = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                            if (b5Var.getFragmentStack().size() >= 3) {
                                b5Var2 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                List fragmentStack = b5Var2.getFragmentStack();
                                b5Var3 = ((org.telegram.ui.ActionBar.o2) g8Var2).parentLayout;
                                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                if (o2Var instanceof qn) {
                                    org.telegram.ui.Components.y4.r(g8Var2, 1, g8Var2.getMessagesController().getUser(Long.valueOf(g8Var2.f38464x)), null, false, new a8(b8Var, (qn) o2Var), null);
                                }
                            }
                            g8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f45056b.f36734b.f37442x.finishPreviewFragment();
                            return;
                    }
                }
            });
            g8Var.v.setVisibility(8);
            g8Var.v.setFitsSystemWindows(true);
            g8.Z(g8Var).getOverlayContainerView().addView(g8Var.v, g7.e6.c(-1.0f, -1));
            g8.a0(g8Var);
            g8Var.presentFragmentAsPreviewWithMenu(qnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        e8 a2;
        MessageObject messageObject;
        m5.c0 c0Var;
        d8 d8Var = this.f36734b;
        g8 g8Var = d8Var.f37442x;
        if (g8.U(g8Var) != null) {
            if (((g8Var.f38447a0 == 1 && d8Var.f37438n != null) || g8Var.f38449b0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f37839a) != null && (c0Var = g8Var.I) != null) {
                if (g8Var.f38449b0 != null) {
                    ih.m9 orCreateStoryViewer = g8Var.getOrCreateStoryViewer();
                    Context context = d8Var.getContext();
                    MessageObject messageObject2 = a2.f37839a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ih.n6 n6Var = g8Var.f38449b0;
                    g gVar = g8Var.f38451c0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(n6Var.d));
                    orCreateStoryViewer.L0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, n6Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i9 = a2.f37841c;
                    org.telegram.ui.Components.eu0 eu0Var = (org.telegram.ui.Components.eu0) c0Var.f17378b;
                    int i10 = -1;
                    for (int i11 = 0; i11 < eu0Var.f28155p1[0].f32788a.size(); i11++) {
                        if (((MessageObject) eu0Var.f28155p1[0].f32788a.get(i11)).getId() == id3) {
                            i10 = i11;
                        }
                    }
                    org.telegram.ui.Components.xs0 W = eu0Var.W(0);
                    if (i10 >= 0 && W != null) {
                        W.f34764x.h1(i10, 0);
                    } else {
                        eu0Var.y0(0, id3, i9, true);
                    }
                    if (W != null) {
                        W.F = id3;
                        W.G = false;
                    }
                    g8Var.finishFragment();
                }
            }
            if (d8Var.f37438n != null) {
                if (g8Var.C) {
                    e8 a3 = a(motionEvent.getX(), motionEvent.getY());
                    if (a3 != null) {
                        ValueAnimator valueAnimator = g8Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            g8Var.N = null;
                        }
                        int i12 = g8Var.L;
                        if (i12 == 0 && g8Var.M == 0) {
                            int i13 = a3.h;
                            g8Var.M = i13;
                            g8Var.L = i13;
                        } else {
                            int i14 = a3.h;
                            if (i12 == i14 && g8Var.M == i14) {
                                g8Var.M = 0;
                                g8Var.L = 0;
                            } else if (i12 == i14) {
                                g8Var.L = g8Var.M;
                            } else {
                                int i15 = g8Var.M;
                                if (i15 == i14) {
                                    g8Var.M = i12;
                                } else if (i12 == i15) {
                                    if (i14 > i15) {
                                        g8Var.M = i14;
                                    } else {
                                        g8Var.L = i14;
                                    }
                                } else {
                                    g8Var.M = i14;
                                    g8Var.L = i14;
                                }
                            }
                        }
                        g8Var.s0();
                        g8Var.n0();
                        return false;
                    }
                } else {
                    e8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null && g8.V(g8Var) != null && g8.W(g8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) g8.Y(g8Var).getFragmentStack().get(g8.X(g8Var).getFragmentStack().size() - 2);
                        if (o2Var instanceof qn) {
                            g8Var.finishFragment();
                            ((qn) o2Var).G9(a10.h);
                            return false;
                        }
                    } else if (a10 != null && g8Var.J != null) {
                        g8Var.finishFragment();
                        g8Var.J.G9(a10.h);
                    }
                }
            }
        }
        return false;
    }
}
