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
public final class e8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f47471a;
    public final g8 f47472b;

    public e8(g8 g8Var, Context context) {
        this.f47472b = g8Var;
        this.f47471a = context;
    }

    public final h8 a(float f10, float f11) {
        h8 h8Var;
        g8 g8Var = this.f47472b;
        if (g8Var.f48163n == null) {
            return null;
        }
        int i7 = g8Var.f48161e;
        float measuredWidth = g8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.g0.L(52.0f);
        int L2 = org.telegram.messenger.g0.L(44.0f) / 2;
        int i10 = 0;
        for (int i11 = 0; i11 < g8Var.d; i11++) {
            float f12 = (measuredWidth / 2.0f) + (i7 * measuredWidth);
            float L3 = (L / 2.0f) + (i10 * L) + org.telegram.messenger.g0.L(44.0f);
            float f13 = L2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= L3 - f13 && f11 <= L3 + f13 && (h8Var = (h8) g8Var.f48163n.get(i11, null)) != null) {
                return h8Var;
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
        final h8 a10;
        super.onLongPress(motionEvent);
        g8 g8Var = this.f47472b;
        j8 j8Var = g8Var.f48168y;
        if (j8Var.f49023f0 == 0 && !org.telegram.messenger.g0.Q1() && (a10 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                g8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = j8Var.f49041y;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a10.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            bn bnVar = new bn(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232569, 0, j8Var.getParentActivity(), j8Var.getResourceProvider());
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, j8Var.getResourceProvider());
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(j8Var.getParentActivity(), true, false);
            y0Var.j(org.telegram.messenger.gd.N0(2131748872, null), 2131232229, null);
            y0Var.setMinimumWidth(160);
            y0Var.setOnClickListener(new View.OnClickListener(this) {
                public final e8 f46734b;

                {
                    this.f46734b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.r4 r4Var;
                    org.telegram.ui.ActionBar.r4 r4Var2;
                    org.telegram.ui.ActionBar.r4 r4Var3;
                    org.telegram.ui.ActionBar.r4 r4Var4;
                    switch (r3) {
                        case 0:
                            e8 e8Var = this.f46734b;
                            j8 j8Var2 = e8Var.f47472b.f48168y;
                            r4Var = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                            if (r4Var != null) {
                                r4Var2 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                if (r4Var2.getFragmentStack().size() >= 3) {
                                    r4Var3 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                    List fragmentStack = r4Var3.getFragmentStack();
                                    r4Var4 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var4.getFragmentStack().size() - 3);
                                    if (g2Var instanceof bn) {
                                        org.telegram.messenger.g0.h3(new o1(e8Var, (bn) g2Var, a10, 5), 300L);
                                    }
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            return;
                        default:
                            g8 g8Var2 = this.f46734b.f47472b;
                            j8 j8Var3 = g8Var2.f48168y;
                            int i7 = a10.h;
                            j8Var3.R = i7;
                            j8Var3.Q = i7;
                            j8Var3.H = true;
                            j8Var3.B0();
                            j8 j8Var4 = g8Var2.f48168y;
                            j8Var4.u0();
                            j8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
            if (j8Var.f49021e0) {
                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(j8Var.getParentActivity(), false, false);
                y0Var2.j(org.telegram.messenger.gd.N0(2131745454, null), 2131232362, null);
                y0Var2.setMinimumWidth(160);
                y0Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final e8 f46734b;

                    {
                        this.f46734b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.r4 r4Var;
                        org.telegram.ui.ActionBar.r4 r4Var2;
                        org.telegram.ui.ActionBar.r4 r4Var3;
                        org.telegram.ui.ActionBar.r4 r4Var4;
                        switch (r3) {
                            case 0:
                                e8 e8Var = this.f46734b;
                                j8 j8Var2 = e8Var.f47472b.f48168y;
                                r4Var = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                if (r4Var != null) {
                                    r4Var2 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                    if (r4Var2.getFragmentStack().size() >= 3) {
                                        r4Var3 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                        List fragmentStack = r4Var3.getFragmentStack();
                                        r4Var4 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var4.getFragmentStack().size() - 3);
                                        if (g2Var instanceof bn) {
                                            org.telegram.messenger.g0.h3(new o1(e8Var, (bn) g2Var, a10, 5), 300L);
                                        }
                                    }
                                }
                                j8Var2.finishPreviewFragment();
                                return;
                            default:
                                g8 g8Var2 = this.f46734b.f47472b;
                                j8 j8Var3 = g8Var2.f48168y;
                                int i7 = a10.h;
                                j8Var3.R = i7;
                                j8Var3.Q = i7;
                                j8Var3.H = true;
                                j8Var3.B0();
                                j8 j8Var4 = g8Var2.f48168y;
                                j8Var4.u0();
                                j8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
                org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(j8Var.getParentActivity(), false, true);
                y0Var3.j(org.telegram.messenger.gd.N0(2131752077, null), 2131232113, null);
                y0Var3.setMinimumWidth(160);
                y0Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final e8 f47004b;

                    {
                        this.f47004b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.r4 r4Var;
                        org.telegram.ui.ActionBar.r4 r4Var2;
                        org.telegram.ui.ActionBar.r4 r4Var3;
                        switch (r2) {
                            case 0:
                                e8 e8Var = this.f47004b;
                                j8 j8Var2 = e8Var.f47472b.f48168y;
                                r4Var = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                if (r4Var.getFragmentStack().size() >= 3) {
                                    r4Var2 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                    List fragmentStack = r4Var2.getFragmentStack();
                                    r4Var3 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var3.getFragmentStack().size() - 3);
                                    if (g2Var instanceof bn) {
                                        org.telegram.ui.Components.b5.q(j8Var2, 1, j8Var2.getMessagesController().c2(Long.valueOf(j8Var2.f49041y)), null, false, new j6.k(14, e8Var, (bn) g2Var), null);
                                    }
                                }
                                j8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f47004b.f47472b.f48168y.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            j8Var.f49039w = new bi.o3(12, this.f47471a, this);
            j8Var.f49039w.setOnClickListener(new View.OnClickListener(this) {
                public final e8 f47004b;

                {
                    this.f47004b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.r4 r4Var;
                    org.telegram.ui.ActionBar.r4 r4Var2;
                    org.telegram.ui.ActionBar.r4 r4Var3;
                    switch (r2) {
                        case 0:
                            e8 e8Var = this.f47004b;
                            j8 j8Var2 = e8Var.f47472b.f48168y;
                            r4Var = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                            if (r4Var.getFragmentStack().size() >= 3) {
                                r4Var2 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                List fragmentStack = r4Var2.getFragmentStack();
                                r4Var3 = ((org.telegram.ui.ActionBar.g2) j8Var2).parentLayout;
                                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var3.getFragmentStack().size() - 3);
                                if (g2Var instanceof bn) {
                                    org.telegram.ui.Components.b5.q(j8Var2, 1, j8Var2.getMessagesController().c2(Long.valueOf(j8Var2.f49041y)), null, false, new j6.k(14, e8Var, (bn) g2Var), null);
                                }
                            }
                            j8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f47004b.f47472b.f48168y.finishPreviewFragment();
                            return;
                    }
                }
            });
            j8Var.f49039w.setVisibility(8);
            j8Var.f49039w.setFitsSystemWindows(true);
            j8.g0(j8Var).getOverlayContainerView().addView(j8Var.f49039w, c8.na.c(-1.0f, -1));
            j8.h0(j8Var);
            j8Var.presentFragmentAsPreviewWithMenu(bnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h8 a10;
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.Components.nd0 nd0Var;
        g8 g8Var = this.f47472b;
        j8 j8Var = g8Var.f48168y;
        if (j8.b0(j8Var) != null) {
            if (((j8Var.f49023f0 == 1 && g8Var.f48163n != null) || j8Var.f49024g0 != null) && (a10 = a(motionEvent.getX(), motionEvent.getY())) != null && (fjVar = a10.f48469a) != null && (nd0Var = j8Var.N) != null) {
                if (j8Var.f49024g0 != null) {
                    fi.f9 orCreateStoryViewer = j8Var.getOrCreateStoryViewer();
                    Context context = g8Var.getContext();
                    org.telegram.messenger.fj fjVar2 = a10.f48469a;
                    TL_stories.StoryItem storyItem = fjVar2.f24078l;
                    int e12 = fjVar2.e1();
                    fi.h6 h6Var = j8Var.f49024g0;
                    w7 w7Var = j8Var.f49025h0;
                    orCreateStoryViewer.h = org.telegram.messenger.i10.f24637t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(h6Var.d));
                    orCreateStoryViewer.P0 = e12;
                    orCreateStoryViewer.M(context, storyItem, arrayList, 0, h6Var, null, w7Var, true);
                } else {
                    int e13 = fjVar.e1();
                    int i7 = a10.f48471c;
                    org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) nd0Var.f37766b;
                    org.telegram.ui.Components.xs0[] xs0VarArr = it0Var.f36160w1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < xs0VarArr[0].f42165a.size(); i11++) {
                        if (((org.telegram.messenger.fj) xs0VarArr[0].f42165a.get(i11)).e1() == e13) {
                            i10 = i11;
                        }
                    }
                    org.telegram.ui.Components.ds0 g02 = it0Var.g0(0);
                    if (i10 >= 0 && g02 != null) {
                        g02.f34450x.h1(i10, 0);
                    } else {
                        it0Var.L0(0, e13, i7, true);
                    }
                    if (g02 != null) {
                        g02.J = e13;
                        g02.K = false;
                    }
                    j8Var.finishFragment();
                }
            }
            if (g8Var.f48163n != null) {
                if (j8Var.H) {
                    h8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        ValueAnimator valueAnimator = j8Var.S;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            j8Var.S = null;
                        }
                        int i12 = j8Var.Q;
                        if (i12 == 0 && j8Var.R == 0) {
                            int i13 = a11.h;
                            j8Var.R = i13;
                            j8Var.Q = i13;
                        } else {
                            int i14 = a11.h;
                            if (i12 == i14 && j8Var.R == i14) {
                                j8Var.R = 0;
                                j8Var.Q = 0;
                            } else if (i12 == i14) {
                                j8Var.Q = j8Var.R;
                            } else {
                                int i15 = j8Var.R;
                                if (i15 == i14) {
                                    j8Var.R = i12;
                                } else if (i12 == i15) {
                                    if (i14 > i15) {
                                        j8Var.R = i14;
                                    } else {
                                        j8Var.Q = i14;
                                    }
                                } else {
                                    j8Var.R = i14;
                                    j8Var.Q = i14;
                                }
                            }
                        }
                        j8Var.B0();
                        j8Var.u0();
                        return false;
                    }
                } else {
                    h8 a12 = a(motionEvent.getX(), motionEvent.getY());
                    if (a12 != null && j8.c0(j8Var) != null && j8.d0(j8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) j8.f0(j8Var).getFragmentStack().get(j8.e0(j8Var).getFragmentStack().size() - 2);
                        if (g2Var instanceof bn) {
                            j8Var.finishFragment();
                            ((bn) g2Var).ha(a12.h);
                            return false;
                        }
                    } else if (a12 != null && j8Var.O != null) {
                        j8Var.finishFragment();
                        j8Var.O.ha(a12.h);
                    }
                }
            }
        }
        return false;
    }
}
