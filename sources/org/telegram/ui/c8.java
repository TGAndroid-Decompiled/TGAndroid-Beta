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
    public final Context f44715a;
    public final e8 f44716b;

    public c8(e8 e8Var, Context context) {
        this.f44716b = e8Var;
        this.f44715a = context;
    }

    public final f8 a(float f10, float f11) {
        f8 f8Var;
        e8 e8Var = this.f44716b;
        if (e8Var.f45232n == null) {
            return null;
        }
        int i7 = e8Var.f45230e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float L = org.telegram.messenger.g0.L(52.0f);
        int L2 = org.telegram.messenger.g0.L(44.0f) / 2;
        int i10 = 0;
        for (int i11 = 0; i11 < e8Var.d; i11++) {
            float f12 = (measuredWidth / 2.0f) + (i7 * measuredWidth);
            float L3 = (L / 2.0f) + (i10 * L) + org.telegram.messenger.g0.L(44.0f);
            float f13 = L2;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= L3 - f13 && f11 <= L3 + f13 && (f8Var = (f8) e8Var.f45232n.get(i11, null)) != null) {
                return f8Var;
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
        final f8 a10;
        super.onLongPress(motionEvent);
        e8 e8Var = this.f44716b;
        h8 h8Var = e8Var.f45237y;
        if (h8Var.f46267e0 == 0 && !org.telegram.messenger.g0.Q1() && (a10 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                e8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j3 = h8Var.f46286y;
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putInt("start_from_date", a10.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            an anVar = new an(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232564, 0, h8Var.getParentActivity(), h8Var.getResourceProvider());
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout, h8Var.getResourceProvider());
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(h8Var.getParentActivity(), true, false);
            z0Var.j(org.telegram.messenger.hd.M0(2131749064, null), 2131232224, null);
            z0Var.setMinimumWidth(160);
            z0Var.setOnClickListener(new View.OnClickListener(this) {
                public final c8 f43593b;

                {
                    this.f43593b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.q4 q4Var;
                    org.telegram.ui.ActionBar.q4 q4Var2;
                    org.telegram.ui.ActionBar.q4 q4Var3;
                    org.telegram.ui.ActionBar.q4 q4Var4;
                    switch (r3) {
                        case 0:
                            c8 c8Var = this.f43593b;
                            h8 h8Var2 = c8Var.f44716b.f45237y;
                            q4Var = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                            if (q4Var != null) {
                                q4Var2 = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                if (q4Var2.getFragmentStack().size() >= 3) {
                                    q4Var3 = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                    List fragmentStack = q4Var3.getFragmentStack();
                                    q4Var4 = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(q4Var4.getFragmentStack().size() - 3);
                                    if (f2Var instanceof an) {
                                        org.telegram.messenger.g0.i3(new o1(c8Var, (an) f2Var, a10, 5), 300L);
                                    }
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            return;
                        default:
                            e8 e8Var2 = this.f43593b.f44716b;
                            h8 h8Var3 = e8Var2.f45237y;
                            int i7 = a10.h;
                            h8Var3.Q = i7;
                            h8Var3.P = i7;
                            h8Var3.G = true;
                            h8Var3.B0();
                            h8 h8Var4 = e8Var2.f45237y;
                            h8Var4.u0();
                            h8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
            if (h8Var.f46265d0) {
                org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(h8Var.getParentActivity(), false, false);
                z0Var2.j(org.telegram.messenger.hd.M0(2131745651, null), 2131232357, null);
                z0Var2.setMinimumWidth(160);
                z0Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final c8 f43593b;

                    {
                        this.f43593b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.q4 q4Var;
                        org.telegram.ui.ActionBar.q4 q4Var2;
                        org.telegram.ui.ActionBar.q4 q4Var3;
                        org.telegram.ui.ActionBar.q4 q4Var4;
                        switch (r3) {
                            case 0:
                                c8 c8Var = this.f43593b;
                                h8 h8Var2 = c8Var.f44716b.f45237y;
                                q4Var = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                if (q4Var != null) {
                                    q4Var2 = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                    if (q4Var2.getFragmentStack().size() >= 3) {
                                        q4Var3 = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                        List fragmentStack = q4Var3.getFragmentStack();
                                        q4Var4 = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(q4Var4.getFragmentStack().size() - 3);
                                        if (f2Var instanceof an) {
                                            org.telegram.messenger.g0.i3(new o1(c8Var, (an) f2Var, a10, 5), 300L);
                                        }
                                    }
                                }
                                h8Var2.finishPreviewFragment();
                                return;
                            default:
                                e8 e8Var2 = this.f43593b.f44716b;
                                h8 h8Var3 = e8Var2.f45237y;
                                int i7 = a10.h;
                                h8Var3.Q = i7;
                                h8Var3.P = i7;
                                h8Var3.G = true;
                                h8Var3.B0();
                                h8 h8Var4 = e8Var2.f45237y;
                                h8Var4.u0();
                                h8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var2);
                org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(h8Var.getParentActivity(), false, true);
                z0Var3.j(org.telegram.messenger.hd.M0(2131752089, null), 2131232108, null);
                z0Var3.setMinimumWidth(160);
                z0Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final c8 f44217b;

                    {
                        this.f44217b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.q4 q4Var;
                        org.telegram.ui.ActionBar.q4 q4Var2;
                        org.telegram.ui.ActionBar.q4 q4Var3;
                        switch (r2) {
                            case 0:
                                c8 c8Var = this.f44217b;
                                h8 h8Var2 = c8Var.f44716b.f45237y;
                                q4Var = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                if (q4Var.getFragmentStack().size() >= 3) {
                                    q4Var2 = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                    List fragmentStack = q4Var2.getFragmentStack();
                                    q4Var3 = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(q4Var3.getFragmentStack().size() - 3);
                                    if (f2Var instanceof an) {
                                        org.telegram.ui.Components.v4.q(h8Var2, 1, h8Var2.getMessagesController().a2(Long.valueOf(h8Var2.f46286y)), null, false, new j2.n(15, c8Var, (an) f2Var), null);
                                    }
                                }
                                h8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f44217b.f44716b.f45237y.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            h8Var.f46284w = new bi.ec(11, this.f44715a, this);
            h8Var.f46284w.setOnClickListener(new View.OnClickListener(this) {
                public final c8 f44217b;

                {
                    this.f44217b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.q4 q4Var;
                    org.telegram.ui.ActionBar.q4 q4Var2;
                    org.telegram.ui.ActionBar.q4 q4Var3;
                    switch (r2) {
                        case 0:
                            c8 c8Var = this.f44217b;
                            h8 h8Var2 = c8Var.f44716b.f45237y;
                            q4Var = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                            if (q4Var.getFragmentStack().size() >= 3) {
                                q4Var2 = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                List fragmentStack = q4Var2.getFragmentStack();
                                q4Var3 = ((org.telegram.ui.ActionBar.f2) h8Var2).parentLayout;
                                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(q4Var3.getFragmentStack().size() - 3);
                                if (f2Var instanceof an) {
                                    org.telegram.ui.Components.v4.q(h8Var2, 1, h8Var2.getMessagesController().a2(Long.valueOf(h8Var2.f46286y)), null, false, new j2.n(15, c8Var, (an) f2Var), null);
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f44217b.f44716b.f45237y.finishPreviewFragment();
                            return;
                    }
                }
            });
            h8Var.f46284w.setVisibility(8);
            h8Var.f46284w.setFitsSystemWindows(true);
            h8.g0(h8Var).getOverlayContainerView().addView(h8Var.f46284w, c8.ha.c(-1.0f, -1));
            h8.h0(h8Var);
            h8Var.presentFragmentAsPreviewWithMenu(anVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f8 a10;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.Components.uy uyVar;
        e8 e8Var = this.f44716b;
        h8 h8Var = e8Var.f45237y;
        if (h8.b0(h8Var) != null) {
            if (((h8Var.f46267e0 == 1 && e8Var.f45232n != null) || h8Var.f46269f0 != null) && (a10 = a(motionEvent.getX(), motionEvent.getY())) != null && (ijVar = a10.f45516a) != null && (uyVar = h8Var.M) != null) {
                if (h8Var.f46269f0 != null) {
                    di.p9 orCreateStoryViewer = h8Var.getOrCreateStoryViewer();
                    Context context = e8Var.getContext();
                    org.telegram.messenger.ij ijVar2 = a10.f45516a;
                    TL_stories.StoryItem storyItem = ijVar2.f23241l;
                    int f12 = ijVar2.f1();
                    di.q6 q6Var = h8Var.f46269f0;
                    v7 v7Var = h8Var.f46270g0;
                    orCreateStoryViewer.h = org.telegram.messenger.p10.f24459s0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(q6Var.d));
                    orCreateStoryViewer.O0 = f12;
                    orCreateStoryViewer.M(context, storyItem, arrayList, 0, q6Var, null, v7Var, true);
                } else {
                    int f13 = ijVar.f1();
                    int i7 = a10.f45518c;
                    org.telegram.ui.Components.xs0 xs0Var = (org.telegram.ui.Components.xs0) uyVar.f38757b;
                    org.telegram.ui.Components.ms0[] ms0VarArr = xs0Var.f40418v1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < ms0VarArr[0].f36047a.size(); i11++) {
                        if (((org.telegram.messenger.ij) ms0VarArr[0].f36047a.get(i11)).f1() == f13) {
                            i10 = i11;
                        }
                    }
                    org.telegram.ui.Components.sr0 g02 = xs0Var.g0(0);
                    if (i10 >= 0 && g02 != null) {
                        g02.f38110x.h1(i10, 0);
                    } else {
                        xs0Var.K0(0, f13, i7, true);
                    }
                    if (g02 != null) {
                        g02.I = f13;
                        g02.J = false;
                    }
                    h8Var.finishFragment();
                }
            }
            if (e8Var.f45232n != null) {
                if (h8Var.G) {
                    f8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null) {
                        ValueAnimator valueAnimator = h8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h8Var.R = null;
                        }
                        int i12 = h8Var.P;
                        if (i12 == 0 && h8Var.Q == 0) {
                            int i13 = a11.h;
                            h8Var.Q = i13;
                            h8Var.P = i13;
                        } else {
                            int i14 = a11.h;
                            if (i12 == i14 && h8Var.Q == i14) {
                                h8Var.Q = 0;
                                h8Var.P = 0;
                            } else if (i12 == i14) {
                                h8Var.P = h8Var.Q;
                            } else {
                                int i15 = h8Var.Q;
                                if (i15 == i14) {
                                    h8Var.Q = i12;
                                } else if (i12 == i15) {
                                    if (i14 > i15) {
                                        h8Var.Q = i14;
                                    } else {
                                        h8Var.P = i14;
                                    }
                                } else {
                                    h8Var.Q = i14;
                                    h8Var.P = i14;
                                }
                            }
                        }
                        h8Var.B0();
                        h8Var.u0();
                        return false;
                    }
                } else {
                    f8 a12 = a(motionEvent.getX(), motionEvent.getY());
                    if (a12 != null && h8.c0(h8Var) != null && h8.d0(h8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) h8.f0(h8Var).getFragmentStack().get(h8.e0(h8Var).getFragmentStack().size() - 2);
                        if (f2Var instanceof an) {
                            h8Var.finishFragment();
                            ((an) f2Var).fa(a12.h);
                            return false;
                        }
                    } else if (a12 != null && h8Var.N != null) {
                        h8Var.finishFragment();
                        h8Var.N.fa(a12.h);
                    }
                }
            }
        }
        return false;
    }
}
