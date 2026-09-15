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
public final class c8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f32708a;
    public final e8 f32709b;

    public c8(e8 e8Var, Context context) {
        this.f32709b = e8Var;
        this.f32708a = context;
    }

    public final f8 a(float f7, float f10) {
        f8 f8Var;
        e8 e8Var = this.f32709b;
        if (e8Var.f33265n == null) {
            return null;
        }
        int i10 = e8Var.e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < e8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (f8Var = (f8) e8Var.f33265n.get(i12, null)) != null) {
                return f8Var;
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
        final f8 a2;
        super.onLongPress(motionEvent);
        e8 e8Var = this.f32709b;
        h8 h8Var = e8Var.f33269x;
        if (h8Var.f34194e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                e8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = h8Var.f34207x;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            bo boVar = new bo(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, h8Var.getParentActivity(), h8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.i6.G8));
            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), true, false);
            f1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            f1Var.setMinimumWidth(160);
            f1Var.setOnClickListener(new View.OnClickListener(this) {
                public final c8 f40097b;

                {
                    this.f40097b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.d5 d5Var;
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    org.telegram.ui.ActionBar.d5 d5Var4;
                    switch (r3) {
                        case 0:
                            c8 c8Var = this.f40097b;
                            h8 h8Var2 = c8Var.f32709b.f33269x;
                            d5Var = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            if (d5Var != null) {
                                d5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                if (d5Var2.getFragmentStack().size() >= 3) {
                                    d5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                    List fragmentStack = d5Var3.getFragmentStack();
                                    d5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 3);
                                    if (n2Var instanceof bo) {
                                        AndroidUtilities.runOnUIThread(new q1(c8Var, (bo) n2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            return;
                        default:
                            e8 e8Var2 = this.f40097b.f32709b;
                            h8 h8Var3 = e8Var2.f33269x;
                            int i10 = a2.h;
                            h8Var3.Q = i10;
                            h8Var3.P = i10;
                            h8Var3.G = true;
                            h8Var3.t0();
                            h8 h8Var4 = e8Var2.f33269x;
                            h8Var4.o0();
                            h8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
            if (h8Var.f34193d0) {
                org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), false, false);
                f1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                f1Var2.setMinimumWidth(160);
                f1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final c8 f40097b;

                    {
                        this.f40097b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.d5 d5Var;
                        org.telegram.ui.ActionBar.d5 d5Var2;
                        org.telegram.ui.ActionBar.d5 d5Var3;
                        org.telegram.ui.ActionBar.d5 d5Var4;
                        switch (r3) {
                            case 0:
                                c8 c8Var = this.f40097b;
                                h8 h8Var2 = c8Var.f32709b.f33269x;
                                d5Var = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                if (d5Var != null) {
                                    d5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                    if (d5Var2.getFragmentStack().size() >= 3) {
                                        d5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                        List fragmentStack = d5Var3.getFragmentStack();
                                        d5Var4 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var4.getFragmentStack().size() - 3);
                                        if (n2Var instanceof bo) {
                                            AndroidUtilities.runOnUIThread(new q1(c8Var, (bo) n2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                h8Var2.finishPreviewFragment();
                                return;
                            default:
                                e8 e8Var2 = this.f40097b.f32709b;
                                h8 h8Var3 = e8Var2.f33269x;
                                int i10 = a2.h;
                                h8Var3.Q = i10;
                                h8Var3.P = i10;
                                h8Var3.G = true;
                                h8Var3.t0();
                                h8 h8Var4 = e8Var2.f33269x;
                                h8Var4.o0();
                                h8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
                org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), false, true);
                f1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                f1Var3.setMinimumWidth(160);
                f1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final c8 f31720b;

                    {
                        this.f31720b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.d5 d5Var;
                        org.telegram.ui.ActionBar.d5 d5Var2;
                        org.telegram.ui.ActionBar.d5 d5Var3;
                        switch (r2) {
                            case 0:
                                c8 c8Var = this.f31720b;
                                h8 h8Var2 = c8Var.f32709b.f33269x;
                                d5Var = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                if (d5Var.getFragmentStack().size() >= 3) {
                                    d5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                    List fragmentStack = d5Var2.getFragmentStack();
                                    d5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var3.getFragmentStack().size() - 3);
                                    if (n2Var instanceof bo) {
                                        org.telegram.ui.Components.c5.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f34207x)), null, false, new b8(c8Var, (bo) n2Var), null);
                                    }
                                }
                                h8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f31720b.f32709b.f33269x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            h8Var.v = new ci.eb(this, this.f32708a, 10);
            h8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final c8 f31720b;

                {
                    this.f31720b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.d5 d5Var;
                    org.telegram.ui.ActionBar.d5 d5Var2;
                    org.telegram.ui.ActionBar.d5 d5Var3;
                    switch (r2) {
                        case 0:
                            c8 c8Var = this.f31720b;
                            h8 h8Var2 = c8Var.f32709b.f33269x;
                            d5Var = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                            if (d5Var.getFragmentStack().size() >= 3) {
                                d5Var2 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                List fragmentStack = d5Var2.getFragmentStack();
                                d5Var3 = ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(d5Var3.getFragmentStack().size() - 3);
                                if (n2Var instanceof bo) {
                                    org.telegram.ui.Components.c5.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f34207x)), null, false, new b8(c8Var, (bo) n2Var), null);
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f31720b.f32709b.f33269x.finishPreviewFragment();
                            return;
                    }
                }
            });
            h8Var.v.setVisibility(8);
            h8Var.v.setFitsSystemWindows(true);
            h8.a0(h8Var).getOverlayContainerView().addView(h8Var.v, w7.x5.c(-1.0f, -1));
            h8.b0(h8Var);
            h8Var.presentFragmentAsPreviewWithMenu(boVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f8 a2;
        MessageObject messageObject;
        k2.c0 c0Var;
        e8 e8Var = this.f32709b;
        h8 h8Var = e8Var.f33269x;
        if (h8.V(h8Var) != null) {
            if (((h8Var.f34194e0 == 1 && e8Var.f33265n != null) || h8Var.f34196f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f33499a) != null && (c0Var = h8Var.M) != null) {
                if (h8Var.f34196f0 != null) {
                    ai.jc orCreateStoryViewer = h8Var.getOrCreateStoryViewer();
                    Context context = e8Var.getContext();
                    MessageObject messageObject2 = a2.f33499a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    ai.d9 d9Var = h8Var.f34196f0;
                    g gVar = h8Var.f34197g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(d9Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, d9Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f33501c;
                    org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) c0Var.f13234b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < yu0Var.f30388t1[0].f26576a.size(); i12++) {
                        if (((MessageObject) yu0Var.f30388t1[0].f26576a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.rt0 W = yu0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f27691x.h1(i11, 0);
                    } else {
                        yu0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    h8Var.finishFragment();
                }
            }
            if (e8Var.f33265n != null) {
                if (h8Var.G) {
                    f8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = h8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h8Var.R = null;
                        }
                        int i13 = h8Var.P;
                        if (i13 == 0 && h8Var.Q == 0) {
                            int i14 = a10.h;
                            h8Var.Q = i14;
                            h8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && h8Var.Q == i15) {
                                h8Var.Q = 0;
                                h8Var.P = 0;
                            } else if (i13 == i15) {
                                h8Var.P = h8Var.Q;
                            } else {
                                int i16 = h8Var.Q;
                                if (i16 == i15) {
                                    h8Var.Q = i13;
                                } else if (i13 == i16) {
                                    if (i15 > i16) {
                                        h8Var.Q = i15;
                                    } else {
                                        h8Var.P = i15;
                                    }
                                } else {
                                    h8Var.Q = i15;
                                    h8Var.P = i15;
                                }
                            }
                        }
                        h8Var.t0();
                        h8Var.o0();
                        return false;
                    }
                } else {
                    f8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null && h8.W(h8Var) != null && h8.X(h8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) h8.Z(h8Var).getFragmentStack().get(h8.Y(h8Var).getFragmentStack().size() - 2);
                        if (n2Var instanceof bo) {
                            h8Var.finishFragment();
                            ((bo) n2Var).G9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && h8Var.N != null) {
                        h8Var.finishFragment();
                        h8Var.N.G9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
