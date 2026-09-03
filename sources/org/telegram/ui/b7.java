package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class b7 extends bg.c {
    public final Context d;
    public final d7 e;

    public b7(d7 d7Var, Context context) {
        this.e = d7Var;
        this.d = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        d7 d7Var = this.e;
        if (l1Var.b() != d7Var.H) {
            int i10 = l1Var.f5777f;
            if ((i10 != 2 || d7Var.E <= 0 || d7Var.I) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.X.size();
    }

    @Override
    public final int j(int i10) {
        return ((y6) this.e.X.get(i10)).f1830a;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        float f10;
        float f11;
        boolean z4;
        String format;
        boolean z10;
        Boolean bool;
        d7 d7Var = this.e;
        ArrayList arrayList = d7Var.X;
        y6 y6Var = (y6) arrayList.get(i10);
        int i12 = l1Var.f5777f;
        View view = l1Var.f5774a;
        String str = null;
        boolean z11 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 7) {
                            switch (i12) {
                                case 9:
                                    d7Var.v0();
                                    return;
                                case 10:
                                    p6 p6Var = d7Var.O;
                                    if (p6Var != null && !d7Var.I) {
                                        long j10 = d7Var.E;
                                        if (j10 > 0) {
                                            z11 = true;
                                        }
                                        long j11 = d7Var.F;
                                        int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                        if (i13 <= 0) {
                                            f10 = 0.0f;
                                        } else {
                                            f10 = ((float) j10) / ((float) j11);
                                        }
                                        long j12 = d7Var.G;
                                        if (j12 > 0 && i13 > 0) {
                                            f11 = ((float) (j11 - j12)) / ((float) j11);
                                        } else {
                                            f11 = 0.0f;
                                        }
                                        p6Var.b(f10, f11, z11);
                                        return;
                                    }
                                    return;
                                case 11:
                                    org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                    int i14 = y6Var.f40153f;
                                    if (i14 < 0) {
                                        z4 = d7Var.r0();
                                    } else {
                                        z4 = d7Var.e[i14];
                                    }
                                    boolean z12 = z4;
                                    CharSequence charSequence = y6Var.d;
                                    int[] iArr = d7Var.L;
                                    int i15 = y6Var.f40153f;
                                    if (i15 < 0) {
                                        i15 = 9;
                                    }
                                    int i16 = iArr[i15];
                                    if (i16 <= 0) {
                                        format = String.format("<%.1f%%", Float.valueOf(1.0f));
                                    } else {
                                        format = String.format("%d%%", Integer.valueOf(i16));
                                    }
                                    SpannableString spannableString = new SpannableString(format);
                                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                                    spannableString.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    String formatFileSize = AndroidUtilities.formatFileSize(y6Var.f40154g);
                                    if (y6Var.f40153f >= 0 ? !y6Var.f40156j : !d7Var.J) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    y1Var.e(spannableStringBuilder, formatFileSize, z12, z10, false);
                                    int i17 = y6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.j6.f20007k7;
                                    org.telegram.ui.Components.kp kpVar = y1Var.f22580r;
                                    if (kpVar != null) {
                                        kpVar.b(i17, i17, i18);
                                    }
                                    if (y6Var.f40153f < 0) {
                                        bool = Boolean.valueOf(d7Var.J);
                                    } else {
                                        bool = null;
                                    }
                                    y1Var.setCollapsed(bool);
                                    if (y6Var.f40153f == -1) {
                                        y1Var.d(new a(this, 7), new org.telegram.messenger.video.g(10, this, y1Var));
                                    } else {
                                        y1Var.d(null, null);
                                    }
                                    y1Var.setPad(y6Var.f40155i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                        CacheByChatsController cacheByChatsController = d7Var.getMessagesController().getCacheByChatsController();
                        int i19 = y6Var.f40152c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((y6) arrayList.get(i10)).f40152c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((y6) arrayList.get(i10)).f40152c == 0) {
                            n8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((y6) arrayList.get(i10)).f40152c == 1) {
                            n8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((y6) arrayList.get(i10)).f40152c == 2) {
                            n8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((y6) arrayList.get(i10)).f40152c == 3) {
                            n8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        n8Var.setSubtitle(str);
                        return;
                    }
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    l4Var.setText(((y6) arrayList.get(i10)).d);
                    ((y6) arrayList.get(i10)).getClass();
                    l4Var.setTopMargin(15);
                    ((y6) arrayList.get(i10)).getClass();
                    l4Var.setBottomMargin(0);
                    return;
                }
                final org.telegram.ui.Components.hy0 hy0Var = (org.telegram.ui.Components.hy0) view;
                boolean z13 = d7Var.I;
                long j13 = d7Var.f33355f;
                long j14 = d7Var.E;
                long j15 = d7Var.G;
                long j16 = d7Var.F;
                cb.m mVar = hy0Var.F;
                View view2 = hy0Var.f25522w;
                TextView textView = hy0Var.f25519n;
                TextView textView2 = hy0Var.h;
                TextView textView3 = hy0Var.v;
                org.telegram.ui.Cells.z9 z9Var = hy0Var.f25524y;
                hy0Var.e = z13;
                TextView textView4 = hy0Var.f25520r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j15)));
                TextView textView5 = hy0Var.f25521s;
                long j17 = j16 - j15;
                textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j17)));
                if (z13) {
                    textView3.setVisibility(0);
                    textView2.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                    textView.setVisibility(8);
                    view2.setVisibility(8);
                    z9Var.setVisibility(8);
                    hy0Var.B = 0.0f;
                    hy0Var.C = 0.0f;
                    if (mVar != null) {
                        mVar.c(textView3);
                    }
                } else {
                    if (mVar != null) {
                        mVar.t(textView3);
                    }
                    textView3.setVisibility(8);
                    if (j14 > 0) {
                        i11 = 0;
                        view2.setVisibility(0);
                        z9Var.setVisibility(0);
                        textView2.setVisibility(0);
                        textView.setVisibility(8);
                        z9Var.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j14), false, true);
                        textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j14 + j13)));
                    } else {
                        i11 = 0;
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j13)));
                        view2.setVisibility(8);
                        z9Var.setVisibility(8);
                    }
                    textView4.setVisibility(i11);
                    textView5.setVisibility(i11);
                    float f12 = (float) j16;
                    float f13 = ((float) (j14 + j13)) / f12;
                    float f14 = ((float) j17) / f12;
                    if (hy0Var.B != f13) {
                        ValueAnimator valueAnimator = hy0Var.D;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(hy0Var.B, f13);
                        hy0Var.D = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        hy0 hy0Var2 = hy0Var;
                                        hy0Var2.getClass();
                                        hy0Var2.B = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        hy0Var2.invalidate();
                                        return;
                                    default:
                                        hy0 hy0Var3 = hy0Var;
                                        hy0Var3.getClass();
                                        hy0Var3.C = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        hy0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        hy0Var.D.start();
                    }
                    if (hy0Var.C != f14) {
                        ValueAnimator valueAnimator2 = hy0Var.E;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(hy0Var.C, f14);
                        hy0Var.E = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (r2) {
                                    case 0:
                                        hy0 hy0Var2 = hy0Var;
                                        hy0Var2.getClass();
                                        hy0Var2.B = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        hy0Var2.invalidate();
                                        return;
                                    default:
                                        hy0 hy0Var3 = hy0Var;
                                        hy0Var3.getClass();
                                        hy0Var3.C = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        hy0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        hy0Var.E.start();
                    }
                }
                z9Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                hy0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.z8) view).setText(AndroidUtilities.replaceTags(y6Var.e));
            return;
        }
        org.telegram.ui.Cells.z9 z9Var2 = (org.telegram.ui.Cells.z9) view;
        if (i10 == d7Var.H) {
            z9Var2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        u6 u6Var;
        int i11;
        p6 p6Var;
        Context context = this.d;
        if (i10 != 0) {
            d7 d7Var = this.e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f25515a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f25516b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f25517c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.I = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f29632k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    eg.h0 h0Var = new eg.h0(frameLayout, context, 21);
                    frameLayout.f25518f = h0Var;
                    frameLayout.addView(h0Var, k7.b6.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, k7.b6.c(-2.0f, -1));
                    dh.d dVar = new dh.d(context, 20);
                    linearLayout.addView(dVar, k7.b6.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.j6.f20256y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        cb.m mVar = new cb.m(textView);
                        frameLayout.F = mVar;
                        mVar.x(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    frameLayout.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    frameLayout.f25519n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f25520r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f25521s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    frameLayout.f25523x = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), frameLayout.f25523x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f25523x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f25523x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), frameLayout.f25523x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    dVar.addView(textView, k7.b6.c(-2.0f, -2));
                    dVar.addView(textView3, k7.b6.c(-2.0f, -2));
                    dVar.addView(textView2, k7.b6.c(-2.0f, -2));
                    dVar.addView(textView5, k7.b6.c(-2.0f, -2));
                    dVar.addView(textView4, k7.b6.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f25522w = view;
                    linearLayout.addView(view, k7.b6.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19882d7, false));
                    org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(frameLayout.getContext());
                    frameLayout.f25524y = z9Var;
                    linearLayout.addView(z9Var, k7.b6.n(-1, -2));
                    u6Var = frameLayout;
                    break;
                case 3:
                    u6Var = new org.telegram.ui.Cells.l4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.uv0 uv0Var = new org.telegram.ui.Components.uv0(context, null);
                    uv0Var.setCallback(new m.j0(16));
                    int i13 = SharedConfig.keepMedia;
                    if (i13 == 3) {
                        i11 = 0;
                    } else {
                        i11 = i13 + 1;
                    }
                    uv0Var.b(i11, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    u6Var = uv0Var;
                    break;
                case 5:
                    u6Var = new c7(d7Var.getParentActivity(), d7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(d7Var.getParentActivity(), null);
                    u00Var.setIsSingleCell(true);
                    u00Var.setItemsCount(3);
                    u00Var.setIgnoreHeightCheck(true);
                    u00Var.setViewType(25);
                    u6Var = u00Var;
                    break;
                case 7:
                    u6Var = new org.telegram.ui.Cells.n8(context);
                    break;
                case 8:
                    a7 a7Var = new a7(this, context, d7Var, 0);
                    d7Var.K = a7Var;
                    a7Var.setDelegate(new h(this, 7));
                    d7Var.K.setCacheModel(d7Var.V);
                    d7Var.S.a0(d7Var.K, AndroidUtilities.dp(40.0f));
                    a7Var.setLayoutParams(new f2.w0(-1, -1));
                    u6Var = a7Var;
                    break;
                case 9:
                    z6 z6Var = new z6(this, context);
                    d7Var.N = z6Var;
                    z6Var.setTag(-33024);
                    p6Var = z6Var;
                    u6Var = p6Var;
                    break;
                case 10:
                    p6 p6Var2 = new p6(d7Var, context);
                    d7Var.O = p6Var2;
                    p6Var2.setTag(-33024);
                    p6Var = p6Var2;
                    u6Var = p6Var;
                    break;
                case 11:
                    p6Var = new org.telegram.ui.Cells.y1(4, 21, this.d, d7Var.getResourceProvider(), false);
                    u6Var = p6Var;
                    break;
                case 12:
                    org.telegram.ui.Components.u00 u00Var2 = new org.telegram.ui.Components.u00(d7Var.getParentActivity(), null);
                    u00Var2.setIsSingleCell(true);
                    u00Var2.setItemsCount(1);
                    u00Var2.setIgnoreHeightCheck(true);
                    u00Var2.setViewType(26);
                    u6Var = u00Var2;
                    break;
                case 13:
                    u6 u6Var2 = new u6(d7Var, context);
                    d7Var.P = u6Var2;
                    u6Var = u6Var2;
                    break;
                case 14:
                    org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
                    float f10 = ((int) ((d7Var.F / 1024) / 1024)) / 1000.0f;
                    ArrayList arrayList = new ArrayList();
                    if (f10 <= 17.0f) {
                        arrayList.add(2);
                    }
                    if (f10 > 5.0f) {
                        arrayList.add(5);
                    }
                    if (f10 > 16.0f) {
                        arrayList.add(16);
                    }
                    if (f10 > 32.0f) {
                        arrayList.add(32);
                    }
                    arrayList.add(Integer.MAX_VALUE);
                    String[] strArr = new String[arrayList.size()];
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        if (((Integer) arrayList.get(i14)).intValue() == 1) {
                            strArr[i14] = "300 MB";
                        } else if (((Integer) arrayList.get(i14)).intValue() == Integer.MAX_VALUE) {
                            strArr[i14] = LocaleController.getString(R.string.NoLimit);
                        } else {
                            strArr[i14] = String.format("%d GB", arrayList.get(i14));
                        }
                    }
                    uv0Var2.setCallback(new c1(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    uv0Var2.b(indexOf2, null, strArr);
                    u6Var = uv0Var2;
                    break;
                default:
                    u6Var = new org.telegram.ui.Cells.z8(context);
                    break;
            }
        } else {
            u6Var = new org.telegram.ui.Cells.z9(context);
        }
        return new f2.l1(u6Var);
    }
}
