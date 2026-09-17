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
public final class e8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f33321a;
    public final g8 f33322b;

    public e8(g8 g8Var, Context context) {
        this.f33322b = g8Var;
        this.f33321a = context;
    }

    public final h8 a(float f7, float f10) {
        h8 h8Var;
        g8 g8Var = this.f33322b;
        if (g8Var.f33901n == null) {
            return null;
        }
        int i10 = g8Var.e;
        float measuredWidth = g8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < g8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (h8Var = (h8) g8Var.f33901n.get(i12, null)) != null) {
                return h8Var;
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
        final h8 a2;
        super.onLongPress(motionEvent);
        g8 g8Var = this.f33322b;
        j8 j8Var = g8Var.f33905x;
        if (j8Var.f34798e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                g8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = j8Var.f34811x;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            bo boVar = new bo(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, j8Var.getParentActivity(), j8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(j8Var.getParentActivity(), true, false);
            g1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final e8 f32065b;

                {
                    this.f32065b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.e5 e5Var;
                    org.telegram.ui.ActionBar.e5 e5Var2;
                    org.telegram.ui.ActionBar.e5 e5Var3;
                    org.telegram.ui.ActionBar.e5 e5Var4;
                    switch (r3) {
                        case 0:
                            e8 e8Var = this.f32065b;
                            j8 j8Var2 = e8Var.f33322b.f33905x;
                            e5Var = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                            if (e5Var != null) {
                                e5Var2 = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                if (e5Var2.getFragmentStack().size() >= 3) {
                                    e5Var3 = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                    List fragmentStack = e5Var3.getFragmentStack();
                                    e5Var4 = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(e5Var4.getFragmentStack().size() - 3);
                                    if (o2Var instanceof bo) {
                                        AndroidUtilities.runOnUIThread(new q1(e8Var, (bo) o2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            return;
                        default:
                            g8 g8Var2 = this.f32065b.f33322b;
                            j8 j8Var3 = g8Var2.f33905x;
                            int i10 = a2.h;
                            j8Var3.Q = i10;
                            j8Var3.P = i10;
                            j8Var3.G = true;
                            j8Var3.t0();
                            j8 j8Var4 = g8Var2.f33905x;
                            j8Var4.o0();
                            j8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
            if (j8Var.f34797d0) {
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(j8Var.getParentActivity(), false, false);
                g1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final e8 f32065b;

                    {
                        this.f32065b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.e5 e5Var;
                        org.telegram.ui.ActionBar.e5 e5Var2;
                        org.telegram.ui.ActionBar.e5 e5Var3;
                        org.telegram.ui.ActionBar.e5 e5Var4;
                        switch (r3) {
                            case 0:
                                e8 e8Var = this.f32065b;
                                j8 j8Var2 = e8Var.f33322b.f33905x;
                                e5Var = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                if (e5Var != null) {
                                    e5Var2 = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                    if (e5Var2.getFragmentStack().size() >= 3) {
                                        e5Var3 = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                        List fragmentStack = e5Var3.getFragmentStack();
                                        e5Var4 = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(e5Var4.getFragmentStack().size() - 3);
                                        if (o2Var instanceof bo) {
                                            AndroidUtilities.runOnUIThread(new q1(e8Var, (bo) o2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                j8Var2.finishPreviewFragment();
                                return;
                            default:
                                g8 g8Var2 = this.f32065b.f33322b;
                                j8 j8Var3 = g8Var2.f33905x;
                                int i10 = a2.h;
                                j8Var3.Q = i10;
                                j8Var3.P = i10;
                                j8Var3.G = true;
                                j8Var3.t0();
                                j8 j8Var4 = g8Var2.f33905x;
                                j8Var4.o0();
                                j8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(j8Var.getParentActivity(), false, true);
                g1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                g1Var3.setMinimumWidth(160);
                g1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final e8 f32691b;

                    {
                        this.f32691b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.e5 e5Var;
                        org.telegram.ui.ActionBar.e5 e5Var2;
                        org.telegram.ui.ActionBar.e5 e5Var3;
                        switch (r2) {
                            case 0:
                                e8 e8Var = this.f32691b;
                                j8 j8Var2 = e8Var.f33322b.f33905x;
                                e5Var = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                if (e5Var.getFragmentStack().size() >= 3) {
                                    e5Var2 = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                    List fragmentStack = e5Var2.getFragmentStack();
                                    e5Var3 = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(e5Var3.getFragmentStack().size() - 3);
                                    if (o2Var instanceof bo) {
                                        org.telegram.ui.Components.c5.r(j8Var2, 1, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.f34811x)), null, false, new d8(e8Var, (bo) o2Var), null);
                                    }
                                }
                                j8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f32691b.f33322b.f33905x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            j8Var.v = new ci.eb(this, this.f33321a, 10);
            j8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final e8 f32691b;

                {
                    this.f32691b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.e5 e5Var;
                    org.telegram.ui.ActionBar.e5 e5Var2;
                    org.telegram.ui.ActionBar.e5 e5Var3;
                    switch (r2) {
                        case 0:
                            e8 e8Var = this.f32691b;
                            j8 j8Var2 = e8Var.f33322b.f33905x;
                            e5Var = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                            if (e5Var.getFragmentStack().size() >= 3) {
                                e5Var2 = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                List fragmentStack = e5Var2.getFragmentStack();
                                e5Var3 = ((org.telegram.ui.ActionBar.o2) j8Var2).parentLayout;
                                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(e5Var3.getFragmentStack().size() - 3);
                                if (o2Var instanceof bo) {
                                    org.telegram.ui.Components.c5.r(j8Var2, 1, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.f34811x)), null, false, new d8(e8Var, (bo) o2Var), null);
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f32691b.f33322b.f33905x.finishPreviewFragment();
                            return;
                    }
                }
            });
            j8Var.v.setVisibility(8);
            j8Var.v.setFitsSystemWindows(true);
            j8.a0(j8Var).getOverlayContainerView().addView(j8Var.v, w7.x5.c(-1.0f, -1));
            j8.b0(j8Var);
            j8Var.presentFragmentAsPreviewWithMenu(boVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h8 a2;
        MessageObject messageObject;
        k2.c0 c0Var;
        g8 g8Var = this.f33322b;
        j8 j8Var = g8Var.f33905x;
        if (j8.V(j8Var) != null) {
            if (((j8Var.f34798e0 == 1 && g8Var.f33901n != null) || j8Var.f34800f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f34195a) != null && (c0Var = j8Var.M) != null) {
                if (j8Var.f34800f0 != null) {
                    ai.jc orCreateStoryViewer = j8Var.getOrCreateStoryViewer();
                    Context context = g8Var.getContext();
                    MessageObject messageObject2 = a2.f34195a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ai.d9 d9Var = j8Var.f34800f0;
                    g gVar = j8Var.f34801g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(d9Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, d9Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f34197c;
                    org.telegram.ui.Components.zu0 zu0Var = (org.telegram.ui.Components.zu0) c0Var.f13237b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < zu0Var.f30652t1[0].f26849a.size(); i12++) {
                        if (((MessageObject) zu0Var.f30652t1[0].f26849a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.st0 W = zu0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f27925x.h1(i11, 0);
                    } else {
                        zu0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    j8Var.finishFragment();
                }
            }
            if (g8Var.f33901n != null) {
                if (j8Var.G) {
                    h8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = j8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            j8Var.R = null;
                        }
                        int i13 = j8Var.P;
                        if (i13 == 0 && j8Var.Q == 0) {
                            int i14 = a10.h;
                            j8Var.Q = i14;
                            j8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && j8Var.Q == i15) {
                                j8Var.Q = 0;
                                j8Var.P = 0;
                            } else if (i13 == i15) {
                                j8Var.P = j8Var.Q;
                            } else {
                                int i16 = j8Var.Q;
                                if (i16 == i15) {
                                    j8Var.Q = i13;
                                } else if (i13 == i16) {
                                    if (i15 > i16) {
                                        j8Var.Q = i15;
                                    } else {
                                        j8Var.P = i15;
                                    }
                                } else {
                                    j8Var.Q = i15;
                                    j8Var.P = i15;
                                }
                            }
                        }
                        j8Var.t0();
                        j8Var.o0();
                        return false;
                    }
                } else {
                    h8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null && j8.W(j8Var) != null && j8.X(j8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) j8.Z(j8Var).getFragmentStack().get(j8.Y(j8Var).getFragmentStack().size() - 2);
                        if (o2Var instanceof bo) {
                            j8Var.finishFragment();
                            ((bo) o2Var).G9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && j8Var.N != null) {
                        j8Var.finishFragment();
                        j8Var.N.G9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
