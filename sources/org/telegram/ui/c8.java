package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f36220a;
    public final e8 f36221b;

    public c8(e8 e8Var, Context context) {
        this.f36221b = e8Var;
        this.f36220a = context;
    }

    public final f8 a(float f7, float f10) {
        f8 f8Var;
        e8 e8Var = this.f36221b;
        if (e8Var.f36770n == null) {
            return null;
        }
        int i10 = e8Var.e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.i0.L(52.0f);
        int L2 = org.telegram.messenger.i0.L(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < e8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float L3 = (L / 2.0f) + (i11 * L) + org.telegram.messenger.i0.L(44.0f);
            float f12 = L2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= L3 - f12 && f10 <= L3 + f12 && (f8Var = (f8) e8Var.f36770n.get(i12, null)) != null) {
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
        e8 e8Var = this.f36221b;
        h8 h8Var = e8Var.f36775y;
        if (h8Var.f37730e0 == 0 && !org.telegram.messenger.i0.Q1() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                e8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j10 = h8Var.f37749y;
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            un unVar = new un(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232561, 0, h8Var.getParentActivity(), h8Var.getResourceProvider());
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, h8Var.getResourceProvider());
            org.telegram.ui.ActionBar.b1 b1Var = new org.telegram.ui.ActionBar.b1(h8Var.getParentActivity(), true, false);
            b1Var.j(org.telegram.messenger.dd.L0(2131749075, null), 2131232223, null);
            b1Var.setMinimumWidth(160);
            b1Var.setOnClickListener(new View.OnClickListener(this) {
                public final c8 f35703b;

                {
                    this.f35703b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.z4 z4Var;
                    org.telegram.ui.ActionBar.z4 z4Var2;
                    org.telegram.ui.ActionBar.z4 z4Var3;
                    org.telegram.ui.ActionBar.z4 z4Var4;
                    switch (r3) {
                        case 0:
                            c8 c8Var = this.f35703b;
                            h8 h8Var2 = c8Var.f36221b.f36775y;
                            z4Var = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                            if (z4Var != null) {
                                z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                if (z4Var2.getFragmentStack().size() >= 3) {
                                    z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                    List fragmentStack = z4Var3.getFragmentStack();
                                    z4Var4 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var4.getFragmentStack().size() - 3);
                                    if (k2Var instanceof un) {
                                        org.telegram.messenger.i0.h3(new p1(c8Var, (un) k2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            return;
                        default:
                            e8 e8Var2 = this.f35703b.f36221b;
                            h8 h8Var3 = e8Var2.f36775y;
                            int i10 = a2.h;
                            h8Var3.Q = i10;
                            h8Var3.P = i10;
                            h8Var3.G = true;
                            h8Var3.B0();
                            h8 h8Var4 = e8Var2.f36775y;
                            h8Var4.u0();
                            h8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
            if (h8Var.f37729d0) {
                org.telegram.ui.ActionBar.b1 b1Var2 = new org.telegram.ui.ActionBar.b1(h8Var.getParentActivity(), false, false);
                b1Var2.j(org.telegram.messenger.dd.L0(2131745667, null), 2131232356, null);
                b1Var2.setMinimumWidth(160);
                b1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final c8 f35703b;

                    {
                        this.f35703b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.z4 z4Var;
                        org.telegram.ui.ActionBar.z4 z4Var2;
                        org.telegram.ui.ActionBar.z4 z4Var3;
                        org.telegram.ui.ActionBar.z4 z4Var4;
                        switch (r3) {
                            case 0:
                                c8 c8Var = this.f35703b;
                                h8 h8Var2 = c8Var.f36221b.f36775y;
                                z4Var = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                if (z4Var != null) {
                                    z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                    if (z4Var2.getFragmentStack().size() >= 3) {
                                        z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                        List fragmentStack = z4Var3.getFragmentStack();
                                        z4Var4 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var4.getFragmentStack().size() - 3);
                                        if (k2Var instanceof un) {
                                            org.telegram.messenger.i0.h3(new p1(c8Var, (un) k2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                h8Var2.finishPreviewFragment();
                                return;
                            default:
                                e8 e8Var2 = this.f35703b.f36221b;
                                h8 h8Var3 = e8Var2.f36775y;
                                int i10 = a2.h;
                                h8Var3.Q = i10;
                                h8Var3.P = i10;
                                h8Var3.G = true;
                                h8Var3.B0();
                                h8 h8Var4 = e8Var2.f36775y;
                                h8Var4.u0();
                                h8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var2);
                org.telegram.ui.ActionBar.b1 b1Var3 = new org.telegram.ui.ActionBar.b1(h8Var.getParentActivity(), false, true);
                b1Var3.j(org.telegram.messenger.dd.L0(2131752089, null), 2131232107, null);
                b1Var3.setMinimumWidth(160);
                b1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final c8 f35994b;

                    {
                        this.f35994b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.z4 z4Var;
                        org.telegram.ui.ActionBar.z4 z4Var2;
                        org.telegram.ui.ActionBar.z4 z4Var3;
                        switch (r2) {
                            case 0:
                                c8 c8Var = this.f35994b;
                                h8 h8Var2 = c8Var.f36221b.f36775y;
                                z4Var = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                if (z4Var.getFragmentStack().size() >= 3) {
                                    z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                    List fragmentStack = z4Var2.getFragmentStack();
                                    z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var3.getFragmentStack().size() - 3);
                                    if (k2Var instanceof un) {
                                        org.telegram.ui.Components.s4.q(h8Var2, 1, h8Var2.getMessagesController().Z1(Long.valueOf(h8Var2.f37749y)), null, false, new m5.e(c8Var, (un) k2Var, false, 10), null);
                                    }
                                }
                                h8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f35994b.f36221b.f36775y.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            h8Var.f37747w = new bi.t0(this, this.f36220a, 6);
            h8Var.f37747w.setOnClickListener(new View.OnClickListener(this) {
                public final c8 f35994b;

                {
                    this.f35994b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.z4 z4Var;
                    org.telegram.ui.ActionBar.z4 z4Var2;
                    org.telegram.ui.ActionBar.z4 z4Var3;
                    switch (r2) {
                        case 0:
                            c8 c8Var = this.f35994b;
                            h8 h8Var2 = c8Var.f36221b.f36775y;
                            z4Var = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                            if (z4Var.getFragmentStack().size() >= 3) {
                                z4Var2 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                List fragmentStack = z4Var2.getFragmentStack();
                                z4Var3 = ((org.telegram.ui.ActionBar.k2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var3.getFragmentStack().size() - 3);
                                if (k2Var instanceof un) {
                                    org.telegram.ui.Components.s4.q(h8Var2, 1, h8Var2.getMessagesController().Z1(Long.valueOf(h8Var2.f37749y)), null, false, new m5.e(c8Var, (un) k2Var, false, 10), null);
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f35994b.f36221b.f36775y.finishPreviewFragment();
                            return;
                    }
                }
            });
            h8Var.f37747w.setVisibility(8);
            h8Var.f37747w.setFitsSystemWindows(true);
            h8.g0(h8Var).getOverlayContainerView().addView(h8Var.f37747w, w7.b6.c(-1.0f, -1));
            h8.h0(h8Var);
            h8Var.presentFragmentAsPreviewWithMenu(unVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f8 a2;
        org.telegram.messenger.kj kjVar;
        l2.f fVar;
        e8 e8Var = this.f36221b;
        h8 h8Var = e8Var.f36775y;
        if (h8.b0(h8Var) != null) {
            if (((h8Var.f37730e0 == 1 && e8Var.f36770n != null) || h8Var.f37732f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (kjVar = a2.f37035a) != null && (fVar = h8Var.M) != null) {
                if (h8Var.f37732f0 != null) {
                    th.o7 orCreateStoryViewer = h8Var.getOrCreateStoryViewer();
                    Context context = e8Var.getContext();
                    org.telegram.messenger.kj kjVar2 = a2.f37035a;
                    TL_stories.StoryItem storyItem = kjVar2.f16694l;
                    int f12 = kjVar2.f1();
                    th.x4 x4Var = h8Var.f37732f0;
                    v7 v7Var = h8Var.f37733g0;
                    orCreateStoryViewer.h = org.telegram.messenger.e20.f15506s0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(x4Var.d));
                    orCreateStoryViewer.P0 = f12;
                    orCreateStoryViewer.T(context, storyItem, arrayList, 0, x4Var, null, v7Var, true);
                } else {
                    int f13 = kjVar.f1();
                    int i10 = a2.f37037c;
                    org.telegram.ui.Components.au0 au0Var = (org.telegram.ui.Components.au0) fVar.f11588b;
                    org.telegram.ui.Components.pt0[] pt0VarArr = au0Var.f24562v1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < pt0VarArr[0].f29532a.size(); i12++) {
                        if (((org.telegram.messenger.kj) pt0VarArr[0].f29532a.get(i12)).f1() == f13) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.ts0 f02 = au0Var.f0(0);
                    if (i11 >= 0 && f02 != null) {
                        f02.f30723x.h1(i11, 0);
                    } else {
                        au0Var.I0(0, f13, i10, true);
                    }
                    if (f02 != null) {
                        f02.I = f13;
                        f02.J = false;
                    }
                    h8Var.finishFragment();
                }
            }
            if (e8Var.f36770n != null) {
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
                        h8Var.B0();
                        h8Var.u0();
                        return false;
                    }
                } else {
                    f8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null && h8.c0(h8Var) != null && h8.d0(h8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) h8.f0(h8Var).getFragmentStack().get(h8.e0(h8Var).getFragmentStack().size() - 2);
                        if (k2Var instanceof un) {
                            h8Var.finishFragment();
                            ((un) k2Var).aa(a11.h);
                            return false;
                        }
                    } else if (a11 != null && h8Var.N != null) {
                        h8Var.finishFragment();
                        h8Var.N.aa(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
