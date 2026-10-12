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
    public final Context f37029a;
    public final g8 f37030b;

    public e8(g8 g8Var, Context context) {
        this.f37030b = g8Var;
        this.f37029a = context;
    }

    public final h8 a(float f7, float f10) {
        h8 h8Var;
        g8 g8Var = this.f37030b;
        if (g8Var.f37970n == null) {
            return null;
        }
        int i10 = g8Var.f37968e;
        float measuredWidth = g8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < g8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (h8Var = (h8) g8Var.f37970n.get(i12, null)) != null) {
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
        g8 g8Var = this.f37030b;
        j8 j8Var = g8Var.f37974x;
        if (j8Var.f39134e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                g8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = j8Var.f39147x;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            eo eoVar = new eo(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, j8Var.getParentActivity(), j8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8));
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(j8Var.getParentActivity(), true, false);
            e1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) {
                public final e8 f36105b;

                {
                    this.f36105b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    switch (r3) {
                        case 0:
                            e8 e8Var = this.f36105b;
                            j8 j8Var2 = e8Var.f37030b.f37974x;
                            b5Var = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                            if (b5Var != null) {
                                b5Var2 = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                if (b5Var2.getFragmentStack().size() >= 3) {
                                    b5Var3 = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                    List fragmentStack = b5Var3.getFragmentStack();
                                    b5Var4 = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                    if (m2Var instanceof eo) {
                                        AndroidUtilities.runOnUIThread(new r1(e8Var, (eo) m2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            return;
                        default:
                            g8 g8Var2 = this.f36105b.f37030b;
                            j8 j8Var3 = g8Var2.f37974x;
                            int i10 = a2.h;
                            j8Var3.Q = i10;
                            j8Var3.P = i10;
                            j8Var3.G = true;
                            j8Var3.t0();
                            j8 j8Var4 = g8Var2.f37974x;
                            j8Var4.o0();
                            j8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
            if (j8Var.f39132d0) {
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(j8Var.getParentActivity(), false, false);
                e1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                e1Var2.setMinimumWidth(160);
                e1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final e8 f36105b;

                    {
                        this.f36105b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        org.telegram.ui.ActionBar.b5 b5Var4;
                        switch (r3) {
                            case 0:
                                e8 e8Var = this.f36105b;
                                j8 j8Var2 = e8Var.f37030b.f37974x;
                                b5Var = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                if (b5Var != null) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                    if (b5Var2.getFragmentStack().size() >= 3) {
                                        b5Var3 = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                        List fragmentStack = b5Var3.getFragmentStack();
                                        b5Var4 = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                        if (m2Var instanceof eo) {
                                            AndroidUtilities.runOnUIThread(new r1(e8Var, (eo) m2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                j8Var2.finishPreviewFragment();
                                return;
                            default:
                                g8 g8Var2 = this.f36105b.f37030b;
                                j8 j8Var3 = g8Var2.f37974x;
                                int i10 = a2.h;
                                j8Var3.Q = i10;
                                j8Var3.P = i10;
                                j8Var3.G = true;
                                j8Var3.t0();
                                j8 j8Var4 = g8Var2.f37974x;
                                j8Var4.o0();
                                j8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(j8Var.getParentActivity(), false, true);
                e1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                e1Var3.setMinimumWidth(160);
                e1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final e8 f36367b;

                    {
                        this.f36367b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        switch (r2) {
                            case 0:
                                e8 e8Var = this.f36367b;
                                j8 j8Var2 = e8Var.f37030b.f37974x;
                                b5Var = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                if (b5Var.getFragmentStack().size() >= 3) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                    List fragmentStack = b5Var2.getFragmentStack();
                                    b5Var3 = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                    if (m2Var instanceof eo) {
                                        org.telegram.ui.Components.g5.q(j8Var2, 1, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.f39147x)), null, false, new d8(e8Var, (eo) m2Var), null);
                                    }
                                }
                                j8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f36367b.f37030b.f37974x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            j8Var.v = new ci.bb(this, this.f37029a, 10);
            j8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final e8 f36367b;

                {
                    this.f36367b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    switch (r2) {
                        case 0:
                            e8 e8Var = this.f36367b;
                            j8 j8Var2 = e8Var.f37030b.f37974x;
                            b5Var = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                            if (b5Var.getFragmentStack().size() >= 3) {
                                b5Var2 = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                List fragmentStack = b5Var2.getFragmentStack();
                                b5Var3 = ((org.telegram.ui.ActionBar.m2) j8Var2).parentLayout;
                                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                if (m2Var instanceof eo) {
                                    org.telegram.ui.Components.g5.q(j8Var2, 1, j8Var2.getMessagesController().getUser(Long.valueOf(j8Var2.f39147x)), null, false, new d8(e8Var, (eo) m2Var), null);
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f36367b.f37030b.f37974x.finishPreviewFragment();
                            return;
                    }
                }
            });
            j8Var.v.setVisibility(8);
            j8Var.v.setFitsSystemWindows(true);
            j8.a0(j8Var).getOverlayContainerView().addView(j8Var.v, w7.w5.d(-1.0f, -1));
            j8.b0(j8Var);
            j8Var.presentFragmentAsPreviewWithMenu(eoVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h8 a2;
        MessageObject messageObject;
        k2.g0 g0Var;
        g8 g8Var = this.f37030b;
        j8 j8Var = g8Var.f37974x;
        if (j8.V(j8Var) != null) {
            if (((j8Var.f39134e0 == 1 && g8Var.f37970n != null) || j8Var.f39136f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f38278a) != null && (g0Var = j8Var.M) != null) {
                if (j8Var.f39136f0 != null) {
                    ai.kc orCreateStoryViewer = j8Var.getOrCreateStoryViewer();
                    Context context = g8Var.getContext();
                    MessageObject messageObject2 = a2.f38278a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ai.e9 e9Var = j8Var.f39136f0;
                    g gVar = j8Var.f39137g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(e9Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, e9Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f38280c;
                    org.telegram.ui.Components.hw0 hw0Var = (org.telegram.ui.Components.hw0) g0Var.f14467b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < hw0Var.f26953t1[0].f32552a.size(); i12++) {
                        if (((MessageObject) hw0Var.f26953t1[0].f32552a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.av0 W = hw0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f24491x.h1(i11, 0);
                    } else {
                        hw0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    j8Var.finishFragment();
                }
            }
            if (g8Var.f37970n != null) {
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
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) j8.Z(j8Var).getFragmentStack().get(j8.Y(j8Var).getFragmentStack().size() - 2);
                        if (m2Var instanceof eo) {
                            j8Var.finishFragment();
                            ((eo) m2Var).L9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && j8Var.N != null) {
                        j8Var.finishFragment();
                        j8Var.N.L9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
