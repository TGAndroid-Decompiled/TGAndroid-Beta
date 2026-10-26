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
public final class a7 extends qg.b {
    public final Context d;
    public final c7 e;

    public a7(c7 c7Var, Context context) {
        this.e = c7Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        c7 c7Var = this.e;
        if (e1Var.b() != c7Var.J) {
            int i10 = e1Var.f47741f;
            if ((i10 != 2 || c7Var.G <= 0 || c7Var.K) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f38355g0.size();
    }

    @Override
    public final int j(int i10) {
        return ((y6) this.e.f38355g0.get(i10)).f47040a;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        float f7;
        float f10;
        boolean z10;
        String format;
        boolean z11;
        Boolean bool;
        c7 c7Var = this.e;
        ArrayList arrayList = c7Var.f38355g0;
        y6 y6Var = (y6) arrayList.get(i10);
        int i12 = e1Var.f47741f;
        View view = e1Var.f47738a;
        String str = null;
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 7) {
                            switch (i12) {
                                case 9:
                                    c7Var.u0();
                                    return;
                                case 10:
                                    o6 o6Var = c7Var.X;
                                    if (o6Var != null && !c7Var.K) {
                                        long j10 = c7Var.G;
                                        if (j10 > 0) {
                                            z12 = true;
                                        }
                                        long j11 = c7Var.H;
                                        int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                        if (i13 <= 0) {
                                            f7 = 0.0f;
                                        } else {
                                            f7 = ((float) j10) / ((float) j11);
                                        }
                                        long j12 = c7Var.I;
                                        if (j12 > 0 && i13 > 0) {
                                            f10 = ((float) (j11 - j12)) / ((float) j11);
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        o6Var.b(f7, f10, z12);
                                        return;
                                    }
                                    return;
                                case 11:
                                    org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                    int i14 = y6Var.f45970f;
                                    if (i14 < 0) {
                                        z10 = c7Var.p0();
                                    } else {
                                        z10 = c7Var.d[i14];
                                    }
                                    boolean z13 = z10;
                                    CharSequence charSequence = y6Var.d;
                                    int[] iArr = c7Var.U;
                                    int i15 = y6Var.f45970f;
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
                                    spannableString.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    String formatFileSize = AndroidUtilities.formatFileSize(y6Var.f45971g);
                                    if (y6Var.f45970f >= 0 ? !y6Var.f45973j : !c7Var.L) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    y1Var.e(spannableStringBuilder, formatFileSize, z13, z11, false);
                                    int i17 = y6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.y6.f23485k7;
                                    org.telegram.ui.Components.zp zpVar = y1Var.f25741r;
                                    if (zpVar != null) {
                                        zpVar.b(i17, i17, i18);
                                    }
                                    if (y6Var.f45970f < 0) {
                                        bool = Boolean.valueOf(c7Var.L);
                                    } else {
                                        bool = null;
                                    }
                                    y1Var.setCollapsed(bool);
                                    if (y6Var.f45970f == -1) {
                                        y1Var.d(new a(this, 6), new org.telegram.ui.ActionBar.u1(5, this, y1Var));
                                    } else {
                                        y1Var.d(null, null);
                                    }
                                    y1Var.setPad(y6Var.f45972i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                        CacheByChatsController cacheByChatsController = c7Var.getMessagesController().getCacheByChatsController();
                        int i19 = y6Var.f45969c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((y6) arrayList.get(i10)).f45969c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((y6) arrayList.get(i10)).f45969c == 0) {
                            v8Var.r(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((y6) arrayList.get(i10)).f45969c == 1) {
                            v8Var.r(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((y6) arrayList.get(i10)).f45969c == 2) {
                            v8Var.r(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((y6) arrayList.get(i10)).f45969c == 3) {
                            v8Var.r(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        v8Var.setSubtitle(str);
                        return;
                    }
                    org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                    q4Var.setText(((y6) arrayList.get(i10)).d);
                    ((y6) arrayList.get(i10)).getClass();
                    q4Var.setTopMargin(15);
                    ((y6) arrayList.get(i10)).getClass();
                    q4Var.setBottomMargin(0);
                    return;
                }
                final org.telegram.ui.Components.lz0 lz0Var = (org.telegram.ui.Components.lz0) view;
                boolean z14 = c7Var.K;
                long j13 = c7Var.e;
                long j14 = c7Var.G;
                long j15 = c7Var.I;
                long j16 = c7Var.H;
                c2.b bVar = lz0Var.I;
                View view2 = lz0Var.f30343w;
                TextView textView = lz0Var.f30340n;
                TextView textView2 = lz0Var.h;
                TextView textView3 = lz0Var.v;
                org.telegram.ui.Cells.ga gaVar = lz0Var.f30345y;
                lz0Var.e = z14;
                TextView textView4 = lz0Var.f30341r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j15)));
                TextView textView5 = lz0Var.f30342s;
                long j17 = j16 - j15;
                textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j17)));
                if (z14) {
                    textView3.setVisibility(0);
                    textView2.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                    textView.setVisibility(8);
                    view2.setVisibility(8);
                    gaVar.setVisibility(8);
                    lz0Var.E = 0.0f;
                    lz0Var.F = 0.0f;
                    if (bVar != null) {
                        bVar.c(textView3);
                    }
                } else {
                    if (bVar != null) {
                        bVar.v(textView3);
                    }
                    textView3.setVisibility(8);
                    if (j14 > 0) {
                        i11 = 0;
                        view2.setVisibility(0);
                        gaVar.setVisibility(0);
                        textView2.setVisibility(0);
                        textView.setVisibility(8);
                        gaVar.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j14), false, true);
                        textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j14 + j13)));
                    } else {
                        i11 = 0;
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j13)));
                        view2.setVisibility(8);
                        gaVar.setVisibility(8);
                    }
                    textView4.setVisibility(i11);
                    textView5.setVisibility(i11);
                    float f11 = (float) j16;
                    float f12 = ((float) (j14 + j13)) / f11;
                    float f13 = ((float) j17) / f11;
                    if (lz0Var.E != f12) {
                        ValueAnimator valueAnimator = lz0Var.G;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(lz0Var.E, f12);
                        lz0Var.G = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        lz0 lz0Var2 = lz0Var;
                                        lz0Var2.getClass();
                                        lz0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        lz0Var2.invalidate();
                                        return;
                                    default:
                                        lz0 lz0Var3 = lz0Var;
                                        lz0Var3.getClass();
                                        lz0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        lz0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        lz0Var.G.start();
                    }
                    if (lz0Var.F != f13) {
                        ValueAnimator valueAnimator2 = lz0Var.H;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(lz0Var.F, f13);
                        lz0Var.H = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (r2) {
                                    case 0:
                                        lz0 lz0Var2 = lz0Var;
                                        lz0Var2.getClass();
                                        lz0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        lz0Var2.invalidate();
                                        return;
                                    default:
                                        lz0 lz0Var3 = lz0Var;
                                        lz0Var3.getClass();
                                        lz0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        lz0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        lz0Var.H.start();
                    }
                }
                org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.G6, null);
                lz0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.i9) view).setText(AndroidUtilities.replaceTags(y6Var.e));
            return;
        }
        org.telegram.ui.Cells.ga gaVar2 = (org.telegram.ui.Cells.ga) view;
        if (i10 == c7Var.J) {
            gaVar2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.c10 c10Var;
        int i11;
        z6 z6Var;
        Context context = this.d;
        if (i10 != 0) {
            c7 c7Var = this.e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f30336a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f30337b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f30338c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.L = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f33824k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    bi.cc ccVar = new bi.cc(frameLayout, context, 27);
                    frameLayout.f30339f = ccVar;
                    frameLayout.addView(ccVar, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                    di.i4 i4Var = new di.i4(context, 19);
                    linearLayout.addView(i4Var, org.telegram.ui.Components.gb1.o(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.y6.f23748y6;
                    org.telegram.ui.ActionBar.f7.V(textView, i12, null);
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        c2.b bVar = new c2.b(textView);
                        frameLayout.I = bVar;
                        bVar.A(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    frameLayout.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    org.telegram.ui.ActionBar.f7.V(textView2, i12, null);
                    TextView textView3 = new TextView(context);
                    frameLayout.f30340n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    org.telegram.ui.ActionBar.f7.V(textView3, i12, null);
                    TextView textView4 = new TextView(context);
                    frameLayout.f30341r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    org.telegram.ui.ActionBar.f7.V(textView4, i12, null);
                    TextView textView5 = new TextView(context);
                    frameLayout.f30342s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    org.telegram.ui.ActionBar.f7.V(textView5, i12, null);
                    frameLayout.f30344x = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), frameLayout.f30344x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), i0.a.o(frameLayout.f30344x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), i0.a.o(frameLayout.f30344x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(10.0f), frameLayout.f30344x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    i4Var.addView(textView, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                    i4Var.addView(textView3, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                    i4Var.addView(textView2, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                    i4Var.addView(textView5, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                    i4Var.addView(textView4, org.telegram.ui.Components.gb1.g(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f30343w = view;
                    linearLayout.addView(view, org.telegram.ui.Components.gb1.x(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d7, view, null);
                    org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(frameLayout.getContext());
                    frameLayout.f30345y = gaVar;
                    linearLayout.addView(gaVar, org.telegram.ui.Components.gb1.r(-1, -2));
                    c10Var = frameLayout;
                    break;
                case 3:
                    c10Var = new org.telegram.ui.Cells.q4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, null);
                    zw0Var.setCallback(new m4.x0(24));
                    int i13 = SharedConfig.keepMedia;
                    if (i13 == 3) {
                        i11 = 0;
                    } else {
                        i11 = i13 + 1;
                    }
                    zw0Var.b(i11, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    c10Var = zw0Var;
                    break;
                case 5:
                    c10Var = new b7(c7Var.getParentActivity(), c7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.c10 c10Var2 = new org.telegram.ui.Components.c10(c7Var.getParentActivity(), null);
                    c10Var2.setIsSingleCell(true);
                    c10Var2.setItemsCount(3);
                    c10Var2.setIgnoreHeightCheck(true);
                    c10Var2.setViewType(25);
                    c10Var = c10Var2;
                    break;
                case 7:
                    c10Var = new org.telegram.ui.Cells.v8(context);
                    break;
                case 8:
                    org.telegram.ui.Components.lw0 lw0Var = c7Var.f38348b0;
                    lw0Var.getClass();
                    View ccVar2 = new bi.cc(lw0Var, context, 24);
                    ccVar2.setTag(-33024);
                    ccVar2.setLayoutParams(new s4.q0(-1, -1));
                    c10Var = ccVar2;
                    break;
                case 9:
                    z6 z6Var2 = new z6(this, context);
                    c7Var.W = z6Var2;
                    z6Var2.setTag(-33024);
                    z6Var = z6Var2;
                    c10Var = z6Var;
                    break;
                case 10:
                    o6 o6Var = new o6(c7Var, context);
                    c7Var.X = o6Var;
                    o6Var.setTag(-33024);
                    z6Var = o6Var;
                    c10Var = z6Var;
                    break;
                case 11:
                    z6Var = new org.telegram.ui.Cells.y1(4, 21, this.d, c7Var.getResourceProvider(), false);
                    c10Var = z6Var;
                    break;
                case 12:
                    org.telegram.ui.Components.c10 c10Var3 = new org.telegram.ui.Components.c10(c7Var.getParentActivity(), null);
                    c10Var3.setIsSingleCell(true);
                    c10Var3.setItemsCount(1);
                    c10Var3.setIgnoreHeightCheck(true);
                    c10Var3.setViewType(26);
                    c10Var = c10Var3;
                    break;
                case 13:
                    t6 t6Var = new t6(c7Var, context);
                    c7Var.Y = t6Var;
                    c10Var = t6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.zw0 zw0Var2 = new org.telegram.ui.Components.zw0(context, null);
                    float f7 = ((int) ((c7Var.H / 1024) / 1024)) / 1000.0f;
                    ArrayList arrayList = new ArrayList();
                    if (f7 <= 17.0f) {
                        arrayList.add(2);
                    }
                    if (f7 > 5.0f) {
                        arrayList.add(5);
                    }
                    if (f7 > 16.0f) {
                        arrayList.add(16);
                    }
                    if (f7 > 32.0f) {
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
                    zw0Var2.setCallback(new y0(arrayList, 10));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    zw0Var2.b(indexOf2, null, strArr);
                    c10Var = zw0Var2;
                    break;
                default:
                    c10Var = new org.telegram.ui.Cells.i9(context);
                    break;
            }
        } else {
            c10Var = new org.telegram.ui.Cells.ga(context);
        }
        return new s4.e1(c10Var);
    }
}
