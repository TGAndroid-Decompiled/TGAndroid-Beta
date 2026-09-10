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
    public final Context f31559a;
    public final e8 f31560b;

    public c8(e8 e8Var, Context context) {
        this.f31560b = e8Var;
        this.f31559a = context;
    }

    public final f8 a(float f7, float f10) {
        f8 f8Var;
        e8 e8Var = this.f31560b;
        if (e8Var.f32113n == null) {
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
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (f8Var = (f8) e8Var.f32113n.get(i12, null)) != null) {
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
        e8 e8Var = this.f31560b;
        h8 h8Var = e8Var.f32117x;
        if (h8Var.f33307e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                e8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = h8Var.f33320x;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            eo eoVar = new eo(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, h8Var.getParentActivity(), h8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(h8Var.getParentActivity(), true, false);
            g1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) {
                public final c8 f39219b;

                {
                    this.f39219b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f5 f5Var;
                    org.telegram.ui.ActionBar.f5 f5Var2;
                    org.telegram.ui.ActionBar.f5 f5Var3;
                    org.telegram.ui.ActionBar.f5 f5Var4;
                    switch (r3) {
                        case 0:
                            c8 c8Var = this.f39219b;
                            h8 h8Var2 = c8Var.f31560b.f32117x;
                            f5Var = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                            if (f5Var != null) {
                                f5Var2 = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                if (f5Var2.getFragmentStack().size() >= 3) {
                                    f5Var3 = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                    List fragmentStack = f5Var3.getFragmentStack();
                                    f5Var4 = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var4.getFragmentStack().size() - 3);
                                    if (p2Var instanceof eo) {
                                        AndroidUtilities.runOnUIThread(new s1(c8Var, (eo) p2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            return;
                        default:
                            e8 e8Var2 = this.f39219b.f31560b;
                            h8 h8Var3 = e8Var2.f32117x;
                            int i10 = a2.h;
                            h8Var3.Q = i10;
                            h8Var3.P = i10;
                            h8Var3.G = true;
                            h8Var3.t0();
                            h8 h8Var4 = e8Var2.f32117x;
                            h8Var4.o0();
                            h8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
            if (h8Var.f33306d0) {
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(h8Var.getParentActivity(), false, false);
                g1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final c8 f39219b;

                    {
                        this.f39219b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.f5 f5Var;
                        org.telegram.ui.ActionBar.f5 f5Var2;
                        org.telegram.ui.ActionBar.f5 f5Var3;
                        org.telegram.ui.ActionBar.f5 f5Var4;
                        switch (r3) {
                            case 0:
                                c8 c8Var = this.f39219b;
                                h8 h8Var2 = c8Var.f31560b.f32117x;
                                f5Var = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                if (f5Var != null) {
                                    f5Var2 = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                    if (f5Var2.getFragmentStack().size() >= 3) {
                                        f5Var3 = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                        List fragmentStack = f5Var3.getFragmentStack();
                                        f5Var4 = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var4.getFragmentStack().size() - 3);
                                        if (p2Var instanceof eo) {
                                            AndroidUtilities.runOnUIThread(new s1(c8Var, (eo) p2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                h8Var2.finishPreviewFragment();
                                return;
                            default:
                                e8 e8Var2 = this.f39219b.f31560b;
                                h8 h8Var3 = e8Var2.f32117x;
                                int i10 = a2.h;
                                h8Var3.Q = i10;
                                h8Var3.P = i10;
                                h8Var3.G = true;
                                h8Var3.t0();
                                h8 h8Var4 = e8Var2.f32117x;
                                h8Var4.o0();
                                h8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(h8Var.getParentActivity(), false, true);
                g1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                g1Var3.setMinimumWidth(160);
                g1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final c8 f30823b;

                    {
                        this.f30823b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.f5 f5Var;
                        org.telegram.ui.ActionBar.f5 f5Var2;
                        org.telegram.ui.ActionBar.f5 f5Var3;
                        switch (r2) {
                            case 0:
                                c8 c8Var = this.f30823b;
                                h8 h8Var2 = c8Var.f31560b.f32117x;
                                f5Var = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                if (f5Var.getFragmentStack().size() >= 3) {
                                    f5Var2 = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                    List fragmentStack = f5Var2.getFragmentStack();
                                    f5Var3 = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var3.getFragmentStack().size() - 3);
                                    if (p2Var instanceof eo) {
                                        org.telegram.ui.Components.d5.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f33320x)), null, false, new b8(c8Var, (eo) p2Var), null);
                                    }
                                }
                                h8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f30823b.f31560b.f32117x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            h8Var.v = new bi.nc(this, this.f31559a, 10);
            h8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final c8 f30823b;

                {
                    this.f30823b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.f5 f5Var;
                    org.telegram.ui.ActionBar.f5 f5Var2;
                    org.telegram.ui.ActionBar.f5 f5Var3;
                    switch (r2) {
                        case 0:
                            c8 c8Var = this.f30823b;
                            h8 h8Var2 = c8Var.f31560b.f32117x;
                            f5Var = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                            if (f5Var.getFragmentStack().size() >= 3) {
                                f5Var2 = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                List fragmentStack = f5Var2.getFragmentStack();
                                f5Var3 = ((org.telegram.ui.ActionBar.p2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(f5Var3.getFragmentStack().size() - 3);
                                if (p2Var instanceof eo) {
                                    org.telegram.ui.Components.d5.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f33320x)), null, false, new b8(c8Var, (eo) p2Var), null);
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f30823b.f31560b.f32117x.finishPreviewFragment();
                            return;
                    }
                }
            });
            h8Var.v.setVisibility(8);
            h8Var.v.setFitsSystemWindows(true);
            h8.a0(h8Var).getOverlayContainerView().addView(h8Var.v, w7.a6.c(-1.0f, -1));
            h8.b0(h8Var);
            h8Var.presentFragmentAsPreviewWithMenu(eoVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f8 a2;
        MessageObject messageObject;
        l2.g gVar;
        e8 e8Var = this.f31560b;
        h8 h8Var = e8Var.f32117x;
        if (h8.V(h8Var) != null) {
            if (((h8Var.f33307e0 == 1 && e8Var.f32113n != null) || h8Var.f33309f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f32703a) != null && (gVar = h8Var.M) != null) {
                if (h8Var.f33309f0 != null) {
                    zh.u7 orCreateStoryViewer = h8Var.getOrCreateStoryViewer();
                    Context context = e8Var.getContext();
                    MessageObject messageObject2 = a2.f32703a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    zh.a5 a5Var = h8Var.f33309f0;
                    g gVar2 = h8Var.f33310g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(a5Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.F(context, storyItem, arrayList, 0, a5Var, null, gVar2, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f32705c;
                    org.telegram.ui.Components.iv0 iv0Var = (org.telegram.ui.Components.iv0) gVar.f12719b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < iv0Var.f24127t1[0].f29156a.size(); i12++) {
                        if (((MessageObject) iv0Var.f24127t1[0].f29156a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.au0 W = iv0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f21598x.h1(i11, 0);
                    } else {
                        iv0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    h8Var.finishFragment();
                }
            }
            if (e8Var.f32113n != null) {
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
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) h8.Z(h8Var).getFragmentStack().get(h8.Y(h8Var).getFragmentStack().size() - 2);
                        if (p2Var instanceof eo) {
                            h8Var.finishFragment();
                            ((eo) p2Var).G9(a11.h);
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
