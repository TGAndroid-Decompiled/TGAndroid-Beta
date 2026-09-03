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
public final class i extends org.telegram.ui.ActionBar.p2 implements LocationController.LocationFetchCallback {
    public org.telegram.ui.Components.kj0 f37508a;
    public GradientDrawable f37509b;
    public fg.s0 f37510c;
    public TextView d;
    public TextView f37511e;
    public TextView f37512f;
    public LinearLayout h;
    public final TextView[] f37513n;
    public TextView f37514r;
    public int[] f37515s;
    public final int v;
    public boolean f37516w;
    public rs f37517x;
    public rb0 f37518y;

    public i(int i10) {
        super(null);
        this.f37513n = new TextView[6];
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
                            rb0 rb0Var = iVar.f37518y;
                            if (rb0Var != null) {
                                AndroidUtilities.runOnUIThread(rb0Var);
                                iVar.f37518y = null;
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
                        v9.e0(iVar.getParentActivity(), 1, new h(iVar, 0));
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iVar.getParentActivity());
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.PhoneNumberAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new d(iVar, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                iVar.showDialog(alertDialog$Builder.f21168a);
                return;
            }
            iVar.presentFragment(new nd(android.support.v4.media.a.h(0, "step")), true);
        }
    }

    public final void a0(Runnable runnable) {
        this.f37518y = (rb0) runnable;
    }

    public final void b0(rs rsVar) {
        this.f37517x = rsVar;
    }

    public final void c0() {
        GradientDrawable gradientDrawable = this.f37509b;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.k6.Ph)});
        this.f37510c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        fg.s0 s0Var = this.f37510c;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        s0Var.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, w02, w02));
        int[] iArr = this.f37515s;
        if (iArr != null && this.f37508a != null) {
            iArr[0] = 3355443;
            iArr[1] = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false);
            int[] iArr2 = this.f37515s;
            iArr2[2] = 16777215;
            int i11 = org.telegram.ui.ActionBar.k6.f21661d6;
            iArr2[3] = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
            int[] iArr3 = this.f37515s;
            iArr3[4] = 5285866;
            iArr3[5] = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
            int[] iArr4 = this.f37515s;
            iArr4[6] = 2170912;
            iArr4[7] = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
            org.telegram.ui.Components.kj0 kj0Var = this.f37508a;
            int[] iArr5 = this.f37515s;
            org.telegram.ui.Components.hj0 hj0Var = kj0Var.f28425b;
            if (hj0Var != null) {
                hj0Var.f27534n = iArr5;
                hj0Var.E();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        int i11;
        String str;
        int i12;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21983v8, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21948t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 4));
        }
        g gVar = new g(this, context, 0);
        this.fragmentView = gVar;
        gVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        viewGroup.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        ?? imageView = new ImageView(context);
        this.f37508a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.f37511e = textView;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.f37511e.setGravity(1);
        this.f37511e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f37511e.setTextSize(1, 24.0f);
        viewGroup.addView(this.f37511e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i14 = this.v;
        if (i14 == 3) {
            i13 = org.telegram.ui.ActionBar.k6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        this.d.setGravity(1);
        float f14 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f37512f = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.D6, false));
        this.f37512f.setGravity(1);
        this.f37512f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f37512f.setTextSize(1, 15.0f);
        if (i14 == 6 || i14 == 3) {
            f10 = 32.0f;
            f11 = 24.0f;
            this.f37512f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f10 = 32.0f;
            f11 = 24.0f;
            this.f37512f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f37512f);
        int i15 = 2;
        if (i14 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            f12 = 2.0f;
            this.h.setPadding(AndroidUtilities.dp(f11), 0, AndroidUtilities.dp(f11), 0);
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
                LinearLayout f15 = org.telegram.messenger.y3.f(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i16 != i15) {
                    f13 = 7.0f;
                } else {
                    f13 = 0.0f;
                }
                linearLayout3.addView(f15, k7.c6.k(0.0f, 0.0f, 0.0f, f13, -2, -2));
                int i18 = i16 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f37513n;
                textViewArr[i18] = textView4;
                int i19 = org.telegram.ui.ActionBar.k6.G6;
                textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i19, false));
                TextView textView5 = textViewArr[i18];
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView5.setGravity(i11);
                textViewArr[i18].setTextSize(1, f14);
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
                textView7.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i19, false));
                TextView textView8 = textViewArr[i21];
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView8.setGravity(i12);
                textViewArr[i21].setTextSize(1, f14);
                if (i16 == 0) {
                    textViewArr[i21].setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
                    textViewArr[i21].setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.K6, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i21].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l51(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.s01) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i21].setText(spannableStringBuilder);
                } else if (i16 == 1) {
                    textViewArr[i21].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i21].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    f15.setGravity(5);
                    f15.addView(textViewArr[i21], k7.c6.l(1.0f, 0, -2));
                    f15.addView(textViewArr[i18], k7.c6.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f15.addView(textViewArr[i18], k7.c6.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    f15.addView(textViewArr[i21], k7.c6.n(-2, -2));
                }
                i16 = i20;
                f14 = 15.0f;
                i15 = 2;
            }
            this.f37512f.setVisibility(8);
        } else {
            f12 = 2.0f;
        }
        TextView textView9 = new TextView(context);
        this.f37514r = textView9;
        textView9.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.D6, false));
        this.f37514r.setGravity(1);
        this.f37514r.setLineSpacing(AndroidUtilities.dp(f12), 1.0f);
        this.f37514r.setTextSize(1, 13.0f);
        this.f37514r.setVisibility(8);
        this.f37514r.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
        viewGroup.addView(this.f37514r);
        this.f37509b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        fg.s0 s0Var = new fg.s0(this, context);
        this.f37510c = s0Var;
        k7.e6.b(s0Var, 0.02f, 1.2f);
        this.f37510c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f37510c.setGravity(17);
        this.f37510c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
        this.f37510c.setTextSize(1, 14.0f);
        this.f37510c.setTypeface(AndroidUtilities.bold());
        fg.s0 s0Var2 = this.f37510c;
        int dp = AndroidUtilities.dp(f11);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
        s0Var2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, w02, w02));
        viewGroup.addView(this.f37510c);
        this.f37510c.setOnClickListener(new View.OnClickListener(this) {
            public final i f36291b;

            {
                this.f36291b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i.U(this.f36291b);
                        return;
                    case 1:
                        i iVar = this.f36291b;
                        if (!iVar.f37508a.getAnimatedDrawable().f27530i0) {
                            iVar.f37508a.getAnimatedDrawable().L(0, false, false);
                            iVar.f37508a.d();
                            return;
                        }
                        return;
                    case 2:
                        i iVar2 = this.f36291b;
                        if (!iVar2.f37508a.getAnimatedDrawable().f27530i0) {
                            iVar2.f37508a.getAnimatedDrawable().L(0, false, false);
                            iVar2.f37508a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f36291b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i14 != 0) {
            if (i14 != 3) {
                if (i14 != 5) {
                    if (i14 == 6) {
                        this.f37508a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f37508a.f(R.raw.utyan_passcode, 200, 200, null);
                        this.f37508a.setFocusable(false);
                        this.f37508a.setOnClickListener(new View.OnClickListener(this) {
                            public final i f36291b;

                            {
                                this.f36291b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        i.U(this.f36291b);
                                        return;
                                    case 1:
                                        i iVar = this.f36291b;
                                        if (!iVar.f37508a.getAnimatedDrawable().f27530i0) {
                                            iVar.f37508a.getAnimatedDrawable().L(0, false, false);
                                            iVar.f37508a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        i iVar2 = this.f36291b;
                                        if (!iVar2.f37508a.getAnimatedDrawable().f27530i0) {
                                            iVar2.f37508a.getAnimatedDrawable().L(0, false, false);
                                            iVar2.f37508a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f36291b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.f37511e.setText(LocaleController.getString(R.string.Passcode));
                        this.f37512f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
                        this.f37510c.setText(LocaleController.getString(R.string.EnablePasscode));
                        this.f37508a.d();
                        this.f37516w = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f37515s = iArr;
                    this.f37508a.f(R.raw.qr_login, 334, 334, iArr);
                    this.f37508a.setScaleType(ImageView.ScaleType.CENTER);
                    this.f37511e.setText(LocaleController.getString(R.string.AuthAnotherClient));
                    this.f37510c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                    this.f37508a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f37508a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f37508a.f(R.raw.utyan_change_number, 200, 200, null);
                this.f37508a.setOnClickListener(new View.OnClickListener(this) {
                    public final i f36291b;

                    {
                        this.f36291b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i.U(this.f36291b);
                                return;
                            case 1:
                                i iVar = this.f36291b;
                                if (!iVar.f37508a.getAnimatedDrawable().f27530i0) {
                                    iVar.f37508a.getAnimatedDrawable().L(0, false, false);
                                    iVar.f37508a.d();
                                    return;
                                }
                                return;
                            case 2:
                                i iVar2 = this.f36291b;
                                if (!iVar2.f37508a.getAnimatedDrawable().f27530i0) {
                                    iVar2.f37508a.getAnimatedDrawable().L(0, false, false);
                                    iVar2.f37508a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f36291b.getParentLayout()).l(true, false);
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
                    this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.y3.j(new StringBuilder("+"), user.phone, se.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final i f36291b;

                    {
                        this.f36291b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i.U(this.f36291b);
                                return;
                            case 1:
                                i iVar = this.f36291b;
                                if (!iVar.f37508a.getAnimatedDrawable().f27530i0) {
                                    iVar.f37508a.getAnimatedDrawable().L(0, false, false);
                                    iVar.f37508a.d();
                                    return;
                                }
                                return;
                            case 2:
                                i iVar2 = this.f36291b;
                                if (!iVar2.f37508a.getAnimatedDrawable().f27530i0) {
                                    iVar2.f37508a.getAnimatedDrawable().L(0, false, false);
                                    iVar2.f37508a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f36291b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.f37511e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                org.telegram.messenger.y3.q(R.string.PhoneNumberHelp, this.f37512f);
                this.f37510c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                this.f37508a.d();
                this.f37516w = true;
            }
        } else {
            this.f37508a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f37508a.f(R.raw.channel_create, 200, 200, null);
            this.f37511e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f37512f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.f37510c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.f37508a.d();
            this.f37516w = true;
        }
        if (this.f37516w) {
            this.f37510c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.f37510c.setTextSize(1, 15.0f);
        }
        c0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 0);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, fVar, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        }
        TextView textView = this.f37511e;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, fVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37512f, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.D6));
        TextView[] textViewArr = this.f37513n;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textViewArr[0], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(textViewArr[1], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(textViewArr[1], 2, null, null, null, null, org.telegram.ui.ActionBar.k6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(textViewArr[2], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(textViewArr[3], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(textViewArr[4], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(textViewArr[5], 4, null, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, true)) > 0.699999988079071d) {
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
                v9.e0(getParentActivity(), 1, new h(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f21168a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new d(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
