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
public final class a8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f36451a;
    public final c8 f36452b;

    public a8(c8 c8Var, Context context) {
        this.f36452b = c8Var;
        this.f36451a = context;
    }

    public final d8 a(float f9, float f10) {
        d8 d8Var;
        c8 c8Var = this.f36452b;
        if (c8Var.f37032n == null) {
            return null;
        }
        int i10 = c8Var.f37030e;
        float measuredWidth = c8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < c8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f9 >= f11 - f12 && f9 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (d8Var = (d8) c8Var.f37032n.get(i12, null)) != null) {
                return d8Var;
            }
            i10++;
            if (i10 >= 7) {
                i11++;
                i10 = 0;
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
        final d8 a2;
        super.onLongPress(motionEvent);
        c8 c8Var = this.f36452b;
        f8 f8Var = c8Var.f37036x;
        if (f8Var.f38020a0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                c8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j10 = f8Var.f38037x;
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            tn tnVar = new tn(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, f8Var.getParentActivity(), f8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(f8Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(f8Var.getParentActivity(), true, false);
            g1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final a8 f44507b;

                {
                    this.f44507b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    switch (r3) {
                        case 0:
                            a8 a8Var = this.f44507b;
                            f8 f8Var2 = a8Var.f36452b.f37036x;
                            b5Var = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                            if (b5Var != null) {
                                b5Var2 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                if (b5Var2.getFragmentStack().size() >= 3) {
                                    b5Var3 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                    List fragmentStack = b5Var3.getFragmentStack();
                                    b5Var4 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                    if (o2Var instanceof tn) {
                                        AndroidUtilities.runOnUIThread(new u1(a8Var, (tn) o2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            f8Var2.finishPreviewFragment();
                            return;
                        default:
                            c8 c8Var2 = this.f44507b.f36452b;
                            f8 f8Var3 = c8Var2.f37036x;
                            int i10 = a2.h;
                            f8Var3.M = i10;
                            f8Var3.L = i10;
                            f8Var3.C = true;
                            f8Var3.t0();
                            f8 f8Var4 = c8Var2.f37036x;
                            f8Var4.o0();
                            f8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
            if (f8Var.Z) {
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(f8Var.getParentActivity(), false, false);
                g1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final a8 f44507b;

                    {
                        this.f44507b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        org.telegram.ui.ActionBar.b5 b5Var4;
                        switch (r3) {
                            case 0:
                                a8 a8Var = this.f44507b;
                                f8 f8Var2 = a8Var.f36452b.f37036x;
                                b5Var = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                if (b5Var != null) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                    if (b5Var2.getFragmentStack().size() >= 3) {
                                        b5Var3 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                        List fragmentStack = b5Var3.getFragmentStack();
                                        b5Var4 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                        if (o2Var instanceof tn) {
                                            AndroidUtilities.runOnUIThread(new u1(a8Var, (tn) o2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                f8Var2.finishPreviewFragment();
                                return;
                            default:
                                c8 c8Var2 = this.f44507b.f36452b;
                                f8 f8Var3 = c8Var2.f37036x;
                                int i10 = a2.h;
                                f8Var3.M = i10;
                                f8Var3.L = i10;
                                f8Var3.C = true;
                                f8Var3.t0();
                                f8 f8Var4 = c8Var2.f37036x;
                                f8Var4.o0();
                                f8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(f8Var.getParentActivity(), false, true);
                g1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                g1Var3.setMinimumWidth(160);
                g1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final a8 f44760b;

                    {
                        this.f44760b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        switch (r2) {
                            case 0:
                                a8 a8Var = this.f44760b;
                                f8 f8Var2 = a8Var.f36452b.f37036x;
                                b5Var = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                if (b5Var.getFragmentStack().size() >= 3) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                    List fragmentStack = b5Var2.getFragmentStack();
                                    b5Var3 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                    if (o2Var instanceof tn) {
                                        org.telegram.ui.Components.c5.r(f8Var2, 1, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.f38037x)), null, false, new z7(a8Var, (tn) o2Var), null);
                                    }
                                }
                                f8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f44760b.f36452b.f37036x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            f8Var.v = new cg.h0(this, this.f36451a, 7);
            f8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final a8 f44760b;

                {
                    this.f44760b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    switch (r2) {
                        case 0:
                            a8 a8Var = this.f44760b;
                            f8 f8Var2 = a8Var.f36452b.f37036x;
                            b5Var = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                            if (b5Var.getFragmentStack().size() >= 3) {
                                b5Var2 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                List fragmentStack = b5Var2.getFragmentStack();
                                b5Var3 = ((org.telegram.ui.ActionBar.o2) f8Var2).parentLayout;
                                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                if (o2Var instanceof tn) {
                                    org.telegram.ui.Components.c5.r(f8Var2, 1, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.f38037x)), null, false, new z7(a8Var, (tn) o2Var), null);
                                }
                            }
                            f8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f44760b.f36452b.f37036x.finishPreviewFragment();
                            return;
                    }
                }
            });
            f8Var.v.setVisibility(8);
            f8Var.v.setFitsSystemWindows(true);
            f8.a0(f8Var).getOverlayContainerView().addView(f8Var.v, i7.f6.c(-1.0f, -1));
            f8.b0(f8Var);
            f8Var.presentFragmentAsPreviewWithMenu(tnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        d8 a2;
        MessageObject messageObject;
        o1.a aVar;
        c8 c8Var = this.f36452b;
        f8 f8Var = c8Var.f37036x;
        if (f8.V(f8Var) != null) {
            if (((f8Var.f38020a0 == 1 && c8Var.f37032n != null) || f8Var.f38022b0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f37392a) != null && (aVar = f8Var.I) != null) {
                if (f8Var.f38022b0 != null) {
                    lh.i9 orCreateStoryViewer = f8Var.getOrCreateStoryViewer();
                    Context context = c8Var.getContext();
                    MessageObject messageObject2 = a2.f37392a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    lh.k6 k6Var = f8Var.f38022b0;
                    h hVar = f8Var.f38024c0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(k6Var.d));
                    orCreateStoryViewer.L0 = id2;
                    orCreateStoryViewer.F(context, storyItem, arrayList, 0, k6Var, null, hVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f37394c;
                    org.telegram.ui.Components.qu0 qu0Var = (org.telegram.ui.Components.qu0) aVar.f19014b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < qu0Var.f32088p1[0].f28534a.size(); i12++) {
                        if (((MessageObject) qu0Var.f32088p1[0].f28534a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.it0 W = qu0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f29472x.h1(i11, 0);
                    } else {
                        qu0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.F = id3;
                        W.G = false;
                    }
                    f8Var.finishFragment();
                }
            }
            if (c8Var.f37032n != null) {
                if (f8Var.C) {
                    d8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = f8Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            f8Var.N = null;
                        }
                        int i13 = f8Var.L;
                        if (i13 == 0 && f8Var.M == 0) {
                            int i14 = a10.h;
                            f8Var.M = i14;
                            f8Var.L = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && f8Var.M == i15) {
                                f8Var.M = 0;
                                f8Var.L = 0;
                            } else if (i13 == i15) {
                                f8Var.L = f8Var.M;
                            } else {
                                int i16 = f8Var.M;
                                if (i16 == i15) {
                                    f8Var.M = i13;
                                } else if (i13 == i16) {
                                    if (i15 > i16) {
                                        f8Var.M = i15;
                                    } else {
                                        f8Var.L = i15;
                                    }
                                } else {
                                    f8Var.M = i15;
                                    f8Var.L = i15;
                                }
                            }
                        }
                        f8Var.t0();
                        f8Var.o0();
                        return false;
                    }
                } else {
                    d8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null && f8.W(f8Var) != null && f8.X(f8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) f8.Z(f8Var).getFragmentStack().get(f8.Y(f8Var).getFragmentStack().size() - 2);
                        if (o2Var instanceof tn) {
                            f8Var.finishFragment();
                            ((tn) o2Var).G9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && f8Var.J != null) {
                        f8Var.finishFragment();
                        f8Var.J.G9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
