package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.os.Build;
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
public final class i extends org.telegram.ui.ActionBar.o2 implements LocationController.LocationFetchCallback {
    public org.telegram.ui.Components.aj0 f39077a;
    public GradientDrawable f39078b;
    public cg.s0 f39079c;
    public TextView d;
    public TextView f39080e;
    public TextView f39081f;
    public LinearLayout h;
    public final TextView[] f39082n;
    public TextView f39083r;
    public int[] f39084s;
    public final int v;
    public boolean f39085w;
    public xr f39086x;
    public hb0 f39087y;

    public i(int i10) {
        super(null);
        this.f39082n = new TextView[6];
        this.v = i10;
    }

    public static void U(i iVar) {
        if (iVar.getParentActivity() != null) {
            int i10 = iVar.v;
            if (i10 != 0) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 == 6) {
                            iVar.presentFragment(new PasscodeActivity(1), true);
                            hb0 hb0Var = iVar.f39087y;
                            if (hb0Var != null) {
                                AndroidUtilities.runOnUIThread(hb0Var);
                                iVar.f39087y = null;
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (iVar.getParentActivity() == null) {
                        return;
                    } else {
                        if (Build.VERSION.SDK_INT >= 23 && iVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                            iVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                            return;
                        }
                        r9.e0(iVar.getParentActivity(), 1, new h(iVar, 0));
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iVar.getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PhoneNumberAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new d(iVar, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                iVar.showDialog(alertDialog$Builder.f22714a);
                return;
            }
            iVar.presentFragment(new hd(a4.w.h(0, "step")), true);
        }
    }

    public final void a0(Runnable runnable) {
        this.f39087y = (hb0) runnable;
    }

    public final void b0(xr xrVar) {
        this.f39086x = xrVar;
    }

    public final void c0() {
        GradientDrawable gradientDrawable = this.f39078b;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.Ph)});
        this.f39079c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        cg.s0 s0Var = this.f39079c;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        s0Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, w02, w02));
        int[] iArr = this.f39084s;
        if (iArr != null && this.f39077a != null) {
            iArr[0] = 3355443;
            iArr[1] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false);
            int[] iArr2 = this.f39084s;
            iArr2[2] = 16777215;
            int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
            iArr2[3] = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            int[] iArr3 = this.f39084s;
            iArr3[4] = 5285866;
            iArr3[5] = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
            int[] iArr4 = this.f39084s;
            iArr4[6] = 2170912;
            iArr4[7] = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            org.telegram.ui.Components.aj0 aj0Var = this.f39077a;
            int[] iArr5 = this.f39084s;
            org.telegram.ui.Components.xi0 xi0Var = aj0Var.f26788b;
            if (xi0Var != null) {
                xi0Var.f34747n = iArr5;
                xi0Var.E();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        float f9;
        float f10;
        int i10;
        float f11;
        int i11;
        String str;
        int i12;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23385v8, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23348t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 4));
        }
        g gVar = new g(this, context, 0);
        this.fragmentView = gVar;
        gVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i13 = 2;
        viewGroup.setOnTouchListener(new mh.d(2));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (lVar2 != null) {
            viewGroup.addView(lVar2);
        }
        ?? imageView = new ImageView(context);
        this.f39077a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.f39080e = textView;
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.f39080e.setGravity(1);
        this.f39080e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f39080e.setTextSize(1, 24.0f);
        viewGroup.addView(this.f39080e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i15 = this.v;
        if (i15 == 3) {
            i14 = org.telegram.ui.ActionBar.g6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.d.setGravity(1);
        float f12 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f39081f = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.f39081f.setGravity(1);
        this.f39081f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f39081f.setTextSize(1, 15.0f);
        if (i15 == 6 || i15 == 3) {
            f9 = 24.0f;
            f10 = 2.0f;
            this.f39081f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f9 = 24.0f;
            f10 = 2.0f;
            this.f39081f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f39081f);
        if (i15 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(AndroidUtilities.dp(f9), 0, AndroidUtilities.dp(f9), 0);
            LinearLayout linearLayout2 = this.h;
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            linearLayout2.setGravity(i10);
            viewGroup.addView(this.h);
            int i16 = 0;
            for (int i17 = 3; i16 < i17; i17 = 3) {
                LinearLayout g10 = org.telegram.messenger.x3.g(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i16 != i13) {
                    f11 = 7.0f;
                } else {
                    f11 = 0.0f;
                }
                linearLayout3.addView(g10, i7.f6.k(0.0f, 0.0f, 0.0f, f11, -2, -2));
                int i18 = i16 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f39082n;
                textViewArr[i18] = textView4;
                int i19 = org.telegram.ui.ActionBar.g6.G6;
                textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
                TextView textView5 = textViewArr[i18];
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView5.setGravity(i11);
                textViewArr[i18].setTextSize(1, f12);
                TextView textView6 = textViewArr[i18];
                if (LocaleController.isRTL) {
                    str = ".%d";
                } else {
                    str = "%d.";
                }
                int i20 = i16 + 1;
                textView6.setText(String.format(str, Integer.valueOf(i20)));
                textViewArr[i18].setTypeface(AndroidUtilities.bold());
                int i21 = i18 + 1;
                TextView textView7 = new TextView(context);
                textViewArr[i21] = textView7;
                textView7.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
                TextView textView8 = textViewArr[i21];
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView8.setGravity(i12);
                textViewArr[i21].setTextSize(1, f12);
                if (i16 == 0) {
                    textViewArr[i21].setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
                    textViewArr[i21].setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i21].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.a51(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.h01) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i21].setText(spannableStringBuilder);
                } else if (i16 == 1) {
                    textViewArr[i21].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i21].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    g10.setGravity(5);
                    g10.addView(textViewArr[i21], i7.f6.l(1.0f, 0, -2));
                    g10.addView(textViewArr[i18], i7.f6.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    g10.addView(textViewArr[i18], i7.f6.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    g10.addView(textViewArr[i21], i7.f6.n(-2, -2));
                }
                i16 = i20;
                i13 = 2;
                f12 = 15.0f;
            }
            this.f39081f.setVisibility(8);
        }
        TextView textView9 = new TextView(context);
        this.f39083r = textView9;
        textView9.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.f39083r.setGravity(1);
        this.f39083r.setLineSpacing(AndroidUtilities.dp(f10), 1.0f);
        this.f39083r.setTextSize(1, 13.0f);
        this.f39083r.setVisibility(8);
        this.f39083r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.f39083r);
        this.f39078b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        cg.s0 s0Var = new cg.s0(this, context);
        this.f39079c = s0Var;
        i7.h6.b(s0Var, 0.02f, 1.2f);
        this.f39079c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f39079c.setGravity(17);
        this.f39079c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.f39079c.setTextSize(1, 14.0f);
        this.f39079c.setTypeface(AndroidUtilities.bold());
        cg.s0 s0Var2 = this.f39079c;
        int dp = AndroidUtilities.dp(f9);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        s0Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, 0, w02, w02));
        viewGroup.addView(this.f39079c);
        this.f39079c.setOnClickListener(new View.OnClickListener(this) {
            public final i f37657b;

            {
                this.f37657b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i.U(this.f37657b);
                        return;
                    case 1:
                        i iVar = this.f37657b;
                        if (!iVar.f39077a.getAnimatedDrawable().f34742h0) {
                            iVar.f39077a.getAnimatedDrawable().L(0, false, false);
                            iVar.f39077a.d();
                            return;
                        }
                        return;
                    case 2:
                        i iVar2 = this.f37657b;
                        if (!iVar2.f39077a.getAnimatedDrawable().f34742h0) {
                            iVar2.f39077a.getAnimatedDrawable().L(0, false, false);
                            iVar2.f39077a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f37657b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i15 != 0) {
            if (i15 != 3) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        this.f39077a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f39077a.f(R.raw.utyan_passcode, 200, 200, null);
                        this.f39077a.setFocusable(false);
                        this.f39077a.setOnClickListener(new View.OnClickListener(this) {
                            public final i f37657b;

                            {
                                this.f37657b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        i.U(this.f37657b);
                                        return;
                                    case 1:
                                        i iVar = this.f37657b;
                                        if (!iVar.f39077a.getAnimatedDrawable().f34742h0) {
                                            iVar.f39077a.getAnimatedDrawable().L(0, false, false);
                                            iVar.f39077a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        i iVar2 = this.f37657b;
                                        if (!iVar2.f39077a.getAnimatedDrawable().f34742h0) {
                                            iVar2.f39077a.getAnimatedDrawable().L(0, false, false);
                                            iVar2.f39077a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f37657b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.f39080e.setText(LocaleController.getString(R.string.Passcode));
                        this.f39081f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
                        this.f39079c.setText(LocaleController.getString(R.string.EnablePasscode));
                        this.f39077a.d();
                        this.f39085w = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f39084s = iArr;
                    this.f39077a.f(R.raw.qr_login, 334, 334, iArr);
                    this.f39077a.setScaleType(ImageView.ScaleType.CENTER);
                    this.f39080e.setText(LocaleController.getString(R.string.AuthAnotherClient));
                    this.f39079c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                    this.f39077a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f39077a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f39077a.f(R.raw.utyan_change_number, 200, 200, null);
                this.f39077a.setOnClickListener(new View.OnClickListener(this) {
                    public final i f37657b;

                    {
                        this.f37657b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i.U(this.f37657b);
                                return;
                            case 1:
                                i iVar = this.f37657b;
                                if (!iVar.f39077a.getAnimatedDrawable().f34742h0) {
                                    iVar.f39077a.getAnimatedDrawable().L(0, false, false);
                                    iVar.f39077a.d();
                                    return;
                                }
                                return;
                            case 2:
                                i iVar2 = this.f37657b;
                                if (!iVar2.f39077a.getAnimatedDrawable().f34742h0) {
                                    iVar2.f39077a.getAnimatedDrawable().L(0, false, false);
                                    iVar2.f39077a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f37657b.getParentLayout()).l(true, false);
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
                    this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.x3.k(new StringBuilder("+"), user.phone, qe.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final i f37657b;

                    {
                        this.f37657b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i.U(this.f37657b);
                                return;
                            case 1:
                                i iVar = this.f37657b;
                                if (!iVar.f39077a.getAnimatedDrawable().f34742h0) {
                                    iVar.f39077a.getAnimatedDrawable().L(0, false, false);
                                    iVar.f39077a.d();
                                    return;
                                }
                                return;
                            case 2:
                                i iVar2 = this.f37657b;
                                if (!iVar2.f39077a.getAnimatedDrawable().f34742h0) {
                                    iVar2.f39077a.getAnimatedDrawable().L(0, false, false);
                                    iVar2.f39077a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f37657b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.f39080e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                org.telegram.messenger.x3.r(R.string.PhoneNumberHelp, this.f39081f);
                this.f39079c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                this.f39077a.d();
                this.f39085w = true;
            }
        } else {
            this.f39077a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f39077a.f(R.raw.channel_create, 200, 200, null);
            this.f39080e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f39081f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.f39079c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.f39077a.d();
            this.f39085w = true;
        }
        if (this.f39085w) {
            this.f39079c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.f39079c.setTextSize(1, 15.0f);
        }
        c0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 0);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, fVar, i10));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        }
        TextView textView = this.f39080e;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, fVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39081f, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        TextView[] textViewArr = this.f39082n;
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
        if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, true)) > 0.699999988079071d) {
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
                r9.e0(getParentActivity(), 1, new h(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new d(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
