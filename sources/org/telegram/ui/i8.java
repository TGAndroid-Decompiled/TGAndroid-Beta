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
public final class i8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f40165a;
    public final k8 f40166b;

    public i8(k8 k8Var, Context context) {
        this.f40166b = k8Var;
        this.f40165a = context;
    }

    public final l8 a(float f7, float f10) {
        l8 l8Var;
        k8 k8Var = this.f40166b;
        if (k8Var.f40818n == null) {
            return null;
        }
        int i10 = k8Var.e;
        float measuredWidth = k8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < k8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (l8Var = (l8) k8Var.f40818n.get(i12, null)) != null) {
                return l8Var;
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
        final l8 a2;
        super.onLongPress(motionEvent);
        k8 k8Var = this.f40166b;
        n8 n8Var = k8Var.f40822x;
        if (n8Var.f41781e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                k8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j10 = n8Var.f41799x;
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            un unVar = new un(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, n8Var.getParentActivity(), n8Var.getResourceProvider());
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, n8Var.getResourceProvider());
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(n8Var.getParentActivity(), true, false);
            g1Var.j(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final i8 f39298b;

                {
                    this.f39298b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.j5 j5Var;
                    org.telegram.ui.ActionBar.j5 j5Var2;
                    org.telegram.ui.ActionBar.j5 j5Var3;
                    org.telegram.ui.ActionBar.j5 j5Var4;
                    switch (r3) {
                        case 0:
                            i8 i8Var = this.f39298b;
                            n8 n8Var2 = i8Var.f40166b.f40822x;
                            j5Var = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                            if (j5Var != null) {
                                j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                if (j5Var2.getFragmentStack().size() >= 3) {
                                    j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                    List fragmentStack = j5Var3.getFragmentStack();
                                    j5Var4 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var4.getFragmentStack().size() - 3);
                                    if (r2Var instanceof un) {
                                        AndroidUtilities.runOnUIThread(new q1(i8Var, (un) r2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            n8Var2.finishPreviewFragment();
                            return;
                        default:
                            k8 k8Var2 = this.f39298b.f40166b;
                            n8 n8Var3 = k8Var2.f40822x;
                            int i10 = a2.h;
                            n8Var3.Q = i10;
                            n8Var3.P = i10;
                            n8Var3.G = true;
                            n8Var3.x0();
                            n8 n8Var4 = k8Var2.f40822x;
                            n8Var4.q0();
                            n8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
            if (n8Var.f41780d0) {
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(n8Var.getParentActivity(), false, false);
                g1Var2.j(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final i8 f39298b;

                    {
                        this.f39298b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.j5 j5Var;
                        org.telegram.ui.ActionBar.j5 j5Var2;
                        org.telegram.ui.ActionBar.j5 j5Var3;
                        org.telegram.ui.ActionBar.j5 j5Var4;
                        switch (r3) {
                            case 0:
                                i8 i8Var = this.f39298b;
                                n8 n8Var2 = i8Var.f40166b.f40822x;
                                j5Var = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                if (j5Var != null) {
                                    j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                    if (j5Var2.getFragmentStack().size() >= 3) {
                                        j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                        List fragmentStack = j5Var3.getFragmentStack();
                                        j5Var4 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var4.getFragmentStack().size() - 3);
                                        if (r2Var instanceof un) {
                                            AndroidUtilities.runOnUIThread(new q1(i8Var, (un) r2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                n8Var2.finishPreviewFragment();
                                return;
                            default:
                                k8 k8Var2 = this.f39298b.f40166b;
                                n8 n8Var3 = k8Var2.f40822x;
                                int i10 = a2.h;
                                n8Var3.Q = i10;
                                n8Var3.P = i10;
                                n8Var3.G = true;
                                n8Var3.x0();
                                n8 n8Var4 = k8Var2.f40822x;
                                n8Var4.q0();
                                n8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(n8Var.getParentActivity(), false, true);
                g1Var3.j(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                g1Var3.setMinimumWidth(160);
                g1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final i8 f39561b;

                    {
                        this.f39561b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.j5 j5Var;
                        org.telegram.ui.ActionBar.j5 j5Var2;
                        org.telegram.ui.ActionBar.j5 j5Var3;
                        switch (r2) {
                            case 0:
                                i8 i8Var = this.f39561b;
                                n8 n8Var2 = i8Var.f40166b.f40822x;
                                j5Var = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                if (j5Var.getFragmentStack().size() >= 3) {
                                    j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                    List fragmentStack = j5Var2.getFragmentStack();
                                    j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var3.getFragmentStack().size() - 3);
                                    if (r2Var instanceof un) {
                                        org.telegram.ui.Components.g5.q(n8Var2, 1, n8Var2.getMessagesController().getUser(Long.valueOf(n8Var2.f41799x)), null, false, new h8(i8Var, (un) r2Var), null);
                                    }
                                }
                                n8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f39561b.f40166b.f40822x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            n8Var.v = new bi.cc(this, this.f40165a, 10);
            n8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final i8 f39561b;

                {
                    this.f39561b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.j5 j5Var;
                    org.telegram.ui.ActionBar.j5 j5Var2;
                    org.telegram.ui.ActionBar.j5 j5Var3;
                    switch (r2) {
                        case 0:
                            i8 i8Var = this.f39561b;
                            n8 n8Var2 = i8Var.f40166b.f40822x;
                            j5Var = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                            if (j5Var.getFragmentStack().size() >= 3) {
                                j5Var2 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                List fragmentStack = j5Var2.getFragmentStack();
                                j5Var3 = ((org.telegram.ui.ActionBar.r2) n8Var2).parentLayout;
                                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(j5Var3.getFragmentStack().size() - 3);
                                if (r2Var instanceof un) {
                                    org.telegram.ui.Components.g5.q(n8Var2, 1, n8Var2.getMessagesController().getUser(Long.valueOf(n8Var2.f41799x)), null, false, new h8(i8Var, (un) r2Var), null);
                                }
                            }
                            n8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f39561b.f40166b.f40822x.finishPreviewFragment();
                            return;
                    }
                }
            });
            n8Var.v.setVisibility(8);
            n8Var.v.setFitsSystemWindows(true);
            n8.c0(n8Var).getOverlayContainerView().addView(n8Var.v, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            n8.d0(n8Var);
            n8Var.presentFragmentAsPreviewWithMenu(unVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l8 a2;
        MessageObject messageObject;
        li.h5 h5Var;
        k8 k8Var = this.f40166b;
        n8 n8Var = k8Var.f40822x;
        if (n8.X(n8Var) != null) {
            if (((n8Var.f41781e0 == 1 && k8Var.f40818n != null) || n8Var.f41783f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f41162a) != null && (h5Var = n8Var.M) != null) {
                if (n8Var.f41783f0 != null) {
                    di.y9 orCreateStoryViewer = n8Var.getOrCreateStoryViewer();
                    Context context = k8Var.getContext();
                    MessageObject messageObject2 = a2.f41162a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    di.z6 z6Var = n8Var.f41783f0;
                    f fVar = n8Var.f41784g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(z6Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, z6Var, null, fVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f41164c;
                    org.telegram.ui.Components.aw0 aw0Var = (org.telegram.ui.Components.aw0) h5Var.f17285a;
                    org.telegram.ui.Components.pv0[] pv0VarArr = aw0Var.f26696v1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < pv0VarArr[0].f31704a.size(); i12++) {
                        if (((MessageObject) pv0VarArr[0].f31704a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.tu0 d02 = aw0Var.d0(0);
                    if (i11 >= 0 && d02 != null) {
                        d02.f33160w.h1(i11, 0);
                    } else {
                        aw0Var.G0(0, id3, i10, true);
                    }
                    if (d02 != null) {
                        d02.I = id3;
                        d02.J = false;
                    }
                    n8Var.finishFragment();
                }
            }
            if (k8Var.f40818n != null) {
                if (n8Var.G) {
                    l8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = n8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            n8Var.R = null;
                        }
                        int i13 = n8Var.P;
                        if (i13 == 0 && n8Var.Q == 0) {
                            int i14 = a10.h;
                            n8Var.Q = i14;
                            n8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && n8Var.Q == i15) {
                                n8Var.Q = 0;
                                n8Var.P = 0;
                            } else if (i13 == i15) {
                                n8Var.P = n8Var.Q;
                            } else {
                                int i16 = n8Var.Q;
                                if (i16 == i15) {
                                    n8Var.Q = i13;
                                } else if (i13 == i16) {
                                    if (i15 > i16) {
                                        n8Var.Q = i15;
                                    } else {
                                        n8Var.P = i15;
                                    }
                                } else {
                                    n8Var.Q = i15;
                                    n8Var.P = i15;
                                }
                            }
                        }
                        n8Var.x0();
                        n8Var.q0();
                        return false;
                    }
                } else {
                    l8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null && n8.Y(n8Var) != null && n8.Z(n8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) n8.b0(n8Var).getFragmentStack().get(n8.a0(n8Var).getFragmentStack().size() - 2);
                        if (r2Var instanceof un) {
                            n8Var.finishFragment();
                            ((un) r2Var).P9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && n8Var.N != null) {
                        n8Var.finishFragment();
                        n8Var.N.P9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
