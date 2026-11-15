package org.telegram.ui.Cells;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.w71;
public abstract class ga extends uj0 implements is {
    public static final byte[] f30336q3 = new byte[1024];
    public boolean f30337f3;
    public final jg.b0 f30338g3;
    public final HashMap f30339h3;
    public final HashMap f30340i3;
    public org.telegram.ui.ActionBar.i6 j3;
    public final fa f30341k3;
    public final ArrayList f30342l3;
    public final ArrayList f30343m3;
    public final int f30344n3;
    public int f30345o3;
    public final org.telegram.ui.ActionBar.e2 f30346p3;

    public ga(Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.f30339h3 = new HashMap();
        this.f30340i3 = new HashMap();
        this.f30342l3 = arrayList2;
        this.f30343m3 = arrayList;
        this.f30344n3 = i7;
        this.f30346p3 = e2Var;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, this, null);
        } else {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(3);
        this.f30338g3 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        fa faVar = new fa(this, context);
        this.f30341k3 = faVar;
        setAdapter(faVar);
        setOnItemClickListener(new gj0() {
            @Override
            public final void b(int i10, View view) {
                ga gaVar = ga.this;
                gaVar.getClass();
                gaVar.B1(((ThemesHorizontalListCell$InnerThemeView) view).f29968b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    gaVar.w0(left - org.telegram.messenger.g0.L(8.0f), 0, null);
                } else if (right > gaVar.getMeasuredWidth()) {
                    gaVar.w0(right - gaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ca(this, 0));
    }

    public final void A1(int i7) {
        org.telegram.ui.ActionBar.i6 D0;
        View view;
        if (i7 == 0 && (view = (View) getParent()) != null) {
            i7 = view.getMeasuredWidth();
        }
        if (i7 != 0) {
            if (this.f30344n3 == 1) {
                D0 = org.telegram.ui.ActionBar.j6.J;
            } else {
                D0 = org.telegram.ui.ActionBar.j6.D0();
            }
            this.j3 = D0;
            ArrayList arrayList = this.f30343m3;
            int indexOf = arrayList.indexOf(D0);
            if (indexOf < 0 && (indexOf = this.f30342l3.indexOf(this.j3) + arrayList.size()) < 0) {
                return;
            }
            this.f30338g3.h1(indexOf, (i7 - org.telegram.messenger.g0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.i6 i6Var, View view) {
        String str;
        org.telegram.ui.ActionBar.i6 D0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = i6Var.G;
        if (tL_theme != null) {
            if (i6Var.V) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.e2 e2Var = this.f30346p3;
                    if (e2Var != null) {
                        e2Var.presentFragment(new w71(i6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(i6Var.d)) {
            org.telegram.ui.ActionBar.d6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f26600b.getSharedPreferences("themeconfig", 0).edit();
        if (this.f30344n3 != 1 && !i6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, i6Var.m());
        edit.commit();
        if (this.f30344n3 == 1) {
            if (i6Var != org.telegram.ui.ActionBar.j6.J) {
                if (org.telegram.ui.ActionBar.j6.I == org.telegram.ui.ActionBar.j6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.j6.J = i6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.j6.m(true);
                }
            } else {
                return;
            }
        } else if (i6Var != org.telegram.ui.ActionBar.j6.D0()) {
            org.telegram.ui.ActionBar.j6.K1(i6Var, false, -1, view);
        } else {
            return;
        }
        D1();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f29969b0.f30344n3 == 1) {
                    D0 = org.telegram.ui.ActionBar.j6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.j6.D0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f29966a;
                if (themesHorizontalListCell$InnerThemeView.f29968b == D0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.p3.q(i6Var, i6Var.Z);
        if (this.f30344n3 != 1) {
            org.telegram.ui.ActionBar.j6.M1(this.f30346p3);
        }
    }

    public abstract void D1();

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.Y1) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f30339h3.get(str);
            if (i6Var != null) {
                this.f30339h3.remove(str);
                if (this.f30340i3.remove(i6Var) != null) {
                    Utilities.f22416e.c(new ki.n(this, i6Var, file, 25));
                } else {
                    z1(i6Var);
                }
            }
        } else if (i7 == ns.Z1) {
            this.f30339h3.remove((String) objArr[0]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            ns.f(i7).c(this, ns.Y1);
            ns.f(i7).c(this, ns.Z1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            ns.f(i7).n(this, ns.Y1);
            ns.f(i7).n(this, ns.Z1);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f30337f3) {
            if (hd.f24101a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24101a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        g1();
    }

    public void setDrawDivider(boolean z10) {
        this.f30337f3 = z10;
    }

    public final void z1(org.telegram.ui.ActionBar.i6 i6Var) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f29968b == i6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f29968b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.i6 i6Var) {
    }
}
