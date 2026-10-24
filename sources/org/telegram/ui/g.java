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
public final class g extends org.telegram.ui.ActionBar.o2 implements LocationController.LocationFetchCallback {
    public final int[] E;
    public int F;
    public boolean G;
    public org.telegram.ui.Components.ak0 f37400a;
    public GradientDrawable f37401b;
    public di.n f37402c;
    public TextView d;
    public TextView e;
    public TextView f37403f;
    public LinearLayout h;
    public final TextView[] f37404n;
    public TextView f37405r;
    public int[] f37406s;
    public final int v;
    public boolean f37407w;
    public ks f37408x;
    public kb0 f37409y;

    public g(int i10) {
        super(null);
        this.f37404n = new TextView[6];
        this.E = new int[2];
        this.v = i10;
    }

    public final void Z(Runnable runnable) {
        this.f37409y = (kb0) runnable;
    }

    public final void a0(ks ksVar) {
        this.f37408x = ksVar;
    }

    public final void b0() {
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Ph);
        boolean z10 = this.G;
        int[] iArr = this.E;
        if (!z10 || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.G = true;
            this.f37401b.setColors(iArr);
        }
        this.f37402c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        if (this.f37402c.getBackground() == null) {
            di.n nVar = this.f37402c;
            int dp = AndroidUtilities.dp(24.0f);
            nVar.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, x02, x02));
        } else if (x02 != this.F) {
            org.telegram.ui.ActionBar.k6.E1(this.f37402c.getBackground(), x02, true);
        }
        this.F = x02;
        int[] iArr2 = this.f37406s;
        if (iArr2 != null && this.f37400a != null) {
            iArr2[0] = 3355443;
            iArr2[1] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
            int[] iArr3 = this.f37406s;
            iArr3[2] = 16777215;
            int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
            iArr3[3] = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            int[] iArr4 = this.f37406s;
            iArr4[4] = 5285866;
            iArr4[5] = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            int[] iArr5 = this.f37406s;
            iArr5[6] = 2170912;
            iArr5[7] = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            org.telegram.ui.Components.ak0 ak0Var = this.f37400a;
            int[] iArr6 = this.f37406s;
            org.telegram.ui.Components.xj0 xj0Var = ak0Var.f24741b;
            if (xj0Var != null) {
                xj0Var.f32609n = iArr6;
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
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, kVar, null);
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.f21519v8, null);
            org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f21482t8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 19));
        }
        e eVar = new e(this, context, 0);
        this.fragmentView = eVar;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, eVar, null);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i16 = 2;
        viewGroup.setOnTouchListener(new di.d(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        ?? imageView = new ImageView(context);
        this.f37400a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.e = textView;
        int i17 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i17, null);
        this.e.setGravity(1);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i18 = this.v;
        if (i18 == 3) {
            i17 = org.telegram.ui.ActionBar.k6.Oh;
        }
        org.telegram.ui.ActionBar.r6.W(textView2, i17, null);
        this.d.setGravity(1);
        float f12 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f37403f = textView3;
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.D6, null);
        this.f37403f.setGravity(1);
        this.f37403f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f37403f.setTextSize(1, 15.0f);
        if (i18 == 6 || i18 == 3) {
            f7 = 24.0f;
            f10 = 2.0f;
            this.f37403f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f7 = 24.0f;
            f10 = 2.0f;
            this.f37403f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f37403f);
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
                LinearLayout e = org.telegram.messenger.tl.e(context, i15);
                LinearLayout linearLayout3 = this.h;
                if (i19 != i16) {
                    f11 = 7.0f;
                } else {
                    f11 = 0.0f;
                }
                linearLayout3.addView(e, w7.z5.k(0.0f, 0.0f, 0.0f, f11, -2, -2));
                int i20 = i19 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f37404n;
                textViewArr[i20] = textView4;
                int i21 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.ui.ActionBar.r6.W(textView4, i21, null);
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
                org.telegram.ui.ActionBar.r6.W(textView7, i21, null);
                TextView textView8 = textViewArr[i23];
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView8.setGravity(i13);
                textViewArr[i23].setTextSize(1, f12);
                if (i19 == 0) {
                    org.telegram.ui.ActionBar.r6.I(textViewArr[i23], org.telegram.ui.ActionBar.k6.J6, null);
                    org.telegram.ui.ActionBar.r6.E(textViewArr[i23], org.telegram.ui.ActionBar.k6.K6, null);
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i23].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.p61(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.p11) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i23].setText(spannableStringBuilder);
                } else if (i19 == 1) {
                    textViewArr[i23].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i23].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    e.setGravity(5);
                    e.addView(textViewArr[i23], w7.z5.l(1.0f, i11, -2));
                    e.addView(textViewArr[i20], w7.z5.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    e.addView(textViewArr[i20], w7.z5.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    e.addView(textViewArr[i23], w7.z5.n(-2, -2));
                }
                i19 = i22;
                i14 = 3;
                i15 = 0;
                i16 = 2;
                f12 = 15.0f;
            }
            this.f37403f.setVisibility(8);
        }
        TextView textView9 = new TextView(context);
        this.f37405r = textView9;
        org.telegram.ui.ActionBar.r6.W(textView9, org.telegram.ui.ActionBar.k6.D6, null);
        this.f37405r.setGravity(1);
        this.f37405r.setLineSpacing(AndroidUtilities.dp(f10), 1.0f);
        this.f37405r.setTextSize(1, 13.0f);
        this.f37405r.setVisibility(8);
        this.f37405r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.f37405r);
        this.f37401b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        di.n nVar = new di.n(this, context);
        this.f37402c = nVar;
        w7.b6.b(nVar, 0.02f, 1.2f);
        this.f37402c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f37402c.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(this.f37402c, org.telegram.ui.ActionBar.k6.Sh, null);
        this.f37402c.setTextSize(1, 14.0f);
        this.f37402c.setTypeface(AndroidUtilities.bold());
        di.n nVar2 = this.f37402c;
        int dp = AndroidUtilities.dp(f7);
        int i24 = org.telegram.ui.ActionBar.k6.Qh;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i24, false);
        org.telegram.ui.ActionBar.r6.S(nVar2, org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, x02, x02), null, org.telegram.ui.ActionBar.r6.O(i24), null);
        viewGroup.addView(this.f37402c);
        this.f37402c.setOnClickListener(new View.OnClickListener(this) {
            public final g f36431b;

            {
                this.f36431b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g gVar = this.f36431b;
                        if (gVar.getParentActivity() != null) {
                            int i25 = gVar.v;
                            if (i25 != 0) {
                                if (i25 != 3) {
                                    if (i25 != 5) {
                                        if (i25 == 6) {
                                            gVar.presentFragment(new PasscodeActivity(1), true);
                                            kb0 kb0Var = gVar.f37409y;
                                            if (kb0Var != null) {
                                                AndroidUtilities.runOnUIThread(kb0Var);
                                                gVar.f37409y = null;
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
                                        w9.e0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                gVar.showDialog(alertDialog$Builder.f20679a);
                                return;
                            }
                            gVar.presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")), true);
                            return;
                        }
                        return;
                    case 1:
                        g gVar2 = this.f36431b;
                        if (!gVar2.f37400a.getAnimatedDrawable().f32607k0) {
                            gVar2.f37400a.getAnimatedDrawable().N(0, false, false);
                            gVar2.f37400a.d();
                            return;
                        }
                        return;
                    case 2:
                        g gVar3 = this.f36431b;
                        if (!gVar3.f37400a.getAnimatedDrawable().f32607k0) {
                            gVar3.f37400a.getAnimatedDrawable().N(0, false, false);
                            gVar3.f37400a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f36431b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i18 != 0) {
            if (i18 != 3) {
                if (i18 != 5) {
                    if (i18 == 6) {
                        this.f37400a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f37400a.f(R.raw.utyan_passcode, 200, 200, null);
                        this.f37400a.setFocusable(false);
                        this.f37400a.setOnClickListener(new View.OnClickListener(this) {
                            public final g f36431b;

                            {
                                this.f36431b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        g gVar = this.f36431b;
                                        if (gVar.getParentActivity() != null) {
                                            int i25 = gVar.v;
                                            if (i25 != 0) {
                                                if (i25 != 3) {
                                                    if (i25 != 5) {
                                                        if (i25 == 6) {
                                                            gVar.presentFragment(new PasscodeActivity(1), true);
                                                            kb0 kb0Var = gVar.f37409y;
                                                            if (kb0Var != null) {
                                                                AndroidUtilities.runOnUIThread(kb0Var);
                                                                gVar.f37409y = null;
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
                                                        w9.e0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                                gVar.showDialog(alertDialog$Builder.f20679a);
                                                return;
                                            }
                                            gVar.presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")), true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        g gVar2 = this.f36431b;
                                        if (!gVar2.f37400a.getAnimatedDrawable().f32607k0) {
                                            gVar2.f37400a.getAnimatedDrawable().N(0, false, false);
                                            gVar2.f37400a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        g gVar3 = this.f36431b;
                                        if (!gVar3.f37400a.getAnimatedDrawable().f32607k0) {
                                            gVar3.f37400a.getAnimatedDrawable().N(0, false, false);
                                            gVar3.f37400a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f36431b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.e.setText(LocaleController.getString(R.string.Passcode));
                        this.f37403f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
                        this.f37402c.setText(LocaleController.getString(R.string.EnablePasscode));
                        this.f37400a.d();
                        this.f37407w = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f37406s = iArr;
                    this.f37400a.f(R.raw.qr_login, 334, 334, iArr);
                    this.f37400a.setScaleType(ImageView.ScaleType.CENTER);
                    this.e.setText(LocaleController.getString(R.string.AuthAnotherClient));
                    this.f37402c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                    this.f37400a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f37400a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f37400a.f(R.raw.utyan_change_number, 200, 200, null);
                this.f37400a.setOnClickListener(new View.OnClickListener(this) {
                    public final g f36431b;

                    {
                        this.f36431b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                g gVar = this.f36431b;
                                if (gVar.getParentActivity() != null) {
                                    int i25 = gVar.v;
                                    if (i25 != 0) {
                                        if (i25 != 3) {
                                            if (i25 != 5) {
                                                if (i25 == 6) {
                                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                                    kb0 kb0Var = gVar.f37409y;
                                                    if (kb0Var != null) {
                                                        AndroidUtilities.runOnUIThread(kb0Var);
                                                        gVar.f37409y = null;
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
                                                w9.e0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        gVar.showDialog(alertDialog$Builder.f20679a);
                                        return;
                                    }
                                    gVar.presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                g gVar2 = this.f36431b;
                                if (!gVar2.f37400a.getAnimatedDrawable().f32607k0) {
                                    gVar2.f37400a.getAnimatedDrawable().N(0, false, false);
                                    gVar2.f37400a.d();
                                    return;
                                }
                                return;
                            case 2:
                                g gVar3 = this.f36431b;
                                if (!gVar3.f37400a.getAnimatedDrawable().f32607k0) {
                                    gVar3.f37400a.getAnimatedDrawable().N(0, false, false);
                                    gVar3.f37400a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f36431b.getParentLayout()).l(true, false);
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
                    this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.tl.h(new StringBuilder("+"), user.phone, jf.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final g f36431b;

                    {
                        this.f36431b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                g gVar = this.f36431b;
                                if (gVar.getParentActivity() != null) {
                                    int i25 = gVar.v;
                                    if (i25 != 0) {
                                        if (i25 != 3) {
                                            if (i25 != 5) {
                                                if (i25 == 6) {
                                                    gVar.presentFragment(new PasscodeActivity(1), true);
                                                    kb0 kb0Var = gVar.f37409y;
                                                    if (kb0Var != null) {
                                                        AndroidUtilities.runOnUIThread(kb0Var);
                                                        gVar.f37409y = null;
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
                                                w9.e0(gVar.getParentActivity(), 1, new f(gVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gVar.getParentActivity());
                                        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(gVar, 1));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        gVar.showDialog(alertDialog$Builder.f20679a);
                                        return;
                                    }
                                    gVar.presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                g gVar2 = this.f36431b;
                                if (!gVar2.f37400a.getAnimatedDrawable().f32607k0) {
                                    gVar2.f37400a.getAnimatedDrawable().N(0, false, false);
                                    gVar2.f37400a.d();
                                    return;
                                }
                                return;
                            case 2:
                                g gVar3 = this.f36431b;
                                if (!gVar3.f37400a.getAnimatedDrawable().f32607k0) {
                                    gVar3.f37400a.getAnimatedDrawable().N(0, false, false);
                                    gVar3.f37400a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f36431b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                org.telegram.messenger.v0.m(R.string.PhoneNumberHelp, this.f37403f);
                this.f37402c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                this.f37400a.d();
                this.f37407w = true;
            }
        } else {
            this.f37400a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f37400a.f(R.raw.channel_create, 200, 200, null);
            this.e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f37403f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.f37402c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.f37400a.d();
            this.f37407w = true;
        }
        if (this.f37407w) {
            this.f37402c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.f37402c.setTextSize(1, 15.0f);
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.f37404n;
        TextView textView = textViewArr[0];
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, true)) > 0.699999988079071d) {
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
                w9.e0(getParentActivity(), 1, new f(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20679a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            int i11 = R.raw.permission_request_camera;
            int i12 = org.telegram.ui.ActionBar.k6.L5;
            alertDialog$Builder.m(i11, 72, org.telegram.ui.ActionBar.k6.x0(null, i12, false), null);
            alertDialog$Builder.n(i12, null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        b0();
    }
}
