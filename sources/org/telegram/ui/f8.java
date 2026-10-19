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
public final class f8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f36911a;
    public final h8 f36912b;

    public f8(h8 h8Var, Context context) {
        this.f36912b = h8Var;
        this.f36911a = context;
    }

    public final i8 a(float f7, float f10) {
        i8 i8Var;
        h8 h8Var = this.f36912b;
        if (h8Var.f37553n == null) {
            return null;
        }
        int i10 = h8Var.e;
        float measuredWidth = h8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < h8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (i8Var = (i8) h8Var.f37553n.get(i12, null)) != null) {
                return i8Var;
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
        final i8 a2;
        super.onLongPress(motionEvent);
        h8 h8Var = this.f36912b;
        k8 k8Var = h8Var.f37557x;
        if (k8Var.f38439e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                h8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j10 = k8Var.f38452x;
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            qn qnVar = new qn(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, k8Var.getParentActivity(), k8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(k8Var.getParentActivity(), true, false);
            e1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) {
                public final f8 f35860b;

                {
                    this.f35860b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.d5 d5Var;
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    org.telegram.ui.ActionBar.d5 d5Var4;
                    switch (r3) {
                        case 0:
                            f8 f8Var = this.f35860b;
                            k8 k8Var2 = f8Var.f36912b.f37557x;
                            d5Var = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                            if (d5Var != null) {
                                d5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                if (d5Var2.getFragmentStack().size() >= 3) {
                                    d5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                    List fragmentStack = d5Var3.getFragmentStack();
                                    d5Var4 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 3);
                                    if (n2Var instanceof qn) {
                                        AndroidUtilities.runOnUIThread(new t1(f8Var, (qn) n2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            k8Var2.finishPreviewFragment();
                            return;
                        default:
                            h8 h8Var2 = this.f35860b.f36912b;
                            k8 k8Var3 = h8Var2.f37557x;
                            int i10 = a2.h;
                            k8Var3.Q = i10;
                            k8Var3.P = i10;
                            k8Var3.G = true;
                            k8Var3.t0();
                            k8 k8Var4 = h8Var2.f37557x;
                            k8Var4.o0();
                            k8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
            if (k8Var.f38438d0) {
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(k8Var.getParentActivity(), false, false);
                e1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                e1Var2.setMinimumWidth(160);
                e1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final f8 f35860b;

                    {
                        this.f35860b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.d5 d5Var;
                        org.telegram.ui.ActionBar.d5 d5Var2;
                        org.telegram.ui.ActionBar.d5 d5Var3;
                        org.telegram.ui.ActionBar.d5 d5Var4;
                        switch (r3) {
                            case 0:
                                f8 f8Var = this.f35860b;
                                k8 k8Var2 = f8Var.f36912b.f37557x;
                                d5Var = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                if (d5Var != null) {
                                    d5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                    if (d5Var2.getFragmentStack().size() >= 3) {
                                        d5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                        List fragmentStack = d5Var3.getFragmentStack();
                                        d5Var4 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 3);
                                        if (n2Var instanceof qn) {
                                            AndroidUtilities.runOnUIThread(new t1(f8Var, (qn) n2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                k8Var2.finishPreviewFragment();
                                return;
                            default:
                                h8 h8Var2 = this.f35860b.f36912b;
                                k8 k8Var3 = h8Var2.f37557x;
                                int i10 = a2.h;
                                k8Var3.Q = i10;
                                k8Var3.P = i10;
                                k8Var3.G = true;
                                k8Var3.t0();
                                k8 k8Var4 = h8Var2.f37557x;
                                k8Var4.o0();
                                k8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(k8Var.getParentActivity(), false, true);
                e1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                e1Var3.setMinimumWidth(160);
                e1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final f8 f36308b;

                    {
                        this.f36308b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.d5 d5Var;
                        org.telegram.ui.ActionBar.d5 d5Var2;
                        org.telegram.ui.ActionBar.d5 d5Var3;
                        switch (r2) {
                            case 0:
                                f8 f8Var = this.f36308b;
                                k8 k8Var2 = f8Var.f36912b.f37557x;
                                d5Var = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                if (d5Var.getFragmentStack().size() >= 3) {
                                    d5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                    List fragmentStack = d5Var2.getFragmentStack();
                                    d5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var3.getFragmentStack().size() - 3);
                                    if (n2Var instanceof qn) {
                                        org.telegram.ui.Components.f5.q(k8Var2, 1, k8Var2.getMessagesController().getUser(Long.valueOf(k8Var2.f38452x)), null, false, new e8(f8Var, (qn) n2Var), null);
                                    }
                                }
                                k8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f36308b.f36912b.f37557x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            k8Var.v = new ai.ic(this, this.f36911a, 11);
            k8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final f8 f36308b;

                {
                    this.f36308b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.d5 d5Var;
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    switch (r2) {
                        case 0:
                            f8 f8Var = this.f36308b;
                            k8 k8Var2 = f8Var.f36912b.f37557x;
                            d5Var = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                            if (d5Var.getFragmentStack().size() >= 3) {
                                d5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                List fragmentStack = d5Var2.getFragmentStack();
                                d5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var3.getFragmentStack().size() - 3);
                                if (n2Var instanceof qn) {
                                    org.telegram.ui.Components.f5.q(k8Var2, 1, k8Var2.getMessagesController().getUser(Long.valueOf(k8Var2.f38452x)), null, false, new e8(f8Var, (qn) n2Var), null);
                                }
                            }
                            k8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f36308b.f36912b.f37557x.finishPreviewFragment();
                            return;
                    }
                }
            });
            k8Var.v.setVisibility(8);
            k8Var.v.setFitsSystemWindows(true);
            k8.a0(k8Var).getOverlayContainerView().addView(k8Var.v, w7.z5.c(-1.0f, -1));
            k8.b0(k8Var);
            k8Var.presentFragmentAsPreviewWithMenu(qnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i8 a2;
        MessageObject messageObject;
        le.b bVar;
        h8 h8Var = this.f36912b;
        k8 k8Var = h8Var.f37557x;
        if (k8.V(k8Var) != null) {
            if (((k8Var.f38439e0 == 1 && h8Var.f37553n != null) || k8Var.f38441f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f37896a) != null && (bVar = k8Var.M) != null) {
                if (k8Var.f38441f0 != null) {
                    ci.aa orCreateStoryViewer = k8Var.getOrCreateStoryViewer();
                    Context context = h8Var.getContext();
                    MessageObject messageObject2 = a2.f37896a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ci.a7 a7Var = k8Var.f38441f0;
                    g gVar = k8Var.f38442g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(a7Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, a7Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f37898c;
                    org.telegram.ui.Components.tv0 tv0Var = (org.telegram.ui.Components.tv0) bVar.f16011b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < tv0Var.f30730t1[0].f27363a.size(); i12++) {
                        if (((MessageObject) tv0Var.f30730t1[0].f27363a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.mu0 W = tv0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f28614x.h1(i11, 0);
                    } else {
                        tv0Var.A0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    k8Var.finishFragment();
                }
            }
            if (h8Var.f37553n != null) {
                if (k8Var.G) {
                    i8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = k8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            k8Var.R = null;
                        }
                        int i13 = k8Var.P;
                        if (i13 == 0 && k8Var.Q == 0) {
                            int i14 = a10.h;
                            k8Var.Q = i14;
                            k8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && k8Var.Q == i15) {
                                k8Var.Q = 0;
                                k8Var.P = 0;
                            } else if (i13 == i15) {
                                k8Var.P = k8Var.Q;
                            } else {
                                int i16 = k8Var.Q;
                                if (i16 == i15) {
                                    k8Var.Q = i13;
                                } else if (i13 == i16) {
                                    if (i15 > i16) {
                                        k8Var.Q = i15;
                                    } else {
                                        k8Var.P = i15;
                                    }
                                } else {
                                    k8Var.Q = i15;
                                    k8Var.P = i15;
                                }
                            }
                        }
                        k8Var.t0();
                        k8Var.o0();
                        return false;
                    }
                } else {
                    i8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null && k8.W(k8Var) != null && k8.X(k8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) k8.Z(k8Var).getFragmentStack().get(k8.Y(k8Var).getFragmentStack().size() - 2);
                        if (n2Var instanceof qn) {
                            k8Var.finishFragment();
                            ((qn) n2Var).L9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && k8Var.N != null) {
                        k8Var.finishFragment();
                        k8Var.N.L9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
