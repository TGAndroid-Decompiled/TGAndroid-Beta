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
public final class h extends org.telegram.ui.ActionBar.n2 implements LocationController.LocationFetchCallback {
    public org.telegram.ui.Components.fk0 f38151a;
    public GradientDrawable f38152b;
    public bi.o f38153c;
    public TextView d;
    public TextView f38154e;
    public TextView f38155f;
    public LinearLayout h;
    public final TextView[] f38156n;
    public TextView f38157r;
    public int[] f38158s;
    public final int v;
    public boolean f38159w;
    public rw f38160x;
    public zb0 f38161y;

    public h(int i10) {
        super(null);
        this.f38156n = new TextView[6];
        this.v = i10;
    }

    public final void Z(Runnable runnable) {
        this.f38161y = (zb0) runnable;
    }

    public final void a0(rw rwVar) {
        this.f38160x = rwVar;
    }

    public final void b0() {
        GradientDrawable gradientDrawable = this.f38152b;
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.i6.Ph)});
        this.f38153c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        bi.o oVar = this.f38153c;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        oVar.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, x02, x02));
        int[] iArr = this.f38158s;
        if (iArr != null && this.f38151a != null) {
            iArr[0] = 3355443;
            iArr[1] = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false);
            int[] iArr2 = this.f38158s;
            iArr2[2] = 16777215;
            int i11 = org.telegram.ui.ActionBar.i6.f20797d6;
            iArr2[3] = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
            int[] iArr3 = this.f38158s;
            iArr3[4] = 5285866;
            iArr3[5] = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
            int[] iArr4 = this.f38158s;
            iArr4[6] = 2170912;
            iArr4[7] = org.telegram.ui.ActionBar.i6.x0(null, i11, false);
            org.telegram.ui.Components.fk0 fk0Var = this.f38151a;
            int[] iArr5 = this.f38158s;
            org.telegram.ui.Components.ck0 ck0Var = fk0Var.f26398b;
            if (ck0Var != null) {
                ck0Var.f25411n = iArr5;
                ck0Var.G();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        int i10;
        float f10;
        int i11;
        String str;
        int i12;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.D(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21130v8, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21094t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 17));
        }
        f fVar = new f(this, context, 0);
        this.fragmentView = fVar;
        fVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i13 = 2;
        viewGroup.setOnTouchListener(new bi.d(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        ?? imageView = new ImageView(context);
        this.f38151a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.f38154e = textView;
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        this.f38154e.setGravity(1);
        this.f38154e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f38154e.setTextSize(1, 24.0f);
        viewGroup.addView(this.f38154e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i15 = this.v;
        if (i15 == 3) {
            i14 = org.telegram.ui.ActionBar.i6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        this.d.setGravity(1);
        float f11 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f38155f = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false));
        this.f38155f.setGravity(1);
        this.f38155f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f38155f.setTextSize(1, 15.0f);
        if (i15 == 6 || i15 == 3) {
            f7 = 2.0f;
            this.f38155f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f7 = 2.0f;
            this.f38155f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f38155f);
        int i16 = 5;
        if (i15 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
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
                LinearLayout e7 = org.telegram.messenger.bi.e(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i17 != i13) {
                    f10 = 7.0f;
                } else {
                    f10 = 0.0f;
                }
                linearLayout3.addView(e7, w7.x5.k(0.0f, 0.0f, 0.0f, f10, -2, -2));
                int i19 = i17 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f38156n;
                textViewArr[i19] = textView4;
                int i20 = org.telegram.ui.ActionBar.i6.G6;
                textView4.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i20, false));
                TextView textView5 = textViewArr[i19];
                if (LocaleController.isRTL) {
                    i11 = i16;
                } else {
                    i11 = 3;
                }
                textView5.setGravity(i11);
                textViewArr[i19].setTextSize(1, f11);
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
                textView7.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i20, false));
                TextView textView8 = textViewArr[i22];
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView8.setGravity(i12);
                textViewArr[i22].setTextSize(1, f11);
                if (i17 == 0) {
                    textViewArr[i22].setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.J6, false));
                    textViewArr[i22].setHighlightColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.K6, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i22].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.t61(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.t11) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i22].setText(spannableStringBuilder);
                } else if (i17 == 1) {
                    textViewArr[i22].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i22].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    e7.setGravity(5);
                    e7.addView(textViewArr[i22], w7.x5.l(1.0f, 0, -2));
                    e7.addView(textViewArr[i19], w7.x5.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    e7.addView(textViewArr[i19], w7.x5.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    e7.addView(textViewArr[i22], w7.x5.n(-2, -2));
                }
                i17 = i21;
                i16 = 5;
                i13 = 2;
                f11 = 15.0f;
            }
            this.f38155f.setVisibility(8);
        }
        TextView textView9 = new TextView(context);
        this.f38157r = textView9;
        textView9.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false));
        this.f38157r.setGravity(1);
        this.f38157r.setLineSpacing(AndroidUtilities.dp(f7), 1.0f);
        this.f38157r.setTextSize(1, 13.0f);
        this.f38157r.setVisibility(8);
        this.f38157r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.f38157r);
        this.f38152b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        bi.o oVar = new bi.o(this, context);
        this.f38153c = oVar;
        w7.z5.b(oVar, 0.02f, 1.2f);
        this.f38153c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f38153c.setGravity(17);
        this.f38153c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
        this.f38153c.setTextSize(1, 14.0f);
        this.f38153c.setTypeface(AndroidUtilities.bold());
        bi.o oVar2 = this.f38153c;
        int dp = AndroidUtilities.dp(24.0f);
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
        oVar2.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, x02, x02));
        viewGroup.addView(this.f38153c);
        this.f38153c.setOnClickListener(new View.OnClickListener(this) {
            public final h f36766b;

            {
                this.f36766b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h hVar = this.f36766b;
                        if (hVar.getParentActivity() != null) {
                            int i23 = hVar.v;
                            if (i23 != 0) {
                                if (i23 != 3) {
                                    if (i23 != 5) {
                                        if (i23 == 6) {
                                            hVar.presentFragment(new PasscodeActivity(1), true);
                                            zb0 zb0Var = hVar.f38161y;
                                            if (zb0Var != null) {
                                                AndroidUtilities.runOnUIThread(zb0Var);
                                                hVar.f38161y = null;
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
                                        v9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                hVar.showDialog(alertDialog$Builder.f20374a);
                                return;
                            }
                            hVar.presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")), true);
                            return;
                        }
                        return;
                    case 1:
                        h hVar2 = this.f36766b;
                        if (!hVar2.f38151a.getAnimatedDrawable().f25409k0) {
                            hVar2.f38151a.getAnimatedDrawable().N(0, false, false);
                            hVar2.f38151a.d();
                            return;
                        }
                        return;
                    case 2:
                        h hVar3 = this.f36766b;
                        if (!hVar3.f38151a.getAnimatedDrawable().f25409k0) {
                            hVar3.f38151a.getAnimatedDrawable().N(0, false, false);
                            hVar3.f38151a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f36766b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i15 != 0) {
            if (i15 != 3) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        this.f38151a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f38151a.f(R.raw.utyan_passcode, 200, 200, null);
                        this.f38151a.setFocusable(false);
                        this.f38151a.setOnClickListener(new View.OnClickListener(this) {
                            public final h f36766b;

                            {
                                this.f36766b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        h hVar = this.f36766b;
                                        if (hVar.getParentActivity() != null) {
                                            int i23 = hVar.v;
                                            if (i23 != 0) {
                                                if (i23 != 3) {
                                                    if (i23 != 5) {
                                                        if (i23 == 6) {
                                                            hVar.presentFragment(new PasscodeActivity(1), true);
                                                            zb0 zb0Var = hVar.f38161y;
                                                            if (zb0Var != null) {
                                                                AndroidUtilities.runOnUIThread(zb0Var);
                                                                hVar.f38161y = null;
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
                                                        v9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                                hVar.showDialog(alertDialog$Builder.f20374a);
                                                return;
                                            }
                                            hVar.presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")), true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        h hVar2 = this.f36766b;
                                        if (!hVar2.f38151a.getAnimatedDrawable().f25409k0) {
                                            hVar2.f38151a.getAnimatedDrawable().N(0, false, false);
                                            hVar2.f38151a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        h hVar3 = this.f36766b;
                                        if (!hVar3.f38151a.getAnimatedDrawable().f25409k0) {
                                            hVar3.f38151a.getAnimatedDrawable().N(0, false, false);
                                            hVar3.f38151a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f36766b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.f38154e.setText(LocaleController.getString(R.string.Passcode));
                        this.f38155f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
                        this.f38153c.setText(LocaleController.getString(R.string.EnablePasscode));
                        this.f38151a.d();
                        this.f38159w = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f38158s = iArr;
                    this.f38151a.f(R.raw.qr_login, 334, 334, iArr);
                    this.f38151a.setScaleType(ImageView.ScaleType.CENTER);
                    this.f38154e.setText(LocaleController.getString(R.string.AuthAnotherClient));
                    this.f38153c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                    this.f38151a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f38151a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f38151a.f(R.raw.utyan_change_number, 200, 200, null);
                this.f38151a.setOnClickListener(new View.OnClickListener(this) {
                    public final h f36766b;

                    {
                        this.f36766b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h hVar = this.f36766b;
                                if (hVar.getParentActivity() != null) {
                                    int i23 = hVar.v;
                                    if (i23 != 0) {
                                        if (i23 != 3) {
                                            if (i23 != 5) {
                                                if (i23 == 6) {
                                                    hVar.presentFragment(new PasscodeActivity(1), true);
                                                    zb0 zb0Var = hVar.f38161y;
                                                    if (zb0Var != null) {
                                                        AndroidUtilities.runOnUIThread(zb0Var);
                                                        hVar.f38161y = null;
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
                                                v9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        hVar.showDialog(alertDialog$Builder.f20374a);
                                        return;
                                    }
                                    hVar.presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                h hVar2 = this.f36766b;
                                if (!hVar2.f38151a.getAnimatedDrawable().f25409k0) {
                                    hVar2.f38151a.getAnimatedDrawable().N(0, false, false);
                                    hVar2.f38151a.d();
                                    return;
                                }
                                return;
                            case 2:
                                h hVar3 = this.f36766b;
                                if (!hVar3.f38151a.getAnimatedDrawable().f25409k0) {
                                    hVar3.f38151a.getAnimatedDrawable().N(0, false, false);
                                    hVar3.f38151a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f36766b.getParentLayout()).l(true, false);
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
                    this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.bi.g(new StringBuilder("+"), user.phone, hf.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final h f36766b;

                    {
                        this.f36766b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h hVar = this.f36766b;
                                if (hVar.getParentActivity() != null) {
                                    int i23 = hVar.v;
                                    if (i23 != 0) {
                                        if (i23 != 3) {
                                            if (i23 != 5) {
                                                if (i23 == 6) {
                                                    hVar.presentFragment(new PasscodeActivity(1), true);
                                                    zb0 zb0Var = hVar.f38161y;
                                                    if (zb0Var != null) {
                                                        AndroidUtilities.runOnUIThread(zb0Var);
                                                        hVar.f38161y = null;
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
                                                v9.e0(hVar.getParentActivity(), false, 1, new g(hVar, 0));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                                        alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                                        alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        hVar.showDialog(alertDialog$Builder.f20374a);
                                        return;
                                    }
                                    hVar.presentFragment(new md(org.telegram.ui.Cells.c1.f(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                h hVar2 = this.f36766b;
                                if (!hVar2.f38151a.getAnimatedDrawable().f25409k0) {
                                    hVar2.f38151a.getAnimatedDrawable().N(0, false, false);
                                    hVar2.f38151a.d();
                                    return;
                                }
                                return;
                            case 2:
                                h hVar3 = this.f36766b;
                                if (!hVar3.f38151a.getAnimatedDrawable().f25409k0) {
                                    hVar3.f38151a.getAnimatedDrawable().N(0, false, false);
                                    hVar3.f38151a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f36766b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.f38154e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                org.telegram.messenger.q.n(R.string.PhoneNumberHelp, this.f38155f);
                this.f38153c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                this.f38151a.d();
                this.f38159w = true;
            }
        } else {
            this.f38151a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f38151a.f(R.raw.channel_create, 200, 200, null);
            this.f38154e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f38155f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.f38153c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.f38151a.d();
            this.f38159w = true;
        }
        if (this.f38159w) {
            this.f38153c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.f38153c.setTextSize(1, 15.0f);
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 0);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, eVar, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        }
        TextView textView = this.f38154e;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38155f, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.D6));
        TextView[] textViewArr = this.f38156n;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[0], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[1], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[1], 2, null, null, null, null, org.telegram.ui.ActionBar.i6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[2], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[3], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[4], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(textViewArr[5], 4, null, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, true)) > 0.699999988079071d) {
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
                v9.e0(getParentActivity(), false, 1, new g(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20374a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
