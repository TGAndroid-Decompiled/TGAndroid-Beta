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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.a81;
public abstract class ia extends ek0 implements fs {
    public static final byte[] f30866q3 = new byte[1024];
    public boolean f30867f3;
    public final jg.b0 f30868g3;
    public final HashMap f30869h3;
    public final HashMap f30870i3;
    public org.telegram.ui.ActionBar.l6 j3;
    public final ha f30871k3;
    public final ArrayList f30872l3;
    public final ArrayList f30873m3;
    public final int f30874n3;
    public int f30875o3;
    public final org.telegram.ui.ActionBar.g2 f30876p3;

    public ia(Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.f30869h3 = new HashMap();
        this.f30870i3 = new HashMap();
        this.f30872l3 = arrayList2;
        this.f30873m3 = arrayList;
        this.f30874n3 = i7;
        this.f30876p3 = g2Var;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29451h5, this, null);
        } else {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(3);
        this.f30868g3 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        ha haVar = new ha(this, context);
        this.f30871k3 = haVar;
        setAdapter(haVar);
        setOnItemClickListener(new qj0() {
            @Override
            public final void c(int i10, View view) {
                ia iaVar = ia.this;
                iaVar.getClass();
                iaVar.B1(((ThemesHorizontalListCell$InnerThemeView) view).f30371b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    iaVar.w0(left - org.telegram.messenger.g0.L(8.0f), 0, null);
                } else if (right > iaVar.getMeasuredWidth()) {
                    iaVar.w0(right - iaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ea(this, 0));
    }

    public final void A1(int i7) {
        org.telegram.ui.ActionBar.l6 D0;
        View view;
        if (i7 == 0 && (view = (View) getParent()) != null) {
            i7 = view.getMeasuredWidth();
        }
        if (i7 != 0) {
            if (this.f30874n3 == 1) {
                D0 = org.telegram.ui.ActionBar.m6.J;
            } else {
                D0 = org.telegram.ui.ActionBar.m6.D0();
            }
            this.j3 = D0;
            ArrayList arrayList = this.f30873m3;
            int indexOf = arrayList.indexOf(D0);
            if (indexOf < 0 && (indexOf = this.f30872l3.indexOf(this.j3) + arrayList.size()) < 0) {
                return;
            }
            this.f30868g3.h1(indexOf, (i7 - org.telegram.messenger.g0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.l6 l6Var, View view) {
        String str;
        org.telegram.ui.ActionBar.l6 D0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = l6Var.G;
        if (tL_theme != null) {
            if (l6Var.V) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.g2 g2Var = this.f30876p3;
                    if (g2Var != null) {
                        g2Var.presentFragment(new a81(l6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(l6Var.d)) {
            org.telegram.ui.ActionBar.g6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f26941b.getSharedPreferences("themeconfig", 0).edit();
        if (this.f30874n3 != 1 && !l6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, l6Var.m());
        edit.commit();
        if (this.f30874n3 == 1) {
            if (l6Var != org.telegram.ui.ActionBar.m6.J) {
                if (org.telegram.ui.ActionBar.m6.I == org.telegram.ui.ActionBar.m6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.m6.J = l6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.m6.m(true);
                }
            } else {
                return;
            }
        } else if (l6Var != org.telegram.ui.ActionBar.m6.D0()) {
            org.telegram.ui.ActionBar.m6.K1(l6Var, false, -1, view);
        } else {
            return;
        }
        D1();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f30372b0.f30874n3 == 1) {
                    D0 = org.telegram.ui.ActionBar.m6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.m6.D0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f30369a;
                if (themesHorizontalListCell$InnerThemeView.f30371b == D0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.s3.q(l6Var, l6Var.Z);
        if (this.f30874n3 != 1) {
            org.telegram.ui.ActionBar.m6.M1(this.f30876p3);
        }
    }

    public abstract void D1();

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.Y1) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) this.f30869h3.get(str);
            if (l6Var != null) {
                this.f30869h3.remove(str);
                if (this.f30870i3.remove(l6Var) != null) {
                    Utilities.f22807e.c(new kg.y(this, l6Var, file, 29));
                } else {
                    z1(l6Var);
                }
            }
        } else if (i7 == ks.Z1) {
            this.f30869h3.remove((String) objArr[0]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            ks.f(i7).c(this, ks.Y1);
            ks.f(i7).c(this, ks.Z1);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i7 = 0; i7 < 4; i7++) {
            ks.f(i7).n(this, ks.Y1);
            ks.f(i7).n(this, ks.Z1);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.f30867f3) {
            if (gd.f24241a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24241a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29501k0);
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
        this.f30867f3 = z10;
    }

    public final void z1(org.telegram.ui.ActionBar.l6 l6Var) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f30371b == l6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f30371b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.l6 l6Var) {
    }
}
