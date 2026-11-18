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
public final class d8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f46835a;
    public final f8 f46836b;

    public d8(f8 f8Var, Context context) {
        this.f46836b = f8Var;
        this.f46835a = context;
    }

    public final g8 a(float f10, float f11) {
        g8 g8Var;
        f8 f8Var = this.f46836b;
        if (f8Var.f47561n == null) {
            return null;
        }
        int i7 = f8Var.f47559e;
        float measuredWidth = f8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.g0.L(52.0f);
        int L2 = org.telegram.messenger.g0.L(44.0f) / 2;
        int i10 = 0;
        for (int i11 = 0; i11 < f8Var.d; i11++) {
            float f12 = (measuredWidth / 2.0f) + (i7 * measuredWidth);
            float L3 = (L / 2.0f) + (i10 * L) + org.telegram.messenger.g0.L(44.0f);
            float f13 = L2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= L3 - f13 && f11 <= L3 + f13 && (g8Var = (g8) f8Var.f47561n.get(i11, null)) != null) {
                return g8Var;
            }
            i7++;
            if (i7 >= 7) {
                i10++;
                i7 = 0;
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
        final g8 a10;
        super.onLongPress(motionEvent);
        f8 f8Var = this.f46836b;
        i8 i8Var = f8Var.f47566y;
        if (i8Var.f48587f0 == 0 && !org.telegram.messenger.g0.Q1() && (a10 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                f8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = i8Var.f48605y;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a10.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            bn bnVar = new bn(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232566, 0, i8Var.getParentActivity(), i8Var.getResourceProvider());
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, i8Var.getResourceProvider());
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(i8Var.getParentActivity(), true, false);
            z0Var.j(org.telegram.messenger.gd.M0(2131748873, null), 2131232226, null);
            z0Var.setMinimumWidth(160);
            z0Var.setOnClickListener(new View.OnClickListener(this) {
                public final d8 f45778b;

                {
                    this.f45778b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.s4 s4Var;
                    org.telegram.ui.ActionBar.s4 s4Var2;
                    org.telegram.ui.ActionBar.s4 s4Var3;
                    org.telegram.ui.ActionBar.s4 s4Var4;
                    switch (r3) {
                        case 0:
                            d8 d8Var = this.f45778b;
                            i8 i8Var2 = d8Var.f46836b.f47566y;
                            s4Var = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                            if (s4Var != null) {
                                s4Var2 = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                if (s4Var2.getFragmentStack().size() >= 3) {
                                    s4Var3 = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                    List fragmentStack = s4Var3.getFragmentStack();
                                    s4Var4 = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) fragmentStack.get(s4Var4.getFragmentStack().size() - 3);
                                    if (h2Var instanceof bn) {
                                        org.telegram.messenger.g0.h3(new o1(d8Var, (bn) h2Var, a10, 5), 300L);
                                    }
                                }
                            }
                            i8Var2.finishPreviewFragment();
                            return;
                        default:
                            f8 f8Var2 = this.f45778b.f46836b;
                            i8 i8Var3 = f8Var2.f47566y;
                            int i7 = a10.h;
                            i8Var3.R = i7;
                            i8Var3.Q = i7;
                            i8Var3.H = true;
                            i8Var3.B0();
                            i8 i8Var4 = f8Var2.f47566y;
                            i8Var4.u0();
                            i8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
            if (i8Var.f48585e0) {
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(i8Var.getParentActivity(), false, false);
                z0Var2.j(org.telegram.messenger.gd.M0(2131745455, null), 2131232359, null);
                z0Var2.setMinimumWidth(160);
                z0Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final d8 f45778b;

                    {
                        this.f45778b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.s4 s4Var;
                        org.telegram.ui.ActionBar.s4 s4Var2;
                        org.telegram.ui.ActionBar.s4 s4Var3;
                        org.telegram.ui.ActionBar.s4 s4Var4;
                        switch (r3) {
                            case 0:
                                d8 d8Var = this.f45778b;
                                i8 i8Var2 = d8Var.f46836b.f47566y;
                                s4Var = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                if (s4Var != null) {
                                    s4Var2 = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                    if (s4Var2.getFragmentStack().size() >= 3) {
                                        s4Var3 = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                        List fragmentStack = s4Var3.getFragmentStack();
                                        s4Var4 = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) fragmentStack.get(s4Var4.getFragmentStack().size() - 3);
                                        if (h2Var instanceof bn) {
                                            org.telegram.messenger.g0.h3(new o1(d8Var, (bn) h2Var, a10, 5), 300L);
                                        }
                                    }
                                }
                                i8Var2.finishPreviewFragment();
                                return;
                            default:
                                f8 f8Var2 = this.f45778b.f46836b;
                                i8 i8Var3 = f8Var2.f47566y;
                                int i7 = a10.h;
                                i8Var3.R = i7;
                                i8Var3.Q = i7;
                                i8Var3.H = true;
                                i8Var3.B0();
                                i8 i8Var4 = f8Var2.f47566y;
                                i8Var4.u0();
                                i8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
                org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(i8Var.getParentActivity(), false, true);
                z0Var3.j(org.telegram.messenger.gd.M0(2131752078, null), 2131232110, null);
                z0Var3.setMinimumWidth(160);
                z0Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final d8 f46453b;

                    {
                        this.f46453b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.s4 s4Var;
                        org.telegram.ui.ActionBar.s4 s4Var2;
                        org.telegram.ui.ActionBar.s4 s4Var3;
                        switch (r2) {
                            case 0:
                                d8 d8Var = this.f46453b;
                                i8 i8Var2 = d8Var.f46836b.f47566y;
                                s4Var = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                if (s4Var.getFragmentStack().size() >= 3) {
                                    s4Var2 = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                    List fragmentStack = s4Var2.getFragmentStack();
                                    s4Var3 = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) fragmentStack.get(s4Var3.getFragmentStack().size() - 3);
                                    if (h2Var instanceof bn) {
                                        org.telegram.ui.Components.b5.q(i8Var2, 1, i8Var2.getMessagesController().c2(Long.valueOf(i8Var2.f48605y)), null, false, new ji.j(d8Var, (bn) h2Var, false, 13), null);
                                    }
                                }
                                i8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f46453b.f46836b.f47566y.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            i8Var.f48603w = new bi.i3(12, this.f46835a, this);
            i8Var.f48603w.setOnClickListener(new View.OnClickListener(this) {
                public final d8 f46453b;

                {
                    this.f46453b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.s4 s4Var;
                    org.telegram.ui.ActionBar.s4 s4Var2;
                    org.telegram.ui.ActionBar.s4 s4Var3;
                    switch (r2) {
                        case 0:
                            d8 d8Var = this.f46453b;
                            i8 i8Var2 = d8Var.f46836b.f47566y;
                            s4Var = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                            if (s4Var.getFragmentStack().size() >= 3) {
                                s4Var2 = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                List fragmentStack = s4Var2.getFragmentStack();
                                s4Var3 = ((org.telegram.ui.ActionBar.h2) i8Var2).parentLayout;
                                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) fragmentStack.get(s4Var3.getFragmentStack().size() - 3);
                                if (h2Var instanceof bn) {
                                    org.telegram.ui.Components.b5.q(i8Var2, 1, i8Var2.getMessagesController().c2(Long.valueOf(i8Var2.f48605y)), null, false, new ji.j(d8Var, (bn) h2Var, false, 13), null);
                                }
                            }
                            i8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f46453b.f46836b.f47566y.finishPreviewFragment();
                            return;
                    }
                }
            });
            i8Var.f48603w.setVisibility(8);
            i8Var.f48603w.setFitsSystemWindows(true);
            i8.g0(i8Var).getOverlayContainerView().addView(i8Var.f48603w, c8.ma.c(-1.0f, -1));
            i8.h0(i8Var);
            i8Var.presentFragmentAsPreviewWithMenu(bnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        g8 a10;
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.Components.hn hnVar;
        f8 f8Var = this.f46836b;
        i8 i8Var = f8Var.f47566y;
        if (i8.b0(i8Var) != null) {
            if (((i8Var.f48587f0 == 1 && f8Var.f47561n != null) || i8Var.f48588g0 != null) && (a10 = a(motionEvent.getX(), motionEvent.getY())) != null && (fjVar = a10.f47921a) != null && (hnVar = i8Var.N) != null) {
                if (i8Var.f48588g0 != null) {
                    fi.f9 orCreateStoryViewer = i8Var.getOrCreateStoryViewer();
                    Context context = f8Var.getContext();
                    org.telegram.messenger.fj fjVar2 = a10.f47921a;
                    TL_stories.StoryItem storyItem = fjVar2.f23970l;
                    int e12 = fjVar2.e1();
                    fi.h6 h6Var = i8Var.f48588g0;
                    v7 v7Var = i8Var.f48589h0;
                    orCreateStoryViewer.h = org.telegram.messenger.j10.f24770t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(h6Var.d));
                    orCreateStoryViewer.P0 = e12;
                    orCreateStoryViewer.M(context, storyItem, arrayList, 0, h6Var, null, v7Var, true);
                } else {
                    int e13 = fjVar.e1();
                    int i7 = a10.f47923c;
                    org.telegram.ui.Components.gt0 gt0Var = (org.telegram.ui.Components.gt0) hnVar.f35933b;
                    org.telegram.ui.Components.vs0[] vs0VarArr = gt0Var.f35636w1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < vs0VarArr[0].f41412a.size(); i11++) {
                        if (((org.telegram.messenger.fj) vs0VarArr[0].f41412a.get(i11)).e1() == e13) {
                            i10 = i11;
                        }
                    }
                    org.telegram.ui.Components.bs0 g02 = gt0Var.g0(0);
                    if (i10 >= 0 && g02 != null) {
                        g02.f33775x.h1(i10, 0);
                    } else {
                        gt0Var.L0(0, e13, i7, true);
                    }
                    if (g02 != null) {
                        g02.J = e13;
                        g02.K = false;
                    }
                    i8Var.finishFragment();
                }
            }
            if (f8Var.f47561n != null) {
                if (i8Var.H) {
                    g8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        ValueAnimator valueAnimator = i8Var.S;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            i8Var.S = null;
                        }
                        int i12 = i8Var.Q;
                        if (i12 == 0 && i8Var.R == 0) {
                            int i13 = a11.h;
                            i8Var.R = i13;
                            i8Var.Q = i13;
                        } else {
                            int i14 = a11.h;
                            if (i12 == i14 && i8Var.R == i14) {
                                i8Var.R = 0;
                                i8Var.Q = 0;
                            } else if (i12 == i14) {
                                i8Var.Q = i8Var.R;
                            } else {
                                int i15 = i8Var.R;
                                if (i15 == i14) {
                                    i8Var.R = i12;
                                } else if (i12 == i15) {
                                    if (i14 > i15) {
                                        i8Var.R = i14;
                                    } else {
                                        i8Var.Q = i14;
                                    }
                                } else {
                                    i8Var.R = i14;
                                    i8Var.Q = i14;
                                }
                            }
                        }
                        i8Var.B0();
                        i8Var.u0();
                        return false;
                    }
                } else {
                    g8 a12 = a(motionEvent.getX(), motionEvent.getY());
                    if (a12 != null && i8.c0(i8Var) != null && i8.d0(i8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) i8.f0(i8Var).getFragmentStack().get(i8.e0(i8Var).getFragmentStack().size() - 2);
                        if (h2Var instanceof bn) {
                            i8Var.finishFragment();
                            ((bn) h2Var).ha(a12.h);
                            return false;
                        }
                    } else if (a12 != null && i8Var.O != null) {
                        i8Var.finishFragment();
                        i8Var.O.ha(a12.h);
                    }
                }
            }
        }
        return false;
    }
}
