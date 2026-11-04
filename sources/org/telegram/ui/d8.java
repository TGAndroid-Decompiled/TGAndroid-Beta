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
    public final Context f44587a;
    public final f8 f44588b;

    public d8(f8 f8Var, Context context) {
        this.f44588b = f8Var;
        this.f44587a = context;
    }

    public final g8 a(float f10, float f11) {
        g8 g8Var;
        f8 f8Var = this.f44588b;
        if (f8Var.f45180n == null) {
            return null;
        }
        int i3 = f8Var.f45178e;
        float measuredWidth = f8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.g0.L(52.0f);
        int L2 = org.telegram.messenger.g0.L(44.0f) / 2;
        int i10 = 0;
        for (int i11 = 0; i11 < f8Var.d; i11++) {
            float f12 = (measuredWidth / 2.0f) + (i3 * measuredWidth);
            float L3 = (L / 2.0f) + (i10 * L) + org.telegram.messenger.g0.L(44.0f);
            float f13 = L2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= L3 - f13 && f11 <= L3 + f13 && (g8Var = (g8) f8Var.f45180n.get(i11, null)) != null) {
                return g8Var;
            }
            i3++;
            if (i3 >= 7) {
                i10++;
                i3 = 0;
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
        f8 f8Var = this.f44588b;
        i8 i8Var = f8Var.f45185y;
        if (i8Var.f46173f0 == 0 && !org.telegram.messenger.g0.Q1() && (a10 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                f8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j10 = i8Var.f46191y;
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putInt("start_from_date", a10.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            wm wmVar = new wm(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232562, 0, i8Var.getParentActivity(), i8Var.getResourceProvider());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, i8Var.getResourceProvider());
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(i8Var.getParentActivity(), true, false);
            y0Var.j(org.telegram.messenger.bd.M0(2131749073, null), 2131232224, null);
            y0Var.setMinimumWidth(160);
            y0Var.setOnClickListener(new View.OnClickListener(this) {
                public final d8 f43971b;

                {
                    this.f43971b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.q4 q4Var;
                    org.telegram.ui.ActionBar.q4 q4Var2;
                    org.telegram.ui.ActionBar.q4 q4Var3;
                    org.telegram.ui.ActionBar.q4 q4Var4;
                    switch (r3) {
                        case 0:
                            d8 d8Var = this.f43971b;
                            i8 i8Var2 = d8Var.f44588b.f45185y;
                            q4Var = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                            if (q4Var != null) {
                                q4Var2 = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                if (q4Var2.getFragmentStack().size() >= 3) {
                                    q4Var3 = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                    List fragmentStack = q4Var3.getFragmentStack();
                                    q4Var4 = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(q4Var4.getFragmentStack().size() - 3);
                                    if (d2Var instanceof wm) {
                                        org.telegram.messenger.g0.i3(new p1(d8Var, (wm) d2Var, a10, 5), 300L);
                                    }
                                }
                            }
                            i8Var2.finishPreviewFragment();
                            return;
                        default:
                            f8 f8Var2 = this.f43971b.f44588b;
                            i8 i8Var3 = f8Var2.f45185y;
                            int i3 = a10.h;
                            i8Var3.R = i3;
                            i8Var3.Q = i3;
                            i8Var3.H = true;
                            i8Var3.B0();
                            i8 i8Var4 = f8Var2.f45185y;
                            i8Var4.u0();
                            i8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
            if (i8Var.f46171e0) {
                org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(i8Var.getParentActivity(), false, false);
                y0Var2.j(org.telegram.messenger.bd.M0(2131745660, null), 2131232357, null);
                y0Var2.setMinimumWidth(160);
                y0Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final d8 f43971b;

                    {
                        this.f43971b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.q4 q4Var;
                        org.telegram.ui.ActionBar.q4 q4Var2;
                        org.telegram.ui.ActionBar.q4 q4Var3;
                        org.telegram.ui.ActionBar.q4 q4Var4;
                        switch (r3) {
                            case 0:
                                d8 d8Var = this.f43971b;
                                i8 i8Var2 = d8Var.f44588b.f45185y;
                                q4Var = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                if (q4Var != null) {
                                    q4Var2 = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                    if (q4Var2.getFragmentStack().size() >= 3) {
                                        q4Var3 = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                        List fragmentStack = q4Var3.getFragmentStack();
                                        q4Var4 = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(q4Var4.getFragmentStack().size() - 3);
                                        if (d2Var instanceof wm) {
                                            org.telegram.messenger.g0.i3(new p1(d8Var, (wm) d2Var, a10, 5), 300L);
                                        }
                                    }
                                }
                                i8Var2.finishPreviewFragment();
                                return;
                            default:
                                f8 f8Var2 = this.f43971b.f44588b;
                                i8 i8Var3 = f8Var2.f45185y;
                                int i3 = a10.h;
                                i8Var3.R = i3;
                                i8Var3.Q = i3;
                                i8Var3.H = true;
                                i8Var3.B0();
                                i8 i8Var4 = f8Var2.f45185y;
                                i8Var4.u0();
                                i8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var2);
                org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(i8Var.getParentActivity(), false, true);
                y0Var3.j(org.telegram.messenger.bd.M0(2131752089, null), 2131232108, null);
                y0Var3.setMinimumWidth(160);
                y0Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final d8 f44271b;

                    {
                        this.f44271b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.q4 q4Var;
                        org.telegram.ui.ActionBar.q4 q4Var2;
                        org.telegram.ui.ActionBar.q4 q4Var3;
                        switch (r2) {
                            case 0:
                                d8 d8Var = this.f44271b;
                                i8 i8Var2 = d8Var.f44588b.f45185y;
                                q4Var = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                if (q4Var.getFragmentStack().size() >= 3) {
                                    q4Var2 = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                    List fragmentStack = q4Var2.getFragmentStack();
                                    q4Var3 = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(q4Var3.getFragmentStack().size() - 3);
                                    if (d2Var instanceof wm) {
                                        org.telegram.ui.Components.t4.q(i8Var2, 1, i8Var2.getMessagesController().a2(Long.valueOf(i8Var2.f46191y)), null, false, new mi.h0(9, d8Var, (wm) d2Var), null);
                                    }
                                }
                                i8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f44271b.f44588b.f45185y.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            i8Var.f46189w = new ai.x2(12, this.f44587a, this);
            i8Var.f46189w.setOnClickListener(new View.OnClickListener(this) {
                public final d8 f44271b;

                {
                    this.f44271b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.q4 q4Var;
                    org.telegram.ui.ActionBar.q4 q4Var2;
                    org.telegram.ui.ActionBar.q4 q4Var3;
                    switch (r2) {
                        case 0:
                            d8 d8Var = this.f44271b;
                            i8 i8Var2 = d8Var.f44588b.f45185y;
                            q4Var = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                            if (q4Var.getFragmentStack().size() >= 3) {
                                q4Var2 = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                List fragmentStack = q4Var2.getFragmentStack();
                                q4Var3 = ((org.telegram.ui.ActionBar.d2) i8Var2).parentLayout;
                                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(q4Var3.getFragmentStack().size() - 3);
                                if (d2Var instanceof wm) {
                                    org.telegram.ui.Components.t4.q(i8Var2, 1, i8Var2.getMessagesController().a2(Long.valueOf(i8Var2.f46191y)), null, false, new mi.h0(9, d8Var, (wm) d2Var), null);
                                }
                            }
                            i8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f44271b.f44588b.f45185y.finishPreviewFragment();
                            return;
                    }
                }
            });
            i8Var.f46189w.setVisibility(8);
            i8Var.f46189w.setFitsSystemWindows(true);
            i8.g0(i8Var).getOverlayContainerView().addView(i8Var.f46189w, b8.mf.c(-1.0f, -1));
            i8.h0(i8Var);
            i8Var.presentFragmentAsPreviewWithMenu(wmVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        g8 a10;
        org.telegram.messenger.zi ziVar;
        org.telegram.ui.Components.nh nhVar;
        f8 f8Var = this.f44588b;
        i8 i8Var = f8Var.f45185y;
        if (i8.b0(i8Var) != null) {
            if (((i8Var.f46173f0 == 1 && f8Var.f45180n != null) || i8Var.f46174g0 != null) && (a10 = a(motionEvent.getX(), motionEvent.getY())) != null && (ziVar = a10.f45588a) != null && (nhVar = i8Var.N) != null) {
                if (i8Var.f46174g0 != null) {
                    ei.r9 orCreateStoryViewer = i8Var.getOrCreateStoryViewer();
                    Context context = f8Var.getContext();
                    org.telegram.messenger.zi ziVar2 = a10.f45588a;
                    TL_stories.StoryItem storyItem = ziVar2.f26871l;
                    int f12 = ziVar2.f1();
                    ei.r6 r6Var = i8Var.f46174g0;
                    w7 w7Var = i8Var.f46175h0;
                    orCreateStoryViewer.h = org.telegram.messenger.h10.f22829t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(r6Var.d));
                    orCreateStoryViewer.Q0 = f12;
                    orCreateStoryViewer.U(context, storyItem, arrayList, 0, r6Var, null, w7Var, true);
                } else {
                    int f13 = ziVar.f1();
                    int i3 = a10.f45590c;
                    org.telegram.ui.Components.ws0 ws0Var = (org.telegram.ui.Components.ws0) nhVar.f36540b;
                    org.telegram.ui.Components.ls0[] ls0VarArr = ws0Var.f40136w1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < ls0VarArr[0].f35854a.size(); i11++) {
                        if (((org.telegram.messenger.zi) ls0VarArr[0].f35854a.get(i11)).f1() == f13) {
                            i10 = i11;
                        }
                    }
                    org.telegram.ui.Components.rr0 g02 = ws0Var.g0(0);
                    if (i10 >= 0 && g02 != null) {
                        g02.f37791x.h1(i10, 0);
                    } else {
                        ws0Var.K0(0, f13, i3, true);
                    }
                    if (g02 != null) {
                        g02.J = f13;
                        g02.K = false;
                    }
                    i8Var.finishFragment();
                }
            }
            if (f8Var.f45180n != null) {
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
                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) i8.f0(i8Var).getFragmentStack().get(i8.e0(i8Var).getFragmentStack().size() - 2);
                        if (d2Var instanceof wm) {
                            i8Var.finishFragment();
                            ((wm) d2Var).fa(a12.h);
                            return false;
                        }
                    } else if (a12 != null && i8Var.O != null) {
                        i8Var.finishFragment();
                        i8Var.O.fa(a12.h);
                    }
                }
            }
        }
        return false;
    }
}
