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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.od1;
public abstract class ka extends rl0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f21296f3 = new byte[1024];
    public boolean U2;
    public final org.telegram.ui.k V2;
    public final HashMap W2;
    public final HashMap X2;
    public org.telegram.ui.ActionBar.i6 Y2;
    public final ja Z2;
    public final ArrayList f21297a3;
    public final ArrayList f21298b3;
    public final int c3;
    public int f21299d3;
    public final org.telegram.ui.ActionBar.p2 f21300e3;

    public ka(Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.W2 = new HashMap();
        this.X2 = new HashMap();
        this.f21297a3 = arrayList2;
        this.f21298b3 = arrayList;
        this.c3 = i10;
        this.f21300e3 = p2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(1);
        this.V2 = kVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        kVar.j1(0);
        setLayoutManager(kVar);
        ja jaVar = new ja(this, context);
        this.Z2 = jaVar;
        setAdapter(jaVar);
        setOnItemClickListener(new hl0() {
            @Override
            public final void d(int i11, View view) {
                ka kaVar = ka.this;
                kaVar.getClass();
                kaVar.x1(((ThemesHorizontalListCell$InnerThemeView) view).f20775b);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    kaVar.v0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > kaVar.getMeasuredWidth()) {
                    kaVar.v0(right - kaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ga(this, 0));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.W2.get(str);
            if (i6Var != null) {
                this.W2.remove(str);
                if (this.X2.remove(i6Var) != null) {
                    Utilities.globalQueue.postRunnable(new lh.p6(this, i6Var, file, 22));
                } else {
                    v1(i6Var);
                }
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            this.W2.remove((String) objArr[0]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.U2) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
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
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        e1();
    }

    public void setDrawDivider(boolean z4) {
        this.U2 = z4;
    }

    public final void v1(org.telegram.ui.ActionBar.i6 i6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f20775b == i6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f20775b.R = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void w1(int i10) {
        org.telegram.ui.ActionBar.i6 A0;
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 != 0) {
            if (this.c3 == 1) {
                A0 = org.telegram.ui.ActionBar.j6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.j6.A0();
            }
            this.Y2 = A0;
            ArrayList arrayList = this.f21298b3;
            int indexOf = arrayList.indexOf(A0);
            if (indexOf < 0 && (indexOf = this.f21297a3.indexOf(this.Y2) + arrayList.size()) < 0) {
                return;
            }
            this.V2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void x1(org.telegram.ui.ActionBar.i6 i6Var) {
        String str;
        org.telegram.ui.ActionBar.i6 A0;
        boolean z4;
        boolean z10;
        TLRPC.TL_theme tL_theme = i6Var.C;
        if (tL_theme != null) {
            if (i6Var.R) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.p2 p2Var = this.f21300e3;
                    if (p2Var != null) {
                        p2Var.presentFragment(new od1(i6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(i6Var.d)) {
            org.telegram.ui.ActionBar.e6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (this.c3 != 1 && !i6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, i6Var.m());
        edit.commit();
        if (this.c3 == 1) {
            if (i6Var != org.telegram.ui.ActionBar.j6.J) {
                if (org.telegram.ui.ActionBar.j6.I == org.telegram.ui.ActionBar.j6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.ActionBar.j6.J = i6Var;
                if (z10) {
                    org.telegram.ui.ActionBar.j6.l(true);
                }
            } else {
                return;
            }
        } else if (i6Var != org.telegram.ui.ActionBar.j6.A0()) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, -1);
        } else {
            return;
        }
        z1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.U.c3 == 1) {
                    A0 = org.telegram.ui.ActionBar.j6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.j6.A0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f20774a;
                if (themesHorizontalListCell$InnerThemeView.f20775b == A0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                radioButton.a(z4, true);
            }
        }
        org.telegram.ui.ActionBar.e4.q(i6Var, i6Var.V);
        if (this.c3 != 1) {
            org.telegram.ui.ActionBar.j6.F1(this.f21300e3);
        }
    }

    public abstract void z1();

    public void y1(org.telegram.ui.ActionBar.i6 i6Var) {
    }
}
