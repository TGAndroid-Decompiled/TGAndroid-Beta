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

public final class h extends org.telegram.ui.ActionBar.n2 implements LocationController.LocationFetchCallback {

    public org.telegram.ui.Components.ri0 f38630a;

    public GradientDrawable f38631b;

    public ag.e1 f38632c;
    public TextView d;

    public TextView f38633e;

    public TextView f38634f;
    public LinearLayout h;

    public final TextView[] f38635n;

    public TextView f38636r;

    public int[] f38637s;
    public final int v;

    public boolean f38638w;

    public zr f38639x;

    public jb0 f38640y;

    public h(int i10) {
        super(null);
        this.f38635n = new TextView[6];
        this.v = i10;
    }

    public static void U(h hVar) {
        if (hVar.getParentActivity() == null) {
            return;
        }
        int i10 = hVar.v;
        if (i10 == 0) {
            hVar.presentFragment(new id(a9.p.g(0, "step")), true);
            return;
        }
        if (i10 == 3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PhoneNumberChangeTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PhoneNumberAlert);
            alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            hVar.showDialog(alertDialog$Builder.f22702a);
            return;
        }
        if (i10 != 5) {
            if (i10 != 6) {
                return;
            }
            hVar.presentFragment(new PasscodeActivity(1), true);
            jb0 jb0Var = hVar.f38640y;
            if (jb0Var != null) {
                AndroidUtilities.runOnUIThread(jb0Var);
                hVar.f38640y = null;
                return;
            }
            return;
        }
        if (hVar.getParentActivity() == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
        } else {
            t9.e0(hVar.getParentActivity(), 1, new g(hVar, 0));
        }
    }

    public final void a0(Runnable runnable) {
        this.f38640y = (jb0) runnable;
    }

    public final void b0(zr zrVar) {
        this.f38639x = zrVar;
    }

    public final void c0() {
        GradientDrawable gradientDrawable = this.f38631b;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.g6.Ph)});
        this.f38632c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        ag.e1 e1Var = this.f38632c;
        int iDp = AndroidUtilities.dp(24.0f);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        e1Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, iW0, iW0));
        int[] iArr = this.f38637s;
        if (iArr == null || this.f38630a == null) {
            return;
        }
        iArr[0] = 3355443;
        iArr[1] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false);
        int[] iArr2 = this.f38637s;
        iArr2[2] = 16777215;
        int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
        iArr2[3] = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int[] iArr3 = this.f38637s;
        iArr3[4] = 5285866;
        iArr3[5] = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int[] iArr4 = this.f38637s;
        iArr4[6] = 2170912;
        iArr4[7] = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        org.telegram.ui.Components.ri0 ri0Var = this.f38630a;
        int[] iArr5 = this.f38637s;
        org.telegram.ui.Components.oi0 oi0Var = ri0Var.f32188b;
        if (oi0Var != null) {
            oi0Var.f31322n = iArr5;
            oi0Var.E();
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        float f11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        final int i10 = 0;
        if (kVar != null) {
            kVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23375v8, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23341t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 13));
        }
        f fVar = new f(this, context, i10);
        this.fragmentView = fVar;
        fVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i11 = 2;
        viewGroup.setOnTouchListener(new kh.e(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f38630a = ri0Var;
        viewGroup.addView(ri0Var);
        TextView textView = new TextView(context);
        this.f38633e = textView;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        final int i13 = 1;
        this.f38633e.setGravity(1);
        this.f38633e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f38633e.setTextSize(1, 24.0f);
        viewGroup.addView(this.f38633e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i14 = this.v;
        if (i14 == 3) {
            i12 = org.telegram.ui.ActionBar.g6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.d.setGravity(1);
        float f12 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f38634f = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.f38634f.setGravity(1);
        this.f38634f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f38634f.setTextSize(1, 15.0f);
        if (i14 == 6 || i14 == 3) {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f38634f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f38634f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f38634f);
        if (i14 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            viewGroup.addView(this.h);
            int i15 = 0;
            for (int i16 = 3; i15 < i16; i16 = 3) {
                LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 0);
                this.h.addView(linearLayoutG, h7.z5.k(0.0f, 0.0f, 0.0f, i15 != i11 ? 7.0f : 0.0f, -2, -2));
                int i17 = i15 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f38635n;
                textViewArr[i17] = textView4;
                int i18 = org.telegram.ui.ActionBar.g6.G6;
                textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
                textViewArr[i17].setGravity(LocaleController.isRTL ? 5 : 3);
                textViewArr[i17].setTextSize(1, f12);
                int i19 = i15 + 1;
                textViewArr[i17].setText(String.format(LocaleController.isRTL ? ".%d" : "%d.", Integer.valueOf(i19)));
                textViewArr[i17].setTypeface(AndroidUtilities.bold());
                int i20 = i17 + 1;
                TextView textView5 = new TextView(context);
                textViewArr[i20] = textView5;
                textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
                textViewArr[i20].setGravity(LocaleController.isRTL ? 5 : 3);
                textViewArr[i20].setTextSize(1, f12);
                if (i15 == 0) {
                    textViewArr[i20].setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
                    textViewArr[i20].setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int iIndexOf = string.indexOf(42);
                    int iLastIndexOf = string.lastIndexOf(42);
                    if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf != iLastIndexOf) {
                        textViewArr[i20].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.r41(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.xz0) null), iIndexOf, iLastIndexOf - 1, 33);
                    }
                    textViewArr[i20].setText(spannableStringBuilder);
                } else if (i15 == 1) {
                    textViewArr[i20].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i20].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    linearLayoutG.setGravity(5);
                    linearLayoutG.addView(textViewArr[i20], h7.z5.l(1.0f, 0, -2));
                    linearLayoutG.addView(textViewArr[i17], h7.z5.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    linearLayoutG.addView(textViewArr[i17], h7.z5.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    linearLayoutG.addView(textViewArr[i20], h7.z5.n(-2, -2));
                }
                i15 = i19;
                i11 = 2;
                f12 = 15.0f;
            }
            this.f38634f.setVisibility(8);
        }
        TextView textView6 = new TextView(context);
        this.f38636r = textView6;
        textView6.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.f38636r.setGravity(1);
        this.f38636r.setLineSpacing(AndroidUtilities.dp(f11), 1.0f);
        this.f38636r.setTextSize(1, 13.0f);
        this.f38636r.setVisibility(8);
        this.f38636r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.f38636r);
        this.f38631b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ag.e1 e1Var = new ag.e1(this, context);
        this.f38632c = e1Var;
        h7.b6.b(e1Var, 0.02f, 1.2f);
        this.f38632c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f38632c.setGravity(17);
        this.f38632c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.f38632c.setTextSize(1, 14.0f);
        this.f38632c.setTypeface(AndroidUtilities.bold());
        ag.e1 e1Var2 = this.f38632c;
        int iDp = AndroidUtilities.dp(f10);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        e1Var2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, iW0, iW0));
        viewGroup.addView(this.f38632c);
        this.f38632c.setOnClickListener(new View.OnClickListener(this) {

            public final h f37214b;

            {
                this.f37214b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        h.U(this.f37214b);
                        break;
                    case 1:
                        h hVar = this.f37214b;
                        if (!hVar.f38630a.getAnimatedDrawable().f31317h0) {
                            hVar.f38630a.getAnimatedDrawable().L(0, false, false);
                            hVar.f38630a.d();
                        }
                        break;
                    case 2:
                        h hVar2 = this.f37214b;
                        if (!hVar2.f38630a.getAnimatedDrawable().f31317h0) {
                            hVar2.f38630a.getAnimatedDrawable().L(0, false, false);
                            hVar2.f38630a.d();
                        }
                        break;
                    default:
                        ((ActionBarLayout) this.f37214b.getParentLayout()).l(true, false);
                        break;
                }
            }
        });
        if (i14 == 0) {
            this.f38630a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f38630a.f(R.raw.channel_create, 200, 200, null);
            this.f38633e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f38634f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.f38632c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.f38630a.d();
            this.f38638w = true;
        } else if (i14 == 3) {
            this.d.setVisibility(0);
            this.f38630a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f38630a.f(R.raw.utyan_change_number, 200, 200, null);
            final int i21 = 2;
            this.f38630a.setOnClickListener(new View.OnClickListener(this) {

                public final h f37214b;

                {
                    this.f37214b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i21) {
                        case 0:
                            h.U(this.f37214b);
                            break;
                        case 1:
                            h hVar = this.f37214b;
                            if (!hVar.f38630a.getAnimatedDrawable().f31317h0) {
                                hVar.f38630a.getAnimatedDrawable().L(0, false, false);
                                hVar.f38630a.d();
                            }
                            break;
                        case 2:
                            h hVar2 = this.f37214b;
                            if (!hVar2.f38630a.getAnimatedDrawable().f31317h0) {
                                hVar2.f38630a.getAnimatedDrawable().L(0, false, false);
                                hVar2.f38630a.d();
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.f37214b.getParentLayout()).l(true, false);
                            break;
                    }
                }
            });
            UserConfig userConfig = getUserConfig();
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
            if (user == null) {
                user = userConfig.getCurrentUser();
            }
            if (user != null) {
                this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.y1.k(new StringBuilder("+"), user.phone, oe.b.c())));
            }
            final int i22 = 3;
            this.d.setOnClickListener(new View.OnClickListener(this) {

                public final h f37214b;

                {
                    this.f37214b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i22) {
                        case 0:
                            h.U(this.f37214b);
                            break;
                        case 1:
                            h hVar = this.f37214b;
                            if (!hVar.f38630a.getAnimatedDrawable().f31317h0) {
                                hVar.f38630a.getAnimatedDrawable().L(0, false, false);
                                hVar.f38630a.d();
                            }
                            break;
                        case 2:
                            h hVar2 = this.f37214b;
                            if (!hVar2.f38630a.getAnimatedDrawable().f31317h0) {
                                hVar2.f38630a.getAnimatedDrawable().L(0, false, false);
                                hVar2.f38630a.d();
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.f37214b.getParentLayout()).l(true, false);
                            break;
                    }
                }
            });
            this.f38633e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
            org.telegram.messenger.y1.p(R.string.PhoneNumberHelp, this.f38634f);
            this.f38632c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
            this.f38630a.d();
            this.f38638w = true;
        } else if (i14 == 5) {
            int[] iArr = new int[8];
            this.f38637s = iArr;
            this.f38630a.f(R.raw.qr_login, 334, 334, iArr);
            this.f38630a.setScaleType(ImageView.ScaleType.CENTER);
            this.f38633e.setText(LocaleController.getString(R.string.AuthAnotherClient));
            this.f38632c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            this.f38630a.d();
        } else if (i14 == 6) {
            this.f38630a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f38630a.f(R.raw.utyan_passcode, 200, 200, null);
            this.f38630a.setFocusable(false);
            this.f38630a.setOnClickListener(new View.OnClickListener(this) {

                public final h f37214b;

                {
                    this.f37214b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            h.U(this.f37214b);
                            break;
                        case 1:
                            h hVar = this.f37214b;
                            if (!hVar.f38630a.getAnimatedDrawable().f31317h0) {
                                hVar.f38630a.getAnimatedDrawable().L(0, false, false);
                                hVar.f38630a.d();
                            }
                            break;
                        case 2:
                            h hVar2 = this.f37214b;
                            if (!hVar2.f38630a.getAnimatedDrawable().f31317h0) {
                                hVar2.f38630a.getAnimatedDrawable().L(0, false, false);
                                hVar2.f38630a.d();
                            }
                            break;
                        default:
                            ((ActionBarLayout) this.f37214b.getParentLayout()).l(true, false);
                            break;
                    }
                }
            });
            this.f38633e.setText(LocaleController.getString(R.string.Passcode));
            this.f38634f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
            this.f38632c.setText(LocaleController.getString(R.string.EnablePasscode));
            this.f38630a.d();
            this.f38638w = true;
        }
        if (this.f38638w) {
            this.f38632c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.f38632c.setTextSize(1, 15.0f);
        }
        c0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 0);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, eVar, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        }
        TextView textView = this.f38633e;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38634f, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        TextView[] textViewArr = this.f38635n;
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
        return i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, true)) > 0.699999988079071d;
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
                t9.e0(getParentActivity(), 1, new g(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
