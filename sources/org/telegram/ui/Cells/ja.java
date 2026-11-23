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
import org.telegram.ui.y71;
public abstract class ja extends ek0 implements fs {
    public static final byte[] f30982q3 = new byte[1024];
    public boolean f30983f3;
    public final jg.b0 f30984g3;
    public final HashMap f30985h3;
    public final HashMap f30986i3;
    public org.telegram.ui.ActionBar.m6 j3;
    public final ia f30987k3;
    public final ArrayList f30988l3;
    public final ArrayList f30989m3;
    public final int f30990n3;
    public int f30991o3;
    public final org.telegram.ui.ActionBar.g2 f30992p3;

    public ja(Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.f30985h3 = new HashMap();
        this.f30986i3 = new HashMap();
        this.f30988l3 = arrayList2;
        this.f30989m3 = arrayList;
        this.f30990n3 = i7;
        this.f30992p3 = g2Var;
        if (i7 == 2) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, this, null);
        } else {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, this, null);
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        jg.b0 b0Var = new jg.b0(3);
        this.f30984g3 = b0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        b0Var.j1(0);
        setLayoutManager(b0Var);
        ia iaVar = new ia(this, context);
        this.f30987k3 = iaVar;
        setAdapter(iaVar);
        setOnItemClickListener(new qj0() {
            @Override
            public final void b(int i10, View view) {
                ja jaVar = ja.this;
                jaVar.getClass();
                jaVar.B1(((ThemesHorizontalListCell$InnerThemeView) view).f30433b, view);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    jaVar.w0(left - org.telegram.messenger.g0.L(8.0f), 0, null);
                } else if (right > jaVar.getMeasuredWidth()) {
                    jaVar.w0(right - jaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ea(this, 0));
    }

    public final void A1(int i7) {
        org.telegram.ui.ActionBar.m6 D0;
        View view;
        if (i7 == 0 && (view = (View) getParent()) != null) {
            i7 = view.getMeasuredWidth();
        }
        if (i7 != 0) {
            if (this.f30990n3 == 1) {
                D0 = org.telegram.ui.ActionBar.n6.J;
            } else {
                D0 = org.telegram.ui.ActionBar.n6.D0();
            }
            this.j3 = D0;
            ArrayList arrayList = this.f30989m3;
            int indexOf = arrayList.indexOf(D0);
            if (indexOf < 0 && (indexOf = this.f30988l3.indexOf(this.j3) + arrayList.size()) < 0) {
                return;
            }
            this.f30984g3.h1(indexOf, (i7 - org.telegram.messenger.g0.L(76.0f)) / 2);
        }
    }

    public final void B1(org.telegram.ui.ActionBar.m6 m6Var, View view) {
        String str;
        org.telegram.ui.ActionBar.m6 D0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = m6Var.G;
        if (tL_theme != null) {
            if (m6Var.V) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.g2 g2Var = this.f30992p3;
                    if (g2Var != null) {
                        g2Var.presentFragment(new y71(m6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(m6Var.d)) {
            org.telegram.ui.ActionBar.h6.a(false);
        }
        SharedPreferences.Editor edit = org.telegram.messenger.t0.f27013b.getSharedPreferences("themeconfig", 0).edit();
        if (this.f30990n3 != 1 && !m6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, m6Var.m());
        edit.commit();
        if (this.f30990n3 == 1) {
            if (m6Var != org.telegram.ui.ActionBar.n6.J) {
                if (org.telegram.ui.ActionBar.n6.I == org.telegram.ui.ActionBar.n6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.n6.J = m6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.n6.m(true);
                }
            } else {
                return;
            }
        } else if (m6Var != org.telegram.ui.ActionBar.n6.D0()) {
            org.telegram.ui.ActionBar.n6.K1(m6Var, false, -1, view);
        } else {
            return;
        }
        D1();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f30434b0.f30990n3 == 1) {
                    D0 = org.telegram.ui.ActionBar.n6.J;
                } else {
                    D0 = org.telegram.ui.ActionBar.n6.D0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f30431a;
                if (themesHorizontalListCell$InnerThemeView.f30433b == D0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.s3.q(m6Var, m6Var.Z);
        if (this.f30990n3 != 1) {
            org.telegram.ui.ActionBar.n6.M1(this.f30992p3);
        }
    }

    public abstract void D1();

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.Y1) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.m6 m6Var = (org.telegram.ui.ActionBar.m6) this.f30985h3.get(str);
            if (m6Var != null) {
                this.f30985h3.remove(str);
                if (this.f30986i3.remove(m6Var) != null) {
                    Utilities.f22877e.c(new fa(this, m6Var, file, 0));
                } else {
                    z1(m6Var);
                }
            }
        } else if (i7 == ks.Z1) {
            this.f30985h3.remove((String) objArr[0]);
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
        if (this.f30983f3) {
            if (gd.f24314a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24314a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29574k0);
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
        this.f30983f3 = z10;
    }

    public final void z1(org.telegram.ui.ActionBar.m6 m6Var) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f30433b == m6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f30433b.V = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public void C1(org.telegram.ui.ActionBar.m6 m6Var) {
    }
}
