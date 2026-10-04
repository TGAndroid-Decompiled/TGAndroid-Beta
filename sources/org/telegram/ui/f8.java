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
    public final Context f36211a;
    public final h8 f36212b;

    public f8(h8 h8Var, Context context) {
        this.f36212b = h8Var;
        this.f36211a = context;
    }

    public final i8 a(float f7, float f10) {
        i8 i8Var;
        h8 h8Var = this.f36212b;
        if (h8Var.f36994n == null) {
            return null;
        }
        int i10 = h8Var.f36992e;
        float measuredWidth = h8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < h8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (i8Var = (i8) h8Var.f36994n.get(i12, null)) != null) {
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
        h8 h8Var = this.f36212b;
        k8 k8Var = h8Var.f36998x;
        if (k8Var.f37861e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                h8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = k8Var.f37876x;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            yn ynVar = new yn(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, k8Var.getParentActivity(), k8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(k8Var.getParentActivity(), true, false);
            f1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            f1Var.setMinimumWidth(160);
            f1Var.setOnClickListener(new View.OnClickListener(this) {
                public final f8 f35358b;

                {
                    this.f35358b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.c5 c5Var;
                    org.telegram.ui.ActionBar.c5 c5Var2;
                    org.telegram.ui.ActionBar.c5 c5Var3;
                    org.telegram.ui.ActionBar.c5 c5Var4;
                    switch (r3) {
                        case 0:
                            f8 f8Var = this.f35358b;
                            k8 k8Var2 = f8Var.f36212b.f36998x;
                            c5Var = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                            if (c5Var != null) {
                                c5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                if (c5Var2.getFragmentStack().size() >= 3) {
                                    c5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                    List fragmentStack = c5Var3.getFragmentStack();
                                    c5Var4 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(c5Var4.getFragmentStack().size() - 3);
                                    if (n2Var instanceof yn) {
                                        AndroidUtilities.runOnUIThread(new r1(f8Var, (yn) n2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            k8Var2.finishPreviewFragment();
                            return;
                        default:
                            h8 h8Var2 = this.f35358b.f36212b;
                            k8 k8Var3 = h8Var2.f36998x;
                            int i10 = a2.h;
                            k8Var3.Q = i10;
                            k8Var3.P = i10;
                            k8Var3.G = true;
                            k8Var3.t0();
                            k8 k8Var4 = h8Var2.f36998x;
                            k8Var4.o0();
                            k8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
            if (k8Var.f37859d0) {
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(k8Var.getParentActivity(), false, false);
                f1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                f1Var2.setMinimumWidth(160);
                f1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final f8 f35358b;

                    {
                        this.f35358b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.c5 c5Var;
                        org.telegram.ui.ActionBar.c5 c5Var2;
                        org.telegram.ui.ActionBar.c5 c5Var3;
                        org.telegram.ui.ActionBar.c5 c5Var4;
                        switch (r3) {
                            case 0:
                                f8 f8Var = this.f35358b;
                                k8 k8Var2 = f8Var.f36212b.f36998x;
                                c5Var = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                if (c5Var != null) {
                                    c5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                    if (c5Var2.getFragmentStack().size() >= 3) {
                                        c5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                        List fragmentStack = c5Var3.getFragmentStack();
                                        c5Var4 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(c5Var4.getFragmentStack().size() - 3);
                                        if (n2Var instanceof yn) {
                                            AndroidUtilities.runOnUIThread(new r1(f8Var, (yn) n2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                k8Var2.finishPreviewFragment();
                                return;
                            default:
                                h8 h8Var2 = this.f35358b.f36212b;
                                k8 k8Var3 = h8Var2.f36998x;
                                int i10 = a2.h;
                                k8Var3.Q = i10;
                                k8Var3.P = i10;
                                k8Var3.G = true;
                                k8Var3.t0();
                                k8 k8Var4 = h8Var2.f36998x;
                                k8Var4.o0();
                                k8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
                org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(k8Var.getParentActivity(), false, true);
                f1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                f1Var3.setMinimumWidth(160);
                f1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final f8 f35694b;

                    {
                        this.f35694b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.c5 c5Var;
                        org.telegram.ui.ActionBar.c5 c5Var2;
                        org.telegram.ui.ActionBar.c5 c5Var3;
                        switch (r2) {
                            case 0:
                                f8 f8Var = this.f35694b;
                                k8 k8Var2 = f8Var.f36212b.f36998x;
                                c5Var = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                if (c5Var.getFragmentStack().size() >= 3) {
                                    c5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                    List fragmentStack = c5Var2.getFragmentStack();
                                    c5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(c5Var3.getFragmentStack().size() - 3);
                                    if (n2Var instanceof yn) {
                                        org.telegram.ui.Components.e5.r(k8Var2, 1, k8Var2.getMessagesController().getUser(Long.valueOf(k8Var2.f37876x)), null, false, new e8(f8Var, (yn) n2Var), null);
                                    }
                                }
                                k8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f35694b.f36212b.f36998x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            k8Var.v = new ci.ab(this, this.f36211a, 10);
            k8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final f8 f35694b;

                {
                    this.f35694b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.c5 c5Var;
                    org.telegram.ui.ActionBar.c5 c5Var2;
                    org.telegram.ui.ActionBar.c5 c5Var3;
                    switch (r2) {
                        case 0:
                            f8 f8Var = this.f35694b;
                            k8 k8Var2 = f8Var.f36212b.f36998x;
                            c5Var = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                            if (c5Var.getFragmentStack().size() >= 3) {
                                c5Var2 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                List fragmentStack = c5Var2.getFragmentStack();
                                c5Var3 = ((org.telegram.ui.ActionBar.n2) k8Var2).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(c5Var3.getFragmentStack().size() - 3);
                                if (n2Var instanceof yn) {
                                    org.telegram.ui.Components.e5.r(k8Var2, 1, k8Var2.getMessagesController().getUser(Long.valueOf(k8Var2.f37876x)), null, false, new e8(f8Var, (yn) n2Var), null);
                                }
                            }
                            k8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f35694b.f36212b.f36998x.finishPreviewFragment();
                            return;
                    }
                }
            });
            k8Var.v.setVisibility(8);
            k8Var.v.setFitsSystemWindows(true);
            k8.Z(k8Var).getOverlayContainerView().addView(k8Var.v, w7.z5.c(-1.0f, -1));
            k8.b0(k8Var);
            k8Var.presentFragmentAsPreviewWithMenu(ynVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i8 a2;
        MessageObject messageObject;
        l2.g gVar;
        h8 h8Var = this.f36212b;
        k8 k8Var = h8Var.f36998x;
        if (k8.T(k8Var) != null) {
            if (((k8Var.f37861e0 == 1 && h8Var.f36994n != null) || k8Var.f37863f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f37297a) != null && (gVar = k8Var.M) != null) {
                if (k8Var.f37863f0 != null) {
                    ai.jc orCreateStoryViewer = k8Var.getOrCreateStoryViewer();
                    Context context = h8Var.getContext();
                    MessageObject messageObject2 = a2.f37297a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ai.d9 d9Var = k8Var.f37863f0;
                    g gVar2 = k8Var.f37864g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(d9Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, d9Var, null, gVar2, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f37299c;
                    org.telegram.ui.Components.pv0 pv0Var = (org.telegram.ui.Components.pv0) gVar.f15267b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < pv0Var.f29797t1[0].f26139a.size(); i12++) {
                        if (((MessageObject) pv0Var.f29797t1[0].f26139a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.iu0 W = pv0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f27505x.h1(i11, 0);
                    } else {
                        pv0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    k8Var.finishFragment();
                }
            }
            if (h8Var.f36994n != null) {
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
                    if (a11 != null && k8.U(k8Var) != null && k8.W(k8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) k8.Y(k8Var).getFragmentStack().get(k8.X(k8Var).getFragmentStack().size() - 2);
                        if (n2Var instanceof yn) {
                            k8Var.finishFragment();
                            ((yn) n2Var).F9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && k8Var.N != null) {
                        k8Var.finishFragment();
                        k8Var.N.F9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
