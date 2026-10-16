package org.telegram.ui;

import android.content.Context;
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
public final class h extends org.telegram.ui.ActionBar.m2 implements LocationController.LocationFetchCallback {
    public org.telegram.ui.Components.bk0 f36337a;
    public GradientDrawable f36338b;
    public ci.n f36339c;
    public TextView d;
    public TextView e;
    public TextView f36340f;
    public LinearLayout h;
    public final TextView[] f36341n;
    public TextView f36342r;
    public int[] f36343s;
    public final int v;
    public boolean f36344w;
    public qw f36345x;
    public dc0 f36346y;

    public h(int i10) {
        super(null);
        this.f36341n = new TextView[6];
        this.v = i10;
    }

    public final void Z(Runnable runnable) {
        this.f36346y = (dc0) runnable;
    }

    public final void a0(qw qwVar) {
        this.f36345x = qwVar;
    }

    public final void b0() {
        GradientDrawable gradientDrawable = this.f36338b;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.Ph)});
        this.f36339c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        ci.n nVar = this.f36339c;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        nVar.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, x02, x02));
        int[] iArr = this.f36343s;
        if (iArr != null && this.f36337a != null) {
            iArr[0] = 3355443;
            iArr[1] = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false);
            int[] iArr2 = this.f36343s;
            iArr2[2] = 16777215;
            int i11 = org.telegram.ui.ActionBar.g6.f19601d6;
            iArr2[3] = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
            int[] iArr3 = this.f36343s;
            iArr3[4] = 5285866;
            iArr3[5] = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
            int[] iArr4 = this.f36343s;
            iArr4[6] = 2170912;
            iArr4[7] = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
            org.telegram.ui.Components.bk0 bk0Var = this.f36337a;
            int[] iArr5 = this.f36343s;
            org.telegram.ui.Components.yj0 yj0Var = bk0Var.f23486b;
            if (yj0Var != null) {
                yj0Var.f31300n = iArr5;
                yj0Var.G();
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
        String str;
        int i12;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19935v8, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19899t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 18));
        }
        f fVar = new f(this, context, 0);
        this.fragmentView = fVar;
        fVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i13 = 2;
        viewGroup.setOnTouchListener(new ci.d(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        ?? imageView = new ImageView(context);
        this.f36337a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.e = textView;
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        this.e.setGravity(1);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i15 = this.v;
        if (i15 == 3) {
            i14 = org.telegram.ui.ActionBar.g6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i14, false));
        this.d.setGravity(1);
        float f12 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f36340f = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.f36340f.setGravity(1);
        this.f36340f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f36340f.setTextSize(1, 15.0f);
        if (i15 == 6 || i15 == 3) {
            f7 = 24.0f;
            f10 = 2.0f;
            this.f36340f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f7 = 24.0f;
            f10 = 2.0f;
            this.f36340f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f36340f);
        int i16 = 5;
        if (i15 == 5) {
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
            int i17 = 0;
            for (int i18 = 3; i17 < i18; i18 = 3) {
                LinearLayout e = org.telegram.messenger.sk.e(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i17 != i13) {
                    f11 = 7.0f;
                } else {
                    f11 = 0.0f;
                }
                linearLayout3.addView(e, w7.z5.k(0.0f, 0.0f, 0.0f, f11, -2, -2));
                int i19 = i17 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f36341n;
                textViewArr[i19] = textView4;
                int i20 = org.telegram.ui.ActionBar.g6.G6;
                textView4.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i20, false));
                TextView textView5 = textViewArr[i19];
                if (LocaleController.isRTL) {
                    i11 = i16;
                } else {
                    i11 = 3;
                }
                textView5.setGravity(i11);
                textViewArr[i19].setTextSize(1, f12);
                TextView textView6 = textViewArr[i19];
                if (LocaleController.isRTL) {
                    str = ".%d";
                } else {
                    str = "%d.";
                }
                int i21 = i17 + 1;
                textView6.setText(String.format(str, Integer.valueOf(i21)));
                textViewArr[i19].setTypeface(AndroidUtilities.bold());
                int i22 = i19 + 1;
                TextView textView7 = new TextView(context);
                textViewArr[i22] = textView7;
                textView7.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i20, false));
                TextView textView8 = textViewArr[i22];
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView8.setGravity(i12);
                textViewArr[i22].setTextSize(1, f12);
                if (i17 == 0) {
                    textViewArr[i22].setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.J6, false));
                    textViewArr[i22].setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.K6, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i22].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.q11) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i22].setText(spannableStringBuilder);
                } else if (i17 == 1) {
                    textViewArr[i22].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i22].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    e.setGravity(5);
                    e.addView(textViewArr[i22], w7.z5.l(1.0f, 0, -2));
                    e.addView(textViewArr[i19], w7.z5.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    e.addView(textViewArr[i19], w7.z5.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    e.addView(textViewArr[i22], w7.z5.n(-2, -2));
                }
                i17 = i21;
                i13 = 2;
                f12 = 15.0f;
                i16 = 5;
            }
            this.f36340f.setVisibility(8);
        }
        TextView textView9 = new TextView(context);
        this.f36342r = textView9;
        textView9.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.f36342r.setGravity(1);
        this.f36342r.setLineSpacing(AndroidUtilities.dp(f10), 1.0f);
        this.f36342r.setTextSize(1, 13.0f);
        this.f36342r.setVisibility(8);
        this.f36342r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.f36342r);
        this.f36338b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ci.n nVar = new ci.n(this, context);
        this.f36339c = nVar;
        w7.b6.b(nVar, 0.02f, 1.2f);
        this.f36339c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f36339c.setGravity(17);
        this.f36339c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.f36339c.setTextSize(1, 14.0f);
        this.f36339c.setTypeface(AndroidUtilities.bold());
        ci.n nVar2 = this.f36339c;
        int dp = AndroidUtilities.dp(f7);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        nVar2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, x02, x02));
        viewGroup.addView(this.f36339c);
        this.f36339c.setOnClickListener(new View.OnClickListener(this) {
            public final h f34817b;

            {
                this.f34817b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f34817b;
                        if (hVar.getParentActivity() != null) {
                            int i23 = hVar.v;
                            if (i23 != 0) {
                                if (i23 != 3) {
                                    if (i23 != 5) {
                                        if (i23 == 6) {
                                            hVar.presentFragment(new PasscodeActivity(1), true);
                                            dc0 dc0Var = hVar.f36346y;
                                            if (dc0Var != null) {
                                                AndroidUtilities.runOnUIThread(dc0Var);
                                                hVar.f36346y = null;
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (hVar.getParentActivity() != null) {
                                        if (hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            return;
                                        }
                                        z9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                hVar.showDialog(alertDialog$Builder.f19248a);
                                return;
                            }
                            hVar.presentFragment(new sd(org.telegram.ui.Cells.c1.f(0, "step")), true);
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f34817b;
                        if (!hVar2.f36337a.getAnimatedDrawable().f31298k0) {
                            hVar2.f36337a.getAnimatedDrawable().N(0, false, false);
                            hVar2.f36337a.d();
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f34817b;
                        if (!hVar3.f36337a.getAnimatedDrawable().f31298k0) {
                            hVar3.f36337a.getAnimatedDrawable().N(0, false, false);
                            hVar3.f36337a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f34817b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i15 != 0) {
            if (i15 != 3) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        this.f36337a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f36337a.f(R.raw.utyan_passcode, 200, 200, null);
                        this.f36337a.setFocusable(false);
                        this.f36337a.setOnClickListener(new View.OnClickListener(this) {
                            public final h f34817b;

                            {
                                this.f34817b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        h hVar = this.f34817b;
                                        if (hVar.getParentActivity() != null) {
                                            int i23 = hVar.v;
                                            if (i23 != 0) {
                                                if (i23 != 3) {
                                                    if (i23 != 5) {
                                                        if (i23 == 6) {
                                                            hVar.presentFragment(new PasscodeActivity(1), true);
                                                            dc0 dc0Var = hVar.f36346y;
                                                            if (dc0Var != null) {
                                                                AndroidUtilities.runOnUIThread(dc0Var);
                                                                hVar.f36346y = null;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    } else if (hVar.getParentActivity() != null) {
                                                        if (hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                            hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                            return;
                                                        }
                                                        z9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                                hVar.showDialog(alertDialog$Builder.f19248a);
                                                return;
                                            }
                                            hVar.presentFragment(new sd(org.telegram.ui.Cells.c1.f(0, "step")), true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        h hVar2 = this.f34817b;
                                        if (!hVar2.f36337a.getAnimatedDrawable().f31298k0) {
                                            hVar2.f36337a.getAnimatedDrawable().N(0, false, false);
                                            hVar2.f36337a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        h hVar3 = this.f34817b;
                                        if (!hVar3.f36337a.getAnimatedDrawable().f31298k0) {
                                            hVar3.f36337a.getAnimatedDrawable().N(0, false, false);
                                            hVar3.f36337a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f34817b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.e.setText(LocaleController.getString(R.string.Passcode));
                        this.f36340f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
                        this.f36339c.setText(LocaleController.getString(R.string.EnablePasscode));
                        this.f36337a.d();
                        this.f36344w = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f36343s = iArr;
                    this.f36337a.f(R.raw.qr_login, 334, 334, iArr);
                    this.f36337a.setScaleType(ImageView.ScaleType.CENTER);
                    this.e.setText(LocaleController.getString(R.string.AuthAnotherClient));
                    this.f36339c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                    this.f36337a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f36337a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f36337a.f(R.raw.utyan_change_number, 200, 200, null);
                this.f36337a.setOnClickListener(new View.OnClickListener(this) {
                    public final h f34817b;

                    {
                        this.f34817b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h hVar = this.f34817b;
                                if (hVar.getParentActivity() != null) {
                                    int i23 = hVar.v;
                                    if (i23 != 0) {
                                        if (i23 != 3) {
                                            if (i23 != 5) {
                                                if (i23 == 6) {
                                                    hVar.presentFragment(new PasscodeActivity(1), true);
                                                    dc0 dc0Var = hVar.f36346y;
                                                    if (dc0Var != null) {
                                                        AndroidUtilities.runOnUIThread(dc0Var);
                                                        hVar.f36346y = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (hVar.getParentActivity() != null) {
                                                if (hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                z9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        hVar.showDialog(alertDialog$Builder.f19248a);
                                        return;
                                    }
                                    hVar.presentFragment(new sd(org.telegram.ui.Cells.c1.f(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                h hVar2 = this.f34817b;
                                if (!hVar2.f36337a.getAnimatedDrawable().f31298k0) {
                                    hVar2.f36337a.getAnimatedDrawable().N(0, false, false);
                                    hVar2.f36337a.d();
                                    return;
                                }
                                return;
                            case 2:
                                h hVar3 = this.f34817b;
                                if (!hVar3.f36337a.getAnimatedDrawable().f31298k0) {
                                    hVar3.f36337a.getAnimatedDrawable().N(0, false, false);
                                    hVar3.f36337a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f34817b.getParentLayout()).l(true, false);
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
                    this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.sk.g(new StringBuilder("+"), user.phone, jf.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final h f34817b;

                    {
                        this.f34817b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h hVar = this.f34817b;
                                if (hVar.getParentActivity() != null) {
                                    int i23 = hVar.v;
                                    if (i23 != 0) {
                                        if (i23 != 3) {
                                            if (i23 != 5) {
                                                if (i23 == 6) {
                                                    hVar.presentFragment(new PasscodeActivity(1), true);
                                                    dc0 dc0Var = hVar.f36346y;
                                                    if (dc0Var != null) {
                                                        AndroidUtilities.runOnUIThread(dc0Var);
                                                        hVar.f36346y = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (hVar.getParentActivity() != null) {
                                                if (hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                z9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                        alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                        alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        hVar.showDialog(alertDialog$Builder.f19248a);
                                        return;
                                    }
                                    hVar.presentFragment(new sd(org.telegram.ui.Cells.c1.f(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                h hVar2 = this.f34817b;
                                if (!hVar2.f36337a.getAnimatedDrawable().f31298k0) {
                                    hVar2.f36337a.getAnimatedDrawable().N(0, false, false);
                                    hVar2.f36337a.d();
                                    return;
                                }
                                return;
                            case 2:
                                h hVar3 = this.f34817b;
                                if (!hVar3.f36337a.getAnimatedDrawable().f31298k0) {
                                    hVar3.f36337a.getAnimatedDrawable().N(0, false, false);
                                    hVar3.f36337a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f34817b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                org.telegram.messenger.g0.n(R.string.PhoneNumberHelp, this.f36340f);
                this.f36339c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                this.f36337a.d();
                this.f36344w = true;
            }
        } else {
            this.f36337a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f36337a.f(R.raw.channel_create, 200, 200, null);
            this.e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f36340f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.f36339c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.f36337a.d();
            this.f36344w = true;
        }
        if (this.f36344w) {
            this.f36339c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.f36339c.setTextSize(1, 15.0f);
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 0);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f19601d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, eVar, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        }
        TextView textView = this.e;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36340f, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        TextView[] textViewArr = this.f36341n;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[0], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[1], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[1], 2, null, null, null, null, org.telegram.ui.ActionBar.g6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[2], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[3], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[4], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(textViewArr[5], 4, null, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, true)) > 0.699999988079071d) {
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
                z9.e0(getParentActivity(), false, 1, new g(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f19248a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
