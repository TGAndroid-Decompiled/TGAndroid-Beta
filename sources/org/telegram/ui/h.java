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
public final class h extends org.telegram.ui.ActionBar.o2 implements LocationController.LocationFetchCallback {
    public org.telegram.ui.Components.pi0 f38623a;
    public GradientDrawable f38624b;
    public bh.e f38625c;
    public TextView d;
    public TextView f38626e;
    public TextView f38627f;
    public LinearLayout h;
    public final TextView[] f38628n;
    public TextView f38629r;
    public int[] f38630s;
    public final int v;
    public boolean f38631w;
    public yr f38632x;
    public fb0 f38633y;

    public h(int i9) {
        super(null);
        this.f38628n = new TextView[6];
        this.v = i9;
    }

    public static void T(h hVar) {
        if (hVar.getParentActivity() != null) {
            int i9 = hVar.v;
            if (i9 != 0) {
                if (i9 != 3) {
                    if (i9 != 5) {
                        if (i9 == 6) {
                            hVar.presentFragment(new PasscodeActivity(1), true);
                            fb0 fb0Var = hVar.f38633y;
                            if (fb0Var != null) {
                                AndroidUtilities.runOnUIThread(fb0Var);
                                hVar.f38633y = null;
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (hVar.getParentActivity() == null) {
                        return;
                    } else {
                        if (Build.VERSION.SDK_INT >= 23 && hVar.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                            hVar.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                            return;
                        }
                        s9.d0(hVar.getParentActivity(), 1, new g(hVar, 0));
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PhoneNumberAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                hVar.showDialog(alertDialog$Builder.f22702a);
                return;
            }
            hVar.presentFragment(new id(aa.d.h(0, "step")), true);
        }
    }

    public final void Z(Runnable runnable) {
        this.f38633y = (fb0) runnable;
    }

    public final void a0(yr yrVar) {
        this.f38632x = yrVar;
    }

    public final void b0() {
        GradientDrawable gradientDrawable = this.f38624b;
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i9), getThemedColor(org.telegram.ui.ActionBar.f6.Ph)});
        this.f38625c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        bh.e eVar = this.f38625c;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        eVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, w02, w02));
        int[] iArr = this.f38630s;
        if (iArr != null && this.f38623a != null) {
            iArr[0] = 3355443;
            iArr[1] = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false);
            int[] iArr2 = this.f38630s;
            iArr2[2] = 16777215;
            int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
            iArr2[3] = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
            int[] iArr3 = this.f38630s;
            iArr3[4] = 5285866;
            iArr3[5] = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
            int[] iArr4 = this.f38630s;
            iArr4[6] = 2170912;
            iArr4[7] = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
            org.telegram.ui.Components.pi0 pi0Var = this.f38623a;
            int[] iArr5 = this.f38630s;
            org.telegram.ui.Components.mi0 mi0Var = pi0Var.f31672b;
            if (mi0Var != null) {
                mi0Var.f30857n = iArr5;
                mi0Var.E();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        float f11;
        int i9;
        float f12;
        int i10;
        String str;
        int i11;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23321v8, false), false);
            this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23287t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 12));
        }
        f fVar = new f(this, context, 0);
        this.fragmentView = fVar;
        fVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i12 = 2;
        viewGroup.setOnTouchListener(new jh.d(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        ?? imageView = new ImageView(context);
        this.f38623a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.f38626e = textView;
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        this.f38626e.setGravity(1);
        this.f38626e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f38626e.setTextSize(1, 24.0f);
        viewGroup.addView(this.f38626e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i14 = this.v;
        if (i14 == 3) {
            i13 = org.telegram.ui.ActionBar.f6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        this.d.setGravity(1);
        float f13 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f38627f = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false));
        this.f38627f.setGravity(1);
        this.f38627f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f38627f.setTextSize(1, 15.0f);
        if (i14 == 6 || i14 == 3) {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f38627f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f38627f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f38627f);
        if (i14 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
            LinearLayout linearLayout2 = this.h;
            if (LocaleController.isRTL) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            linearLayout2.setGravity(i9);
            viewGroup.addView(this.h);
            int i15 = 0;
            for (int i16 = 3; i15 < i16; i16 = 3) {
                LinearLayout f14 = org.telegram.messenger.ll.f(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i15 != i12) {
                    f12 = 7.0f;
                } else {
                    f12 = 0.0f;
                }
                linearLayout3.addView(f14, g7.e6.k(0.0f, 0.0f, 0.0f, f12, -2, -2));
                int i17 = i15 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f38628n;
                textViewArr[i17] = textView4;
                int i18 = org.telegram.ui.ActionBar.f6.G6;
                textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
                TextView textView5 = textViewArr[i17];
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                textViewArr[i17].setTextSize(1, f13);
                TextView textView6 = textViewArr[i17];
                if (LocaleController.isRTL) {
                    str = ".%d";
                } else {
                    str = "%d.";
                }
                int i19 = i15 + 1;
                textView6.setText(String.format(str, Integer.valueOf(i19)));
                textViewArr[i17].setTypeface(AndroidUtilities.bold());
                int i20 = i17 + 1;
                TextView textView7 = new TextView(context);
                textViewArr[i20] = textView7;
                textView7.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i18, false));
                TextView textView8 = textViewArr[i20];
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView8.setGravity(i11);
                textViewArr[i20].setTextSize(1, f13);
                if (i15 == 0) {
                    textViewArr[i20].setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
                    textViewArr[i20].setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.K6, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i20].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.p41(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.vz0) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i20].setText(spannableStringBuilder);
                } else if (i15 == 1) {
                    textViewArr[i20].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i20].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    f14.setGravity(5);
                    f14.addView(textViewArr[i20], g7.e6.l(1.0f, 0, -2));
                    f14.addView(textViewArr[i17], g7.e6.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f14.addView(textViewArr[i17], g7.e6.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    f14.addView(textViewArr[i20], g7.e6.n(-2, -2));
                }
                i15 = i19;
                i12 = 2;
                f13 = 15.0f;
            }
            this.f38627f.setVisibility(8);
        }
        TextView textView9 = new TextView(context);
        this.f38629r = textView9;
        textView9.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false));
        this.f38629r.setGravity(1);
        this.f38629r.setLineSpacing(AndroidUtilities.dp(f11), 1.0f);
        this.f38629r.setTextSize(1, 13.0f);
        this.f38629r.setVisibility(8);
        this.f38629r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.f38629r);
        this.f38624b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        bh.e eVar = new bh.e(this, context);
        this.f38625c = eVar;
        g7.g6.b(eVar, 0.02f, 1.2f);
        this.f38625c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f38625c.setGravity(17);
        this.f38625c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        this.f38625c.setTextSize(1, 14.0f);
        this.f38625c.setTypeface(AndroidUtilities.bold());
        bh.e eVar2 = this.f38625c;
        int dp = AndroidUtilities.dp(f10);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        eVar2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, w02, w02));
        viewGroup.addView(this.f38625c);
        this.f38625c.setOnClickListener(new View.OnClickListener(this) {
            public final h f37365b;

            {
                this.f37365b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h.T(this.f37365b);
                        return;
                    case 1:
                        h hVar = this.f37365b;
                        if (!hVar.f38623a.getAnimatedDrawable().f30852h0) {
                            hVar.f38623a.getAnimatedDrawable().L(0, false, false);
                            hVar.f38623a.d();
                            return;
                        }
                        return;
                    case 2:
                        h hVar2 = this.f37365b;
                        if (!hVar2.f38623a.getAnimatedDrawable().f30852h0) {
                            hVar2.f38623a.getAnimatedDrawable().L(0, false, false);
                            hVar2.f38623a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f37365b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i14 != 0) {
            if (i14 != 3) {
                if (i14 != 5) {
                    if (i14 == 6) {
                        this.f38623a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f38623a.f(R.raw.utyan_passcode, 200, 200, null);
                        this.f38623a.setFocusable(false);
                        this.f38623a.setOnClickListener(new View.OnClickListener(this) {
                            public final h f37365b;

                            {
                                this.f37365b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        h.T(this.f37365b);
                                        return;
                                    case 1:
                                        h hVar = this.f37365b;
                                        if (!hVar.f38623a.getAnimatedDrawable().f30852h0) {
                                            hVar.f38623a.getAnimatedDrawable().L(0, false, false);
                                            hVar.f38623a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        h hVar2 = this.f37365b;
                                        if (!hVar2.f38623a.getAnimatedDrawable().f30852h0) {
                                            hVar2.f38623a.getAnimatedDrawable().L(0, false, false);
                                            hVar2.f38623a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f37365b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.f38626e.setText(LocaleController.getString(R.string.Passcode));
                        this.f38627f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
                        this.f38625c.setText(LocaleController.getString(R.string.EnablePasscode));
                        this.f38623a.d();
                        this.f38631w = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f38630s = iArr;
                    this.f38623a.f(R.raw.qr_login, 334, 334, iArr);
                    this.f38623a.setScaleType(ImageView.ScaleType.CENTER);
                    this.f38626e.setText(LocaleController.getString(R.string.AuthAnotherClient));
                    this.f38625c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                    this.f38623a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f38623a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f38623a.f(R.raw.utyan_change_number, 200, 200, null);
                this.f38623a.setOnClickListener(new View.OnClickListener(this) {
                    public final h f37365b;

                    {
                        this.f37365b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h.T(this.f37365b);
                                return;
                            case 1:
                                h hVar = this.f37365b;
                                if (!hVar.f38623a.getAnimatedDrawable().f30852h0) {
                                    hVar.f38623a.getAnimatedDrawable().L(0, false, false);
                                    hVar.f38623a.d();
                                    return;
                                }
                                return;
                            case 2:
                                h hVar2 = this.f37365b;
                                if (!hVar2.f38623a.getAnimatedDrawable().f30852h0) {
                                    hVar2.f38623a.getAnimatedDrawable().L(0, false, false);
                                    hVar2.f38623a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f37365b.getParentLayout()).l(true, false);
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
                    this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.ll.g(new StringBuilder("+"), user.phone, ne.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final h f37365b;

                    {
                        this.f37365b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h.T(this.f37365b);
                                return;
                            case 1:
                                h hVar = this.f37365b;
                                if (!hVar.f38623a.getAnimatedDrawable().f30852h0) {
                                    hVar.f38623a.getAnimatedDrawable().L(0, false, false);
                                    hVar.f38623a.d();
                                    return;
                                }
                                return;
                            case 2:
                                h hVar2 = this.f37365b;
                                if (!hVar2.f38623a.getAnimatedDrawable().f30852h0) {
                                    hVar2.f38623a.getAnimatedDrawable().L(0, false, false);
                                    hVar2.f38623a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f37365b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.f38626e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                org.telegram.messenger.l0.m(R.string.PhoneNumberHelp, this.f38627f);
                this.f38625c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                this.f38623a.d();
                this.f38631w = true;
            }
        } else {
            this.f38623a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f38623a.f(R.raw.channel_create, 200, 200, null);
            this.f38626e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f38627f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.f38625c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.f38623a.d();
            this.f38631w = true;
        }
        if (this.f38631w) {
            this.f38625c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.f38625c.setTextSize(1, 15.0f);
        }
        b0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 0);
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, eVar, i9));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        }
        TextView textView = this.f38626e;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, eVar, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f38627f, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.D6));
        TextView[] textViewArr = this.f38628n;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr[0], 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr[1], 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr[1], 2, null, null, null, null, org.telegram.ui.ActionBar.f6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr[2], 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr[3], 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr[4], 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(textViewArr[5], 4, null, null, null, null, i10));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, true)) > 0.699999988079071d) {
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
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i9 == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                s9.d0(getParentActivity(), 1, new g(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
