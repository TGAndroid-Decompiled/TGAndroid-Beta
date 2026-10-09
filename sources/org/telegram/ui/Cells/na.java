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
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.ce1;
public abstract class na extends qm0 implements NotificationCenter.NotificationCenterDelegate {
    public static final byte[] f22549g3 = new byte[1024];
    public boolean V2;
    public final gg.a0 W2;
    public final HashMap X2;
    public final HashMap Y2;
    public org.telegram.ui.ActionBar.h6 Z2;
    public final ma f22550a3;
    public final ArrayList f22551b3;
    public final ArrayList f22552c3;
    public final int f22553d3;
    public int f22554e3;
    public final org.telegram.ui.ActionBar.n2 f22555f3;

    public na(Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, null);
        this.X2 = new HashMap();
        this.Y2 = new HashMap();
        this.f22551b3 = arrayList2;
        this.f22552c3 = arrayList;
        this.f22553d3 = i10;
        this.f22555f3 = n2Var;
        if (i10 == 2) {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20868h5, false));
        } else {
            setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
        }
        setItemAnimator(null);
        setLayoutAnimation(null);
        gg.a0 a0Var = new gg.a0(3);
        this.W2 = a0Var;
        setPadding(0, 0, 0, 0);
        setClipToPadding(false);
        a0Var.j1(0);
        setLayoutManager(a0Var);
        ma maVar = new ma(this, context);
        this.f22550a3 = maVar;
        setAdapter(maVar);
        setOnItemClickListener(new em0() {
            @Override
            public final void d(int i11, View view) {
                na naVar = na.this;
                naVar.getClass();
                naVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).f21763b);
                int left = view.getLeft();
                int right = view.getRight();
                if (left < 0) {
                    naVar.v0(left - AndroidUtilities.dp(8.0f), 0, null);
                } else if (right > naVar.getMeasuredWidth()) {
                    naVar.v0(right - naVar.getMeasuredWidth(), 0, null);
                }
            }
        });
        setOnItemLongClickListener(new ja(this, 0));
    }

    public abstract void B1();

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            File file = (File) objArr[1];
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.X2.get(str);
            if (h6Var != null) {
                this.X2.remove(str);
                if (this.Y2.remove(h6Var) != null) {
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.video.f(this, h6Var, file, 10));
                } else {
                    x1(h6Var);
                }
            }
        } else if (i10 == NotificationCenter.fileLoadFailed) {
            this.X2.remove((String) objArr[0]);
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
        if (this.V2) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20919k0);
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
        this.V2 = z10;
    }

    public final void x1(org.telegram.ui.ActionBar.h6 h6Var) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f21763b == h6Var && themesHorizontalListCell$InnerThemeView.c()) {
                    themesHorizontalListCell$InnerThemeView.f21763b.U = true;
                    themesHorizontalListCell$InnerThemeView.a();
                }
            }
        }
    }

    public final void y1(int i10) {
        org.telegram.ui.ActionBar.h6 B0;
        View view;
        if (i10 == 0 && (view = (View) getParent()) != null) {
            i10 = view.getMeasuredWidth();
        }
        if (i10 != 0) {
            if (this.f22553d3 == 1) {
                B0 = org.telegram.ui.ActionBar.i6.J;
            } else {
                B0 = org.telegram.ui.ActionBar.i6.B0();
            }
            this.Z2 = B0;
            ArrayList arrayList = this.f22552c3;
            int indexOf = arrayList.indexOf(B0);
            if (indexOf < 0 && (indexOf = this.f22551b3.indexOf(this.Z2) + arrayList.size()) < 0) {
                return;
            }
            this.W2.h1(indexOf, (i10 - AndroidUtilities.dp(76.0f)) / 2);
        }
    }

    public final void z1(org.telegram.ui.ActionBar.h6 h6Var) {
        String str;
        org.telegram.ui.ActionBar.h6 B0;
        boolean z10;
        boolean z11;
        TLRPC.TL_theme tL_theme = h6Var.F;
        if (tL_theme != null) {
            if (h6Var.U) {
                if (tL_theme.document == null) {
                    org.telegram.ui.ActionBar.n2 n2Var = this.f22555f3;
                    if (n2Var != null) {
                        n2Var.presentFragment(new ce1(h6Var, null, true));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(h6Var.d)) {
            org.telegram.ui.ActionBar.d6.a(false);
        }
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (this.f22553d3 != 1 && !h6Var.q()) {
            str = "lastDayTheme";
        } else {
            str = "lastDarkTheme";
        }
        edit.putString(str, h6Var.m());
        edit.commit();
        if (this.f22553d3 == 1) {
            if (h6Var != org.telegram.ui.ActionBar.i6.J) {
                if (org.telegram.ui.ActionBar.i6.I == org.telegram.ui.ActionBar.i6.J) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.ActionBar.i6.J = h6Var;
                if (z11) {
                    org.telegram.ui.ActionBar.i6.l(true);
                }
            } else {
                return;
            }
        } else if (h6Var != org.telegram.ui.ActionBar.i6.B0()) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, h6Var, Boolean.FALSE, null, -1);
        } else {
            return;
        }
        B1();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ThemesHorizontalListCell$InnerThemeView) {
                ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) childAt;
                if (themesHorizontalListCell$InnerThemeView.f21762a0.f22553d3 == 1) {
                    B0 = org.telegram.ui.ActionBar.i6.J;
                } else {
                    B0 = org.telegram.ui.ActionBar.i6.B0();
                }
                RadioButton radioButton = themesHorizontalListCell$InnerThemeView.f21761a;
                if (themesHorizontalListCell$InnerThemeView.f21763b == B0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                radioButton.a(z10, true);
            }
        }
        org.telegram.ui.ActionBar.c4.q(h6Var, h6Var.Y);
        if (this.f22553d3 != 1) {
            org.telegram.ui.ActionBar.i6.G1(this.f22555f3);
        }
    }

    public void A1(org.telegram.ui.ActionBar.h6 h6Var) {
    }
}
