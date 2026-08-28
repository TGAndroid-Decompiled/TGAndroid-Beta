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
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.tc1;
public abstract class ma extends wk0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f24719e3 = new byte[1024];
    public boolean T2;
    public final of.y U2;
    public final HashMap V2;
    public final HashMap W2;
    public org.telegram.ui.ActionBar.e6 X2;
    public final la Y2;
    public final ArrayList Z2;
    public final ArrayList a3;
    public final int f24720b3;
    public int f24721c3;
    public final org.telegram.ui.ActionBar.o2 f24722d3;

    public ma(Context context, org.telegram.ui.ActionBar.o2 o2Var, int i9, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.V2 = new HashMap();
        this.W2 = new HashMap();
        this.Z2 = arrayList2;
        this.a3 = arrayList;
        this.f24720b3 = i9;
        this.f24722d3 = o2Var;
        if (i9 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        of.y yVar = new of.y(2);
        this.U2 = yVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        yVar.j1(0);
        setLayoutManager(yVar);
        la laVar = new la(this, context);
        this.Y2 = laVar;
        setAdapter(laVar);
        setOnItemClickListener(new mk0() {
            @Override
            public final void a(int i10, View view) {
                ma maVar = ma.this;
                maVar.getClass();
                maVar.y1(((ThemesHorizontalListCell$InnerThemeView) view).f24029b);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    maVar.v0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > maVar.getMeasuredWidth()) {
                    maVar.v0(right - maVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ia(this, 0));
    }

    public abstract void A1();

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.V2.get(str);
            if (e6Var != null) {
                this.V2.remove(str);
                if (this.W2.remove(e6Var) != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.e(this, e6Var, file, 10));
                } else {
                    w1(e6Var);
                }
            }
        } else if (i9 == NotificationCenter.fileLoadFailed) {
            this.V2.remove((String) objArr[0]);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i9 = 0; i9 < 4; i9++) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (int i9 = 0; i9 < 4; i9++) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileLoadFailed);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        super.onDraw(canvas);
        if (this.T2) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(20.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
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
    public void setBackgroundColor(int i9) {
        super.setBackgroundColor(i9);
        f1();
    }

    public void setDrawDivider(boolean z10) {
        this.T2 = z10;
    }

    public final void w1(org.telegram.ui.ActionBar.e6 e6Var) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f24029b == e6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f24029b.Q = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void x1(int i9) {
        org.telegram.ui.ActionBar.e6 A0;
        View view;
        if (i9 == 0 && (view = (View) getParent()) != null) {
            i9 = view.getMeasuredWidth();
        }
        if (i9 != 0) {
            if (this.f24720b3 == 1) {
                A0 = org.telegram.ui.ActionBar.f6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.f6.A0();
            }
            this.X2 = A0;
            ArrayList arrayList = this.a3;
            int indexOf = arrayList.indexOf(A0);
            if (indexOf < 0 && (indexOf = this.Z2.indexOf(this.X2) + arrayList.size()) < 0) {
                return;
            }
            this.U2.h1(indexOf, (i9 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void y1(org.telegram.ui.ActionBar.e6 e6Var) {
        String str;
        org.telegram.ui.ActionBar.e6 A0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = e6Var.B;
        if (tL_theme != null) {
            if (e6Var.Q) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.f24722d3;
                    if (o2Var != null) {
                        o2Var.presentFragment(new tc1(e6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(e6Var.d)) {
            org.telegram.ui.ActionBar.a6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (this.f24720b3 != 1 && !e6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, e6Var.m());
        edit.commit();
        if (this.f24720b3 == 1) {
            if (e6Var != org.telegram.ui.ActionBar.f6.J) {
                if (org.telegram.ui.ActionBar.f6.I == org.telegram.ui.ActionBar.f6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.f6.J = e6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.f6.l(true);
                }
            } else {
                return;
            }
        } else if (e6Var != org.telegram.ui.ActionBar.f6.A0()) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, e6Var, Boolean.FALSE, null, -1);
        } else {
            return;
        }
        A1();
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.T.f24720b3 == 1) {
                    A0 = org.telegram.ui.ActionBar.f6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.f6.A0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f24028a;
                if (themesHorizontalListCell$InnerThemeView.f24029b == A0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.b4.q(e6Var, e6Var.U);
        if (this.f24720b3 != 1) {
            org.telegram.ui.ActionBar.f6.F1(this.f24722d3);
        }
    }

    public void z1(org.telegram.ui.ActionBar.e6 e6Var) {
    }
}
