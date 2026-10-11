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
    public final Context f35949a;
    public final c8 f35950b;

    public a8(c8 c8Var, Context context) {
        this.f35950b = c8Var;
        this.f35949a = context;
    }

    public final d8 a(float f7, float f10) {
        d8 d8Var;
        c8 c8Var = this.f35950b;
        if (c8Var.f36656n == null) {
            return null;
        }
        int i10 = c8Var.f36654e;
        float measuredWidth = c8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < c8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (d8Var = (d8) c8Var.f36656n.get(i12, null)) != null) {
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
        c8 c8Var = this.f35950b;
        f8 f8Var = c8Var.f36660x;
        if (f8Var.f37617e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                c8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = f8Var.f37630x;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            zn znVar = new zn(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, f8Var.getParentActivity(), f8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(f8Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(f8Var.getParentActivity(), true, false);
            e1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) {
                public final a8 f44030b;

                {
                    this.f44030b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    switch (r3) {
                        case 0:
                            a8 a8Var = this.f44030b;
                            f8 f8Var2 = a8Var.f35950b.f36660x;
                            b5Var = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                            if (b5Var != null) {
                                b5Var2 = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                if (b5Var2.getFragmentStack().size() >= 3) {
                                    b5Var3 = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                    List fragmentStack = b5Var3.getFragmentStack();
                                    b5Var4 = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                    if (m2Var instanceof zn) {
                                        AndroidUtilities.runOnUIThread(new q1(a8Var, (zn) m2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            f8Var2.finishPreviewFragment();
                            return;
                        default:
                            c8 c8Var2 = this.f44030b.f35950b;
                            f8 f8Var3 = c8Var2.f36660x;
                            int i10 = a2.h;
                            f8Var3.Q = i10;
                            f8Var3.P = i10;
                            f8Var3.G = true;
                            f8Var3.t0();
                            f8 f8Var4 = c8Var2.f36660x;
                            f8Var4.o0();
                            f8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
            if (f8Var.f37615d0) {
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(f8Var.getParentActivity(), false, false);
                e1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                e1Var2.setMinimumWidth(160);
                e1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final a8 f44030b;

                    {
                        this.f44030b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        org.telegram.ui.ActionBar.b5 b5Var4;
                        switch (r3) {
                            case 0:
                                a8 a8Var = this.f44030b;
                                f8 f8Var2 = a8Var.f35950b.f36660x;
                                b5Var = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                if (b5Var != null) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                    if (b5Var2.getFragmentStack().size() >= 3) {
                                        b5Var3 = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                        List fragmentStack = b5Var3.getFragmentStack();
                                        b5Var4 = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                        if (m2Var instanceof zn) {
                                            AndroidUtilities.runOnUIThread(new q1(a8Var, (zn) m2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                f8Var2.finishPreviewFragment();
                                return;
                            default:
                                c8 c8Var2 = this.f44030b.f35950b;
                                f8 f8Var3 = c8Var2.f36660x;
                                int i10 = a2.h;
                                f8Var3.Q = i10;
                                f8Var3.P = i10;
                                f8Var3.G = true;
                                f8Var3.t0();
                                f8 f8Var4 = c8Var2.f36660x;
                                f8Var4.o0();
                                f8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(f8Var.getParentActivity(), false, true);
                e1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                e1Var3.setMinimumWidth(160);
                e1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final a8 f44308b;

                    {
                        this.f44308b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        switch (r2) {
                            case 0:
                                a8 a8Var = this.f44308b;
                                f8 f8Var2 = a8Var.f35950b.f36660x;
                                b5Var = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                if (b5Var.getFragmentStack().size() >= 3) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                    List fragmentStack = b5Var2.getFragmentStack();
                                    b5Var3 = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                    if (m2Var instanceof zn) {
                                        org.telegram.ui.Components.g5.q(f8Var2, 1, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.f37630x)), null, false, new z7(a8Var, (zn) m2Var), null);
                                    }
                                }
                                f8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f44308b.f35950b.f36660x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            f8Var.v = new ci.bb(this, this.f35949a, 10);
            f8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final a8 f44308b;

                {
                    this.f44308b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    switch (r2) {
                        case 0:
                            a8 a8Var = this.f44308b;
                            f8 f8Var2 = a8Var.f35950b.f36660x;
                            b5Var = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                            if (b5Var.getFragmentStack().size() >= 3) {
                                b5Var2 = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                List fragmentStack = b5Var2.getFragmentStack();
                                b5Var3 = ((org.telegram.ui.ActionBar.m2) f8Var2).parentLayout;
                                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                if (m2Var instanceof zn) {
                                    org.telegram.ui.Components.g5.q(f8Var2, 1, f8Var2.getMessagesController().getUser(Long.valueOf(f8Var2.f37630x)), null, false, new z7(a8Var, (zn) m2Var), null);
                                }
                            }
                            f8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f44308b.f35950b.f36660x.finishPreviewFragment();
                            return;
                    }
                }
            });
            f8Var.v.setVisibility(8);
            f8Var.v.setFitsSystemWindows(true);
            f8.a0(f8Var).getOverlayContainerView().addView(f8Var.v, w7.x5.d(-1.0f, -1));
            f8.b0(f8Var);
            f8Var.presentFragmentAsPreviewWithMenu(znVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        d8 a2;
        MessageObject messageObject;
        m.f3 f3Var;
        c8 c8Var = this.f35950b;
        f8 f8Var = c8Var.f36660x;
        if (f8.V(f8Var) != null) {
            if (((f8Var.f37617e0 == 1 && c8Var.f36656n != null) || f8Var.f37619f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f36969a) != null && (f3Var = f8Var.M) != null) {
                if (f8Var.f37619f0 != null) {
                    ai.kc orCreateStoryViewer = f8Var.getOrCreateStoryViewer();
                    Context context = c8Var.getContext();
                    MessageObject messageObject2 = a2.f36969a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ai.e9 e9Var = f8Var.f37619f0;
                    g gVar = f8Var.f37620g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(e9Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, e9Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f36971c;
                    org.telegram.ui.Components.cw0 cw0Var = (org.telegram.ui.Components.cw0) f3Var.f15729b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < cw0Var.f25532t1[0].f30637a.size(); i12++) {
                        if (((MessageObject) cw0Var.f25532t1[0].f30637a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.vu0 W = cw0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f32559x.h1(i11, 0);
                    } else {
                        cw0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    f8Var.finishFragment();
                }
            }
            if (c8Var.f36656n != null) {
                if (f8Var.G) {
                    d8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = f8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            f8Var.R = null;
                        }
                        int i13 = f8Var.P;
                        if (i13 == 0 && f8Var.Q == 0) {
                            int i14 = a10.h;
                            f8Var.Q = i14;
                            f8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && f8Var.Q == i15) {
                                f8Var.Q = 0;
                                f8Var.P = 0;
                            } else if (i13 == i15) {
                                f8Var.P = f8Var.Q;
                            } else {
                                int i16 = f8Var.Q;
                                if (i16 == i15) {
                                    f8Var.Q = i13;
                                } else if (i13 == i16) {
                                    if (i15 > i16) {
                                        f8Var.Q = i15;
                                    } else {
                                        f8Var.P = i15;
                                    }
                                } else {
                                    f8Var.Q = i15;
                                    f8Var.P = i15;
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
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) f8.Z(f8Var).getFragmentStack().get(f8.Y(f8Var).getFragmentStack().size() - 2);
                        if (m2Var instanceof zn) {
                            f8Var.finishFragment();
                            ((zn) m2Var).L9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && f8Var.N != null) {
                        f8Var.finishFragment();
                        f8Var.N.L9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
