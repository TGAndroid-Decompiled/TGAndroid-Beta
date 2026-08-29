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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.vc1;
public abstract class ja extends jl0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f24564e3 = new byte[1024];
    public boolean T2;
    public final org.telegram.ui.k U2;
    public final HashMap V2;
    public final HashMap W2;
    public org.telegram.ui.ActionBar.f6 X2;
    public final ia Y2;
    public final ArrayList Z2;
    public final ArrayList f24565a3;
    public final int f24566b3;
    public int c3;
    public final org.telegram.ui.ActionBar.o2 f24567d3;

    public ja(Context context, org.telegram.ui.ActionBar.o2 o2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.V2 = new HashMap();
        this.W2 = new HashMap();
        this.Z2 = arrayList2;
        this.f24565a3 = arrayList;
        this.f24566b3 = i10;
        this.f24567d3 = o2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23133h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        org.telegram.ui.k kVar = new org.telegram.ui.k(1);
        this.U2 = kVar;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        kVar.j1(0);
        setLayoutManager(kVar);
        ia iaVar = new ia(this, context);
        this.Y2 = iaVar;
        setAdapter(iaVar);
        setOnItemClickListener(new zk0() {
            @Override
            public final void c(int i11, View view) {
                ja jaVar = ja.this;
                jaVar.getClass();
                jaVar.y1(((ThemesHorizontalListCell$InnerThemeView) view).f24049b);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    jaVar.v0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > jaVar.getMeasuredWidth()) {
                    jaVar.v0(right - jaVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new fa(this, 0));
    }

    public abstract void A1();

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.V2.get(str);
            if (f6Var != null) {
                this.V2.remove(str);
                if (this.W2.remove(f6Var) != null) {
                    Utilities.globalQueue.postRunnable(new l3.m(this, f6Var, file, 29));
                } else {
                    w1(f6Var);
                }
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            this.V2.remove((String) objArr[0]);
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
        if (this.T2) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
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
        f1();
    }

    public void setDrawDivider(boolean z10) {
        this.T2 = z10;
    }

    public final void w1(org.telegram.ui.ActionBar.f6 f6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f24049b == f6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f24049b.Q = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void x1(int i10) {
        org.telegram.ui.ActionBar.f6 A0;
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 != 0) {
            if (this.f24566b3 == 1) {
                A0 = org.telegram.ui.ActionBar.g6.J;
            } else {
                A0 = org.telegram.ui.ActionBar.g6.A0();
            }
            this.X2 = A0;
            ArrayList arrayList = this.f24565a3;
            int indexOf = arrayList.indexOf(A0);
            if (indexOf < 0 && (indexOf = this.Z2.indexOf(this.X2) + arrayList.size()) < 0) {
                return;
            }
            this.U2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void y1(org.telegram.ui.ActionBar.f6 f6Var) {
        String str;
        org.telegram.ui.ActionBar.f6 A0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = f6Var.B;
        if (tL_theme != null) {
            if (f6Var.Q) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.o2 o2Var = this.f24567d3;
                    if (o2Var != null) {
                        o2Var.presentFragment(new vc1(f6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(f6Var.d)) {
            org.telegram.ui.ActionBar.b6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (this.f24566b3 != 1 && !f6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, f6Var.m());
        edit.commit();
        if (this.f24566b3 == 1) {
            if (f6Var != org.telegram.ui.ActionBar.g6.J) {
                if (org.telegram.ui.ActionBar.g6.I == org.telegram.ui.ActionBar.g6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.g6.J = f6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.g6.l(true);
                }
            } else {
                return;
            }
        } else if (f6Var != org.telegram.ui.ActionBar.g6.A0()) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, -1);
        } else {
            return;
        }
        A1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.T.f24566b3 == 1) {
                    A0 = org.telegram.ui.ActionBar.g6.J;
                } else {
                    A0 = org.telegram.ui.ActionBar.g6.A0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f24048a;
                if (themesHorizontalListCell$InnerThemeView.f24049b == A0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.b4.q(f6Var, f6Var.U);
        if (this.f24566b3 != 1) {
            org.telegram.ui.ActionBar.g6.F1(this.f24567d3);
        }
    }

    public void z1(org.telegram.ui.ActionBar.f6 f6Var) {
    }
}
