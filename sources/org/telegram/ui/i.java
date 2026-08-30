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
    public org.telegram.ui.Components.jj0 f34979a;
    public GradientDrawable f34980b;
    public eg.s0 f34981c;
    public TextView d;
    public TextView e;
    public TextView f34982f;
    public LinearLayout h;
    public final TextView[] f34983n;
    public TextView f34984r;
    public int[] f34985s;
    public final int v;
    public boolean f34986w;
    public qs f34987x;
    public qb0 f34988y;

    public i(int i10) {
        super(null);
        this.f34983n = new TextView[6];
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
                            qb0 qb0Var = iVar.f34988y;
                            if (qb0Var != null) {
                                AndroidUtilities.runOnUIThread(qb0Var);
                                iVar.f34988y = null;
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
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.PhoneNumberAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new d(iVar, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                iVar.showDialog(alertDialog$Builder.f19503a);
                return;
            }
            iVar.presentFragment(new nd(android.support.v4.media.a.h(0, "step")), true);
        }
    }

    public final void a0(Runnable runnable) {
        this.f34988y = (qb0) runnable;
    }

    public final void b0(qs qsVar) {
        this.f34987x = qsVar;
    }

    public final void c0() {
        GradientDrawable gradientDrawable = this.f34980b;
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.j6.Ph)});
        this.f34981c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        eg.s0 s0Var = this.f34981c;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        s0Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, w02, w02));
        int[] iArr = this.f34985s;
        if (iArr != null && this.f34979a != null) {
            iArr[0] = 3355443;
            iArr[1] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false);
            int[] iArr2 = this.f34985s;
            iArr2[2] = 16777215;
            int i11 = org.telegram.ui.ActionBar.j6.f19906d6;
            iArr2[3] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            int[] iArr3 = this.f34985s;
            iArr3[4] = 5285866;
            iArr3[5] = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            int[] iArr4 = this.f34985s;
            iArr4[6] = 2170912;
            iArr4[7] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            org.telegram.ui.Components.jj0 jj0Var = this.f34979a;
            int[] iArr5 = this.f34985s;
            org.telegram.ui.Components.gj0 gj0Var = jj0Var.f25995b;
            if (gj0Var != null) {
                gj0Var.f25162n = iArr5;
                gj0Var.E();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        float f11;
        int i10;
        float f12;
        int i11;
        String str;
        int i12;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20227v8, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20192t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 4));
        }
        g gVar = new g(this, context, 0);
        this.fragmentView = gVar;
        gVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i13 = 2;
        viewGroup.setOnTouchListener(new oh.d(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        ?? imageView = new ImageView(context);
        this.f34979a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.e = textView;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.e.setGravity(1);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i15 = this.v;
        if (i15 == 3) {
            i14 = org.telegram.ui.ActionBar.j6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.d.setGravity(1);
        float f13 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f34982f = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.f34982f.setGravity(1);
        this.f34982f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f34982f.setTextSize(1, 15.0f);
        if (i15 == 6 || i15 == 3) {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f34982f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f10 = 24.0f;
            f11 = 2.0f;
            this.f34982f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f34982f);
        if (i15 == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            this.h.setPadding(AndroidUtilities.dp(f10), 0, AndroidUtilities.dp(f10), 0);
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
                LinearLayout f14 = org.telegram.messenger.y3.f(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i16 != i13) {
                    f12 = 7.0f;
                } else {
                    f12 = 0.0f;
                }
                linearLayout3.addView(f14, k7.b6.k(0.0f, 0.0f, 0.0f, f12, -2, -2));
                int i18 = i16 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f34983n;
                textViewArr[i18] = textView4;
                int i19 = org.telegram.ui.ActionBar.j6.G6;
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                TextView textView5 = textViewArr[i18];
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView5.setGravity(i11);
                textViewArr[i18].setTextSize(1, f13);
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
                textView7.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                TextView textView8 = textViewArr[i21];
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView8.setGravity(i12);
                textViewArr[i21].setTextSize(1, f13);
                if (i16 == 0) {
                    textViewArr[i21].setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
                    textViewArr[i21].setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
                    String string = LocaleController.getString(R.string.AuthAnotherClientInfo1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    int indexOf = string.indexOf(42);
                    int lastIndexOf = string.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i21].setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.m51(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.s01) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i21].setText(spannableStringBuilder);
                } else if (i16 == 1) {
                    textViewArr[i21].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i21].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    f14.setGravity(5);
                    f14.addView(textViewArr[i21], k7.b6.l(1.0f, 0, -2));
                    f14.addView(textViewArr[i18], k7.b6.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f14.addView(textViewArr[i18], k7.b6.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    f14.addView(textViewArr[i21], k7.b6.n(-2, -2));
                }
                i16 = i20;
                i13 = 2;
                f13 = 15.0f;
            }
            this.f34982f.setVisibility(8);
        }
        TextView textView9 = new TextView(context);
        this.f34984r = textView9;
        textView9.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.f34984r.setGravity(1);
        this.f34984r.setLineSpacing(AndroidUtilities.dp(f11), 1.0f);
        this.f34984r.setTextSize(1, 13.0f);
        this.f34984r.setVisibility(8);
        this.f34984r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.f34984r);
        this.f34980b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        eg.s0 s0Var = new eg.s0(this, context);
        this.f34981c = s0Var;
        k7.d6.b(s0Var, 0.02f, 1.2f);
        this.f34981c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f34981c.setGravity(17);
        this.f34981c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.f34981c.setTextSize(1, 14.0f);
        this.f34981c.setTypeface(AndroidUtilities.bold());
        eg.s0 s0Var2 = this.f34981c;
        int dp = AndroidUtilities.dp(f10);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        s0Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, w02, w02));
        viewGroup.addView(this.f34981c);
        this.f34981c.setOnClickListener(new View.OnClickListener(this) {
            public final i f33828b;

            {
                this.f33828b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        i.U(this.f33828b);
                        return;
                    case 1:
                        i iVar = this.f33828b;
                        if (!iVar.f34979a.getAnimatedDrawable().f25158i0) {
                            iVar.f34979a.getAnimatedDrawable().L(0, false, false);
                            iVar.f34979a.d();
                            return;
                        }
                        return;
                    case 2:
                        i iVar2 = this.f33828b;
                        if (!iVar2.f34979a.getAnimatedDrawable().f25158i0) {
                            iVar2.f34979a.getAnimatedDrawable().L(0, false, false);
                            iVar2.f34979a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f33828b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i15 != 0) {
            if (i15 != 3) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        this.f34979a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f34979a.f(R.raw.utyan_passcode, 200, 200, null);
                        this.f34979a.setFocusable(false);
                        this.f34979a.setOnClickListener(new View.OnClickListener(this) {
                            public final i f33828b;

                            {
                                this.f33828b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        i.U(this.f33828b);
                                        return;
                                    case 1:
                                        i iVar = this.f33828b;
                                        if (!iVar.f34979a.getAnimatedDrawable().f25158i0) {
                                            iVar.f34979a.getAnimatedDrawable().L(0, false, false);
                                            iVar.f34979a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        i iVar2 = this.f33828b;
                                        if (!iVar2.f34979a.getAnimatedDrawable().f25158i0) {
                                            iVar2.f34979a.getAnimatedDrawable().L(0, false, false);
                                            iVar2.f34979a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f33828b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.e.setText(LocaleController.getString(R.string.Passcode));
                        this.f34982f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
                        this.f34981c.setText(LocaleController.getString(R.string.EnablePasscode));
                        this.f34979a.d();
                        this.f34986w = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f34985s = iArr;
                    this.f34979a.f(R.raw.qr_login, 334, 334, iArr);
                    this.f34979a.setScaleType(ImageView.ScaleType.CENTER);
                    this.e.setText(LocaleController.getString(R.string.AuthAnotherClient));
                    this.f34981c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                    this.f34979a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f34979a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f34979a.f(R.raw.utyan_change_number, 200, 200, null);
                this.f34979a.setOnClickListener(new View.OnClickListener(this) {
                    public final i f33828b;

                    {
                        this.f33828b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i.U(this.f33828b);
                                return;
                            case 1:
                                i iVar = this.f33828b;
                                if (!iVar.f34979a.getAnimatedDrawable().f25158i0) {
                                    iVar.f34979a.getAnimatedDrawable().L(0, false, false);
                                    iVar.f34979a.d();
                                    return;
                                }
                                return;
                            case 2:
                                i iVar2 = this.f33828b;
                                if (!iVar2.f34979a.getAnimatedDrawable().f25158i0) {
                                    iVar2.f34979a.getAnimatedDrawable().L(0, false, false);
                                    iVar2.f34979a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f33828b.getParentLayout()).l(true, false);
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
                    public final i f33828b;

                    {
                        this.f33828b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i.U(this.f33828b);
                                return;
                            case 1:
                                i iVar = this.f33828b;
                                if (!iVar.f34979a.getAnimatedDrawable().f25158i0) {
                                    iVar.f34979a.getAnimatedDrawable().L(0, false, false);
                                    iVar.f34979a.d();
                                    return;
                                }
                                return;
                            case 2:
                                i iVar2 = this.f33828b;
                                if (!iVar2.f34979a.getAnimatedDrawable().f25158i0) {
                                    iVar2.f34979a.getAnimatedDrawable().L(0, false, false);
                                    iVar2.f34979a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f33828b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                org.telegram.messenger.y3.q(R.string.PhoneNumberHelp, this.f34982f);
                this.f34981c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                this.f34979a.d();
                this.f34986w = true;
            }
        } else {
            this.f34979a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f34979a.f(R.raw.channel_create, 200, 200, null);
            this.e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f34982f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.f34981c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.f34979a.d();
            this.f34986w = true;
        }
        if (this.f34986w) {
            this.f34981c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.f34981c.setTextSize(1, 15.0f);
        }
        c0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 0);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, fVar, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        }
        TextView textView = this.e;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, fVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34982f, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        TextView[] textViewArr = this.f34983n;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[0], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[1], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[1], 2, null, null, null, null, org.telegram.ui.ActionBar.j6.J6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[2], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[3], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[4], 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(textViewArr[5], 4, null, null, null, null, i11));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, true)) > 0.699999988079071d) {
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
            alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new d(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
