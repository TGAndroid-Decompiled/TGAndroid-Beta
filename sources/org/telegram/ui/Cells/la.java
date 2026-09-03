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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.od1;
public abstract class la extends sl0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f23137f3 = new byte[1024];
    public boolean U2;
    public final org.telegram.ui.k V2;
    public final HashMap W2;
    public final HashMap X2;
    public org.telegram.ui.ActionBar.j6 Y2;
    public final ka Z2;
    public final ArrayList f23138a3;
    public final ArrayList f23139b3;
    public final int c3;
    public int f23140d3;
    public final org.telegram.ui.ActionBar.p2 f23141e3;

    public la(Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.W2 = new HashMap();
        this.X2 = new HashMap();
        this.f23138a3 = arrayList2;
        this.f23139b3 = arrayList;
        this.c3 = i10;
        this.f23141e3 = p2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21733h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(1);
        this.V2 = kVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        kVar.j1(0);
        setLayoutManager(kVar);
        ka kaVar = new ka(this, context);
        this.Z2 = kaVar;
        setAdapter(kaVar);
        setOnItemClickListener(new il0() {
            @Override
            public final void f(int i11, View view) {
                la laVar = la.this;
                laVar.getClass();
                laVar.x1(((ThemesHorizontalListCell$InnerThemeView) view).f22521b);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    laVar.v0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > laVar.getMeasuredWidth()) {
                    laVar.v0(right - laVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ha(this, 0));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.W2.get(str);
            if (j6Var != null) {
                this.W2.remove(str);
                if (this.X2.remove(j6Var) != null) {
                    Utilities.globalQueue.postRunnable(new mh.p6(this, j6Var, file, 22));
                } else {
                    v1(j6Var);
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21781k0);
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

    public final void v1(org.telegram.ui.ActionBar.j6 j6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f22521b == j6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f22521b.R = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void w1(int i10) {
        org.telegram.ui.ActionBar.j6 A0;
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 != 0) {
            if (this.c3 == 1) {
                A0 = org.telegram.ui.ActionBar.k6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.k6.A0();
            }
            this.Y2 = A0;
            ArrayList arrayList = this.f23139b3;
            int indexOf = arrayList.indexOf(A0);
            if (indexOf < 0 && (indexOf = this.f23138a3.indexOf(this.Y2) + arrayList.size()) < 0) {
                return;
            }
            this.V2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void x1(org.telegram.ui.ActionBar.j6 j6Var) {
        String str;
        org.telegram.ui.ActionBar.j6 A0;
        boolean z4;
        boolean z10;
        TLRPC.TL_theme tL_theme = j6Var.C;
        if (tL_theme != null) {
            if (j6Var.R) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.p2 p2Var = this.f23141e3;
                    if (p2Var != null) {
                        p2Var.presentFragment(new od1(j6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(j6Var.d)) {
            org.telegram.ui.ActionBar.f6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (this.c3 != 1 && !j6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, j6Var.m());
        edit.commit();
        if (this.c3 == 1) {
            if (j6Var != org.telegram.ui.ActionBar.k6.J) {
                if (org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.ActionBar.k6.J = j6Var;
                if (z10) {
                    org.telegram.ui.ActionBar.k6.l(true);
                }
            } else {
                return;
            }
        } else if (j6Var != org.telegram.ui.ActionBar.k6.A0()) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j6Var, Boolean.FALSE, null, -1);
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
                    A0 = org.telegram.ui.ActionBar.k6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.k6.A0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f22520a;
                if (themesHorizontalListCell$InnerThemeView.f22521b == A0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                radioButton.a(z4, true);
            }
        }
        org.telegram.ui.ActionBar.f4.q(j6Var, j6Var.V);
        if (this.c3 != 1) {
            org.telegram.ui.ActionBar.k6.F1(this.f23141e3);
        }
    }

    public abstract void z1();

    public void y1(org.telegram.ui.ActionBar.j6 j6Var) {
    }
}
