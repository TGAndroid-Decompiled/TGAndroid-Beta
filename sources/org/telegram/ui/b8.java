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
    public final Context f36202a;
    public final d8 f36203b;

    public b8(d8 d8Var, Context context) {
        this.f36203b = d8Var;
        this.f36202a = context;
    }

    public final e8 a(float f7, float f10) {
        e8 e8Var;
        d8 d8Var = this.f36203b;
        if (d8Var.f36930n == null) {
            return null;
        }
        int i10 = d8Var.f36928e;
        float measuredWidth = d8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < d8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (e8Var = (e8) d8Var.f36930n.get(i12, null)) != null) {
                return e8Var;
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
        final e8 a2;
        super.onLongPress(motionEvent);
        d8 d8Var = this.f36203b;
        g8 g8Var = d8Var.f36934x;
        if (g8Var.f37965e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                d8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = g8Var.f37978x;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            zn znVar = new zn(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, g8Var.getParentActivity(), g8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(g8Var.getParentActivity(), true, false);
            f1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            f1Var.setMinimumWidth(160);
            f1Var.setOnClickListener(new View.OnClickListener(this) {
                public final b8 f44314b;

                {
                    this.f44314b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.d5 d5Var;
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    org.telegram.ui.ActionBar.d5 d5Var4;
                    switch (r3) {
                        case 0:
                            b8 b8Var = this.f44314b;
                            g8 g8Var2 = b8Var.f36203b.f36934x;
                            d5Var = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                            if (d5Var != null) {
                                d5Var2 = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                if (d5Var2.getFragmentStack().size() >= 3) {
                                    d5Var3 = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                    List fragmentStack = d5Var3.getFragmentStack();
                                    d5Var4 = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 3);
                                    if (n2Var instanceof zn) {
                                        AndroidUtilities.runOnUIThread(new r1(b8Var, (zn) n2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            g8Var2.finishPreviewFragment();
                            return;
                        default:
                            d8 d8Var2 = this.f44314b.f36203b;
                            g8 g8Var3 = d8Var2.f36934x;
                            int i10 = a2.h;
                            g8Var3.Q = i10;
                            g8Var3.P = i10;
                            g8Var3.G = true;
                            g8Var3.t0();
                            g8 g8Var4 = d8Var2.f36934x;
                            g8Var4.o0();
                            g8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
            if (g8Var.f37963d0) {
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(g8Var.getParentActivity(), false, false);
                f1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                f1Var2.setMinimumWidth(160);
                f1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final b8 f44314b;

                    {
                        this.f44314b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.d5 d5Var;
                        org.telegram.ui.ActionBar.d5 d5Var2;
                        org.telegram.ui.ActionBar.d5 d5Var3;
                        org.telegram.ui.ActionBar.d5 d5Var4;
                        switch (r3) {
                            case 0:
                                b8 b8Var = this.f44314b;
                                g8 g8Var2 = b8Var.f36203b.f36934x;
                                d5Var = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                if (d5Var != null) {
                                    d5Var2 = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                    if (d5Var2.getFragmentStack().size() >= 3) {
                                        d5Var3 = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                        List fragmentStack = d5Var3.getFragmentStack();
                                        d5Var4 = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 3);
                                        if (n2Var instanceof zn) {
                                            AndroidUtilities.runOnUIThread(new r1(b8Var, (zn) n2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                g8Var2.finishPreviewFragment();
                                return;
                            default:
                                d8 d8Var2 = this.f44314b.f36203b;
                                g8 g8Var3 = d8Var2.f36934x;
                                int i10 = a2.h;
                                g8Var3.Q = i10;
                                g8Var3.P = i10;
                                g8Var3.G = true;
                                g8Var3.t0();
                                g8 g8Var4 = d8Var2.f36934x;
                                g8Var4.o0();
                                g8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
                org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(g8Var.getParentActivity(), false, true);
                f1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                f1Var3.setMinimumWidth(160);
                f1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final b8 f44548b;

                    {
                        this.f44548b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.d5 d5Var;
                        org.telegram.ui.ActionBar.d5 d5Var2;
                        org.telegram.ui.ActionBar.d5 d5Var3;
                        switch (r2) {
                            case 0:
                                b8 b8Var = this.f44548b;
                                g8 g8Var2 = b8Var.f36203b.f36934x;
                                d5Var = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                if (d5Var.getFragmentStack().size() >= 3) {
                                    d5Var2 = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                    List fragmentStack = d5Var2.getFragmentStack();
                                    d5Var3 = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var3.getFragmentStack().size() - 3);
                                    if (n2Var instanceof zn) {
                                        org.telegram.ui.Components.g5.q(g8Var2, 1, g8Var2.getMessagesController().getUser(Long.valueOf(g8Var2.f37978x)), null, false, new a8(b8Var, (zn) n2Var), null);
                                    }
                                }
                                g8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f44548b.f36203b.f36934x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            g8Var.v = new ci.bb(this, this.f36202a, 10);
            g8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final b8 f44548b;

                {
                    this.f44548b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.d5 d5Var;
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    switch (r2) {
                        case 0:
                            b8 b8Var = this.f44548b;
                            g8 g8Var2 = b8Var.f36203b.f36934x;
                            d5Var = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                            if (d5Var.getFragmentStack().size() >= 3) {
                                d5Var2 = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                List fragmentStack = d5Var2.getFragmentStack();
                                d5Var3 = ((org.telegram.ui.ActionBar.n2) g8Var2).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var3.getFragmentStack().size() - 3);
                                if (n2Var instanceof zn) {
                                    org.telegram.ui.Components.g5.q(g8Var2, 1, g8Var2.getMessagesController().getUser(Long.valueOf(g8Var2.f37978x)), null, false, new a8(b8Var, (zn) n2Var), null);
                                }
                            }
                            g8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f44548b.f36203b.f36934x.finishPreviewFragment();
                            return;
                    }
                }
            });
            g8Var.v.setVisibility(8);
            g8Var.v.setFitsSystemWindows(true);
            g8.a0(g8Var).getOverlayContainerView().addView(g8Var.v, w7.x5.d(-1.0f, -1));
            g8.b0(g8Var);
            g8Var.presentFragmentAsPreviewWithMenu(znVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        e8 a2;
        MessageObject messageObject;
        m.f3 f3Var;
        d8 d8Var = this.f36203b;
        g8 g8Var = d8Var.f36934x;
        if (g8.V(g8Var) != null) {
            if (((g8Var.f37965e0 == 1 && d8Var.f36930n != null) || g8Var.f37967f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f37225a) != null && (f3Var = g8Var.M) != null) {
                if (g8Var.f37967f0 != null) {
                    ai.kc orCreateStoryViewer = g8Var.getOrCreateStoryViewer();
                    Context context = d8Var.getContext();
                    MessageObject messageObject2 = a2.f37225a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ai.e9 e9Var = g8Var.f37967f0;
                    g gVar = g8Var.f37968g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(e9Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, e9Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f37227c;
                    org.telegram.ui.Components.cw0 cw0Var = (org.telegram.ui.Components.cw0) f3Var.f15672b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < cw0Var.f25470t1[0].f30578a.size(); i12++) {
                        if (((MessageObject) cw0Var.f25470t1[0].f30578a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.vu0 W = cw0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f32522x.h1(i11, 0);
                    } else {
                        cw0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    g8Var.finishFragment();
                }
            }
            if (d8Var.f36930n != null) {
                if (g8Var.G) {
                    e8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = g8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            g8Var.R = null;
                        }
                        int i13 = g8Var.P;
                        if (i13 == 0 && g8Var.Q == 0) {
                            int i14 = a10.h;
                            g8Var.Q = i14;
                            g8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && g8Var.Q == i15) {
                                g8Var.Q = 0;
                                g8Var.P = 0;
                            } else if (i13 == i15) {
                                g8Var.P = g8Var.Q;
                            } else {
                                int i16 = g8Var.Q;
                                if (i16 == i15) {
                                    g8Var.Q = i13;
                                } else if (i13 == i16) {
                                    if (i15 > i16) {
                                        g8Var.Q = i15;
                                    } else {
                                        g8Var.P = i15;
                                    }
                                } else {
                                    g8Var.Q = i15;
                                    g8Var.P = i15;
                                }
                            }
                        }
                        g8Var.t0();
                        g8Var.o0();
                        return false;
                    }
                } else {
                    e8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null && g8.W(g8Var) != null && g8.X(g8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) g8.Z(g8Var).getFragmentStack().get(g8.Y(g8Var).getFragmentStack().size() - 2);
                        if (n2Var instanceof zn) {
                            g8Var.finishFragment();
                            ((zn) n2Var).L9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && g8Var.N != null) {
                        g8Var.finishFragment();
                        g8Var.N.L9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
