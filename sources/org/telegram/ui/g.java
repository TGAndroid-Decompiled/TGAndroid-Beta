package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class g extends org.telegram.ui.ActionBar.r2 implements LocationController.LocationFetchCallback {
    public final int[] E;
    public int F;
    public boolean G;
    public org.telegram.ui.Components.ak0 f39498a;
    public GradientDrawable f39499b;
    public ei.n f39500c;
    public TextView d;
    public TextView e;
    public TextView f39501f;
    public LinearLayout h;
    public final TextView[] f39502n;
    public TextView f39503r;
    public int[] f39504s;
    public final int v;
    public boolean f39505w;
    public org.telegram.ui.Components.voip.k1 f39506x;
    public hb0 f39507y;

    public g(int i10) {
        super(null);
        this.f39502n = new TextView[6];
        this.E = new int[2];
        this.v = i10;
    }

    public final void a0(Runnable runnable) {
        this.f39507y = (hb0) runnable;
    }

    public final void b0(org.telegram.ui.Components.voip.k1 k1Var) {
        this.f39506x = k1Var;
    }

    public final void c0() {
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.Ph);
        boolean z10 = this.G;
        int[] iArr = this.E;
        if (!z10 || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.G = true;
            this.f39499b.setColors(iArr);
        }
        this.f39500c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
        if (this.f39500c.getBackground() == null) {
            ei.n nVar = this.f39500c;
            int dp = AndroidUtilities.dp(24.0f);
            nVar.setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, x02, x02));
        } else if (x02 != this.F) {
            org.telegram.ui.ActionBar.y6.E1(this.f39500c.getBackground(), x02, true);
        }
        this.F = x02;
        int[] iArr2 = this.f39504s;
        if (iArr2 != null && this.f39498a != null) {
            iArr2[0] = 3355443;
            iArr2[1] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false);
            int[] iArr3 = this.f39504s;
            iArr3[2] = 16777215;
            int i11 = org.telegram.ui.ActionBar.y6.f23356d6;
            iArr3[3] = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            int[] iArr4 = this.f39504s;
            iArr4[4] = 5285866;
            iArr4[5] = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            int[] iArr5 = this.f39504s;
            iArr5[6] = 2170912;
            iArr5[7] = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            org.telegram.ui.Components.ak0 ak0Var = this.f39498a;
            int[] iArr6 = this.f39504s;
            org.telegram.ui.Components.xj0 xj0Var = ak0Var.f26517b;
            if (xj0Var != null) {
                xj0Var.f34751n = iArr6;
                xj0Var.G();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        int i12;
        String str;
        int i13;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i14 = 3;
        int i15 = 0;
        if (kVar != null) {
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, kVar, null);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, org.telegram.ui.ActionBar.y6.f23694v8, null);
            org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.f23656t8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 19));
        }
        e eVar = new e(this, context, 0);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, eVar, null);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i16 = 2;
        viewGroup.setOnTouchListener(new ei.d(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        ?? imageView = new ImageView(context);
        this.f39498a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.e = textView;
        int i17 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(textView, i17, null);
        this.e.setGravity(1);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i18 = this.v;
        if (i18 == 3) {
            i17 = org.telegram.ui.ActionBar.y6.Oh;
        }
        org.telegram.ui.ActionBar.f7.V(textView2, i17, null);
        this.d.setGravity(1);
        float f12 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f39501f = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.D6, null);
        this.f39501f.setGravity(1);
        this.f39501f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f39501f.setTextSize(1, 15.0f);
        if (i18 == 6 || i18 == 3) {
            f7 = 24.0f;
            f10 = 2.0f;
            this.f39501f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f7 = 24.0f;
            f10 = 2.0f;
            this.f39501f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f39501f);
        if (i18 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(f7), 0);
            LinearLayout linearLayout2 = this.h;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            linearLayout2.setGravity(i10);
            viewGroup.addView(this.h);
            int i19 = 0;
            while (i19 < i14) {
                LinearLayout d = org.telegram.messenger.vh.d(context, i15);
                LinearLayout linearLayout3 = this.h;
                if (i19 != i16) {
                    f11 = 7.0f;
                } else {
                    f11 = 0.0f;
                }
                linearLayout3.addView(d, org.telegram.ui.Components.gb1.o(0.0f, 0.0f, 0.0f, f11, -2, -2));
                int i20 = i19 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f39502n;
                textViewArr[i20] = textView4;
                int i21 = org.telegram.ui.ActionBar.y6.G6;
                org.telegram.ui.ActionBar.f7.V(textView4, i21, null);
                TextView textView5 = textViewArr[i20];
                if (LocaleController.isRTL) {
                    i11 = i15;
                    i12 = 5;
                } else {
                    i11 = i15;
                    i12 = 3;
                }
                textView5.setGravity(i12);
                textViewArr[i20].setTextSize(1, f12);
                TextView textView6 = textViewArr[i20];
                if (LocaleController.isRTL) {
                    str = ".%d";
                } else {
                    str = "%d.";
                }
                int i22 = i19 + 1;
                Object[] objArr = new Object[1];
                objArr[i11] = Integer.valueOf(i22);
                textView6.setText(String.format(str, objArr));
                textViewArr[i20].setTypeface(AndroidUtilities.bold());
                int i23 = i20 + 1;
                TextView textView7 = new TextView(context);
                textViewArr[i23] = textView7;
                org.telegram.ui.ActionBar.f7.V(textView7, i21, null);
                TextView textView8 = textViewArr[i23];
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView8.setGravity(i13);
                textViewArr[i23].setTextSize(1, f12);
                if (i19 == 0) {
                    org.telegram.ui.ActionBar.f7.H(textViewArr[i23], org.telegram.ui.ActionBar.y6.J6, null);
                    org.telegram.ui.ActionBar.f7.D(textViewArr[i23], org.telegram.ui.ActionBar.y6.K6, null);
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i23].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.x61(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.y11) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i23].setText(spannableStringBuilder);
                } else if (i19 == 1) {
                    textViewArr[i23].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i23].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    d.setGravity(5);
                    d.addView(textViewArr[i23], org.telegram.ui.Components.gb1.p(1.0f, i11, -2));
                    d.addView(textViewArr[i20], org.telegram.ui.Components.gb1.o(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    d.addView(textViewArr[i20], org.telegram.ui.Components.gb1.o(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    d.addView(textViewArr[i23], org.telegram.ui.Components.gb1.r(-2, -2));
                }
                i19 = i22;
                i14 = 3;
                i15 = 0;
                i16 = 2;
                f12 = 15.0f;
            }
            this.f39501f.setVisibility(8);
        }
        TextView textView9 = new TextView(context);
        this.f39503r = textView9;
        org.telegram.ui.ActionBar.f7.V(textView9, org.telegram.ui.ActionBar.y6.D6, null);
        this.f39503r.setGravity(1);
        this.f39503r.setLineSpacing(AndroidUtilities.dp(f10), 1.0f);
        this.f39503r.setTextSize(1, 13.0f);
        this.f39503r.setVisibility(8);
        this.f39503r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.f39503r);
        this.f39499b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ei.n nVar = new ei.n(this, context);
        this.f39500c = nVar;
        org.telegram.ui.Components.gb1.c(nVar, 0.02f, 1.2f);
        this.f39500c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f39500c.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(this.f39500c, org.telegram.ui.ActionBar.y6.Sh, null);
        this.f39500c.setTextSize(1, 14.0f);
        this.f39500c.setTypeface(AndroidUtilities.bold());
        ei.n nVar2 = this.f39500c;
        int dp = AndroidUtilities.dp(f7);
        int i24 = org.telegram.ui.ActionBar.y6.Qh;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i24, false);
        org.telegram.ui.ActionBar.f7.R(nVar2, org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, x02, x02), null, org.telegram.ui.ActionBar.f7.N(i24), null);
        viewGroup.addView(this.f39500c);
        this.f39500c.setOnClickListener(new View.OnClickListener(this) {
            public final g f38704b;

            {
                this.f38704b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f38704b;
                        if (gVar.getParentActivity() != null) {
                            int i25 = gVar.v;
                            if (i25 != 0) {
                                if (i25 != 3) {
                                    if (i25 != 5) {
                                        if (i25 == 6) {
                                            gVar.presentFragment(new PasscodeActivity(1), true);
                                            hb0 hb0Var = gVar.f39507y;
                                            if (hb0Var != null) {
                                                AndroidUtilities.runOnUIThread(hb0Var);
                                                gVar.f39507y = null;
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (gVar.getParentActivity() != null) {
                                        if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            return;
                                        }
                                        y9.f0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                gVar.showDialog(alertDialog$Builder.f22368a);
                                return;
                            }
                            gVar.presentFragment(new nd(org.telegram.ui.Components.b10.g(0, "step")), true);
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f38704b;
                        if (!gVar2.f39498a.getAnimatedDrawable().f34749k0) {
                            gVar2.f39498a.getAnimatedDrawable().N(0, false, false);
                            gVar2.f39498a.d();
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f38704b;
                        if (!gVar3.f39498a.getAnimatedDrawable().f34749k0) {
                            gVar3.f39498a.getAnimatedDrawable().N(0, false, false);
                            gVar3.f39498a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f38704b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i18 != 0) {
            if (i18 != 3) {
                if (i18 != 5) {
                    if (i18 == 6) {
                        this.f39498a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f39498a.f(R.raw.utyan_passcode, 200, 200, null);
                        this.f39498a.setFocusable(false);
                        this.f39498a.setOnClickListener(new View.OnClickListener(this) {
                            public final g f38704b;

                            {
                                this.f38704b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        g gVar = this.f38704b;
                                        if (gVar.getParentActivity() != null) {
                                            int i25 = gVar.v;
                                            if (i25 != 0) {
                                                if (i25 != 3) {
                                                    if (i25 != 5) {
                                                        if (i25 == 6) {
                                                            gVar.presentFragment(new PasscodeActivity(1), true);
                                                            hb0 hb0Var = gVar.f39507y;
                                                            if (hb0Var != null) {
                                                                AndroidUtilities.runOnUIThread(hb0Var);
                                                                gVar.f39507y = null;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    } else if (gVar.getParentActivity() != null) {
                                                        if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                            gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                            return;
                                                        }
                                                        y9.f0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                                gVar.showDialog(alertDialog$Builder.f22368a);
                                                return;
                                            }
                                            gVar.presentFragment(new nd(org.telegram.ui.Components.b10.g(0, "step")), true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        g gVar2 = this.f38704b;
                                        if (!gVar2.f39498a.getAnimatedDrawable().f34749k0) {
                                            gVar2.f39498a.getAnimatedDrawable().N(0, false, false);
                                            gVar2.f39498a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        g gVar3 = this.f38704b;
                                        if (!gVar3.f39498a.getAnimatedDrawable().f34749k0) {
                                            gVar3.f39498a.getAnimatedDrawable().N(0, false, false);
                                            gVar3.f39498a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f38704b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.e.setText(LocaleController.getString(R.string.Passcode));
                        this.f39501f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
                        this.f39500c.setText(LocaleController.getString(R.string.EnablePasscode));
                        this.f39498a.d();
                        this.f39505w = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f39504s = iArr;
                    this.f39498a.f(R.raw.qr_login, 334, 334, iArr);
                    this.f39498a.setScaleType(ImageView.ScaleType.CENTER);
                    this.e.setText(LocaleController.getString(R.string.AuthAnotherClient));
                    this.f39500c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                    this.f39498a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f39498a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f39498a.f(R.raw.utyan_change_number, 200, 200, null);
                this.f39498a.setOnClickListener(new View.OnClickListener(this) {
                    public final g f38704b;

                    {
                        this.f38704b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                g gVar = this.f38704b;
                                if (gVar.getParentActivity() != null) {
                                    int i25 = gVar.v;
                                    if (i25 != 0) {
                                        if (i25 != 3) {
                                            if (i25 != 5) {
                                                if (i25 == 6) {
                                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                                    hb0 hb0Var = gVar.f39507y;
                                                    if (hb0Var != null) {
                                                        AndroidUtilities.runOnUIThread(hb0Var);
                                                        gVar.f39507y = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (gVar.getParentActivity() != null) {
                                                if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                y9.f0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                        alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        gVar.showDialog(alertDialog$Builder.f22368a);
                                        return;
                                    }
                                    gVar.presentFragment(new nd(org.telegram.ui.Components.b10.g(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                g gVar2 = this.f38704b;
                                if (!gVar2.f39498a.getAnimatedDrawable().f34749k0) {
                                    gVar2.f39498a.getAnimatedDrawable().N(0, false, false);
                                    gVar2.f39498a.d();
                                    return;
                                }
                                return;
                            case 2:
                                g gVar3 = this.f38704b;
                                if (!gVar3.f39498a.getAnimatedDrawable().f34749k0) {
                                    gVar3.f39498a.getAnimatedDrawable().N(0, false, false);
                                    gVar3.f39498a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f38704b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                UserConfig userConfig = getUserConfig();
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                if (user == null) {
                    user = userConfig.getCurrentUser();
                }
                if (user != null) {
                    this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.vh.g(new StringBuilder("+"), user.phone, kf.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final g f38704b;

                    {
                        this.f38704b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                g gVar = this.f38704b;
                                if (gVar.getParentActivity() != null) {
                                    int i25 = gVar.v;
                                    if (i25 != 0) {
                                        if (i25 != 3) {
                                            if (i25 != 5) {
                                                if (i25 == 6) {
                                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                                    hb0 hb0Var = gVar.f39507y;
                                                    if (hb0Var != null) {
                                                        AndroidUtilities.runOnUIThread(hb0Var);
                                                        gVar.f39507y = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (gVar.getParentActivity() != null) {
                                                if (gVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    gVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                y9.f0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                        alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        gVar.showDialog(alertDialog$Builder.f22368a);
                                        return;
                                    }
                                    gVar.presentFragment(new nd(org.telegram.ui.Components.b10.g(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                g gVar2 = this.f38704b;
                                if (!gVar2.f39498a.getAnimatedDrawable().f34749k0) {
                                    gVar2.f39498a.getAnimatedDrawable().N(0, false, false);
                                    gVar2.f39498a.d();
                                    return;
                                }
                                return;
                            case 2:
                                g gVar3 = this.f38704b;
                                if (!gVar3.f39498a.getAnimatedDrawable().f34749k0) {
                                    gVar3.f39498a.getAnimatedDrawable().N(0, false, false);
                                    gVar3.f39498a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f38704b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                org.telegram.messenger.t.n(R.string.PhoneNumberHelp, this.f39501f);
                this.f39500c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                this.f39498a.d();
                this.f39505w = true;
            }
        } else {
            this.f39498a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f39498a.f(R.raw.channel_create, 200, 200, null);
            this.e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f39501f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.f39500c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.f39498a.d();
            this.f39505w = true;
        }
        if (this.f39505w) {
            this.f39500c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.f39500c.setTextSize(1, 15.0f);
        }
        c0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.f39502n;
        TextView textView = textViewArr[0];
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        TextView textView = this.d;
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i10 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                y9.f0(getParentActivity(), 1, new f(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22368a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            int i11 = R.raw.permission_request_camera;
            int i12 = org.telegram.ui.ActionBar.y6.L5;
            alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.y6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        c0();
    }
}
