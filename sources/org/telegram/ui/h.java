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
    public org.telegram.ui.Components.aj0 f36823a;
    public GradientDrawable f36824b;
    public ci.n f36825c;
    public TextView d;
    public TextView f36826e;
    public TextView f36827f;
    public LinearLayout h;
    public final TextView[] f36828n;
    public TextView f36829r;
    public int[] f36830s;
    public final int v;
    public boolean f36831w;
    public z10 f36832x;
    public ac0 f36833y;

    public h(int i10) {
        super(null);
        this.f36828n = new TextView[6];
        this.v = i10;
    }

    public static void U(h hVar) {
        if (hVar.getParentActivity() != null) {
            int i10 = hVar.v;
            if (i10 != 0) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 == 6) {
                            hVar.presentFragment(new PasscodeActivity(1), true);
                            ac0 ac0Var = hVar.f36833y;
                            if (ac0Var != null) {
                                AndroidUtilities.runOnUIThread(ac0Var);
                                hVar.f36833y = null;
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
                        u9.e0(hVar.getParentActivity(), 1, new g(hVar, 0));
                        return;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hVar.getParentActivity());
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.PhoneNumberChangeTitle);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.PhoneNumberAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Change), new c(hVar, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                hVar.showDialog(alertDialog$Builder.f20198a);
                return;
            }
            hVar.presentFragment(new md(org.telegram.ui.Cells.p6.e(0, "step")), true);
        }
    }

    public final void a0(Runnable runnable) {
        this.f36833y = (ac0) runnable;
    }

    public final void b0(z10 z10Var) {
        this.f36832x = z10Var;
    }

    public final void c0() {
        GradientDrawable gradientDrawable = this.f36824b;
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        gradientDrawable.setColors(new int[]{getThemedColor(i10), getThemedColor(org.telegram.ui.ActionBar.j6.Ph)});
        this.f36825c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        ci.n nVar = this.f36825c;
        int dp = AndroidUtilities.dp(24.0f);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        nVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, w02, w02));
        int[] iArr = this.f36830s;
        if (iArr != null && this.f36823a != null) {
            iArr[0] = 3355443;
            iArr[1] = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false);
            int[] iArr2 = this.f36830s;
            iArr2[2] = 16777215;
            int i11 = org.telegram.ui.ActionBar.j6.f20663d6;
            iArr2[3] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            int[] iArr3 = this.f36830s;
            iArr3[4] = 5285866;
            iArr3[5] = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
            int[] iArr4 = this.f36830s;
            iArr4[6] = 2170912;
            iArr4[7] = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            org.telegram.ui.Components.aj0 aj0Var = this.f36823a;
            int[] iArr5 = this.f36830s;
            org.telegram.ui.Components.xi0 xi0Var = aj0Var.f24406b;
            if (xi0Var != null) {
                xi0Var.f32567n = iArr5;
                xi0Var.E();
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
            kVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20992v8, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20956t8, false), false);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 18));
        }
        f fVar = new f(this, context, 0);
        this.fragmentView = fVar;
        fVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        int i13 = 2;
        viewGroup.setOnTouchListener(new ci.d(2));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (kVar2 != null) {
            viewGroup.addView(kVar2);
        }
        ?? imageView = new ImageView(context);
        this.f36823a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.f36826e = textView;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.f36826e.setGravity(1);
        this.f36826e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f36826e.setTextSize(1, 24.0f);
        viewGroup.addView(this.f36826e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        int i15 = this.v;
        if (i15 == 3) {
            i14 = org.telegram.ui.ActionBar.j6.Oh;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        this.d.setGravity(1);
        float f12 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f36827f = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.f36827f.setGravity(1);
        this.f36827f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f36827f.setTextSize(1, 15.0f);
        if (i15 == 6 || i15 == 3) {
            f7 = 24.0f;
            f10 = 2.0f;
            this.f36827f.setPadding(AndroidUtilities.dp(48.0f), 0, AndroidUtilities.dp(48.0f), 0);
        } else {
            f7 = 24.0f;
            f10 = 2.0f;
            this.f36827f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        }
        viewGroup.addView(this.f36827f);
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
            int i16 = 0;
            for (int i17 = 3; i16 < i17; i17 = 3) {
                LinearLayout f13 = org.telegram.messenger.vl.f(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i16 != i13) {
                    f11 = 7.0f;
                } else {
                    f11 = 0.0f;
                }
                linearLayout3.addView(f13, w7.x5.k(0.0f, 0.0f, 0.0f, f11, -2, -2));
                int i18 = i16 * 2;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.f36828n;
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
                textView7.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                TextView textView8 = textViewArr[i21];
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView8.setGravity(i12);
                textViewArr[i21].setTextSize(1, f12);
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
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l51(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), (org.telegram.ui.Components.n01) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i21].setText(spannableStringBuilder);
                } else if (i16 == 1) {
                    textViewArr[i21].setText(LocaleController.getString(R.string.AuthAnotherClientInfo2));
                } else {
                    textViewArr[i21].setText(LocaleController.getString(R.string.AuthAnotherClientInfo3));
                }
                if (LocaleController.isRTL) {
                    f13.setGravity(5);
                    f13.addView(textViewArr[i21], w7.x5.l(1.0f, 0, -2));
                    f13.addView(textViewArr[i18], w7.x5.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f13.addView(textViewArr[i18], w7.x5.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    f13.addView(textViewArr[i21], w7.x5.n(-2, -2));
                }
                i16 = i20;
                i13 = 2;
                f12 = 15.0f;
            }
            this.f36827f.setVisibility(8);
        }
        TextView textView9 = new TextView(context);
        this.f36829r = textView9;
        textView9.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.f36829r.setGravity(1);
        this.f36829r.setLineSpacing(AndroidUtilities.dp(f10), 1.0f);
        this.f36829r.setTextSize(1, 13.0f);
        this.f36829r.setVisibility(8);
        this.f36829r.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        viewGroup.addView(this.f36829r);
        this.f36824b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        ci.n nVar = new ci.n(this, context);
        this.f36825c = nVar;
        w7.z5.b(nVar, 0.02f, 1.2f);
        this.f36825c.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f36825c.setGravity(17);
        this.f36825c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.f36825c.setTextSize(1, 14.0f);
        this.f36825c.setTypeface(AndroidUtilities.bold());
        ci.n nVar2 = this.f36825c;
        int dp = AndroidUtilities.dp(f7);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        nVar2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, w02, w02));
        viewGroup.addView(this.f36825c);
        this.f36825c.setOnClickListener(new View.OnClickListener(this) {
            public final h f35581b;

            {
                this.f35581b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        h.U(this.f35581b);
                        return;
                    case 1:
                        h hVar = this.f35581b;
                        if (!hVar.f36823a.getAnimatedDrawable().f32566l0) {
                            hVar.f36823a.getAnimatedDrawable().L(0, false, false);
                            hVar.f36823a.d();
                            return;
                        }
                        return;
                    case 2:
                        h hVar2 = this.f35581b;
                        if (!hVar2.f36823a.getAnimatedDrawable().f32566l0) {
                            hVar2.f36823a.getAnimatedDrawable().L(0, false, false);
                            hVar2.f36823a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) this.f35581b.getParentLayout()).l(true, false);
                        return;
                }
            }
        });
        if (i15 != 0) {
            if (i15 != 3) {
                if (i15 != 5) {
                    if (i15 == 6) {
                        this.f36823a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f36823a.f(R.raw.utyan_passcode, 200, 200, null);
                        this.f36823a.setFocusable(false);
                        this.f36823a.setOnClickListener(new View.OnClickListener(this) {
                            public final h f35581b;

                            {
                                this.f35581b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (r2) {
                                    case 0:
                                        h.U(this.f35581b);
                                        return;
                                    case 1:
                                        h hVar = this.f35581b;
                                        if (!hVar.f36823a.getAnimatedDrawable().f32566l0) {
                                            hVar.f36823a.getAnimatedDrawable().L(0, false, false);
                                            hVar.f36823a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        h hVar2 = this.f35581b;
                                        if (!hVar2.f36823a.getAnimatedDrawable().f32566l0) {
                                            hVar2.f36823a.getAnimatedDrawable().L(0, false, false);
                                            hVar2.f36823a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) this.f35581b.getParentLayout()).l(true, false);
                                        return;
                                }
                            }
                        });
                        this.f36826e.setText(LocaleController.getString(R.string.Passcode));
                        this.f36827f.setText(LocaleController.getString(R.string.ChangePasscodeInfoShort));
                        this.f36825c.setText(LocaleController.getString(R.string.EnablePasscode));
                        this.f36823a.d();
                        this.f36831w = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.f36830s = iArr;
                    this.f36823a.f(R.raw.qr_login, 334, 334, iArr);
                    this.f36823a.setScaleType(ImageView.ScaleType.CENTER);
                    this.f36826e.setText(LocaleController.getString(R.string.AuthAnotherClient));
                    this.f36825c.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
                    this.f36823a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.f36823a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f36823a.f(R.raw.utyan_change_number, 200, 200, null);
                this.f36823a.setOnClickListener(new View.OnClickListener(this) {
                    public final h f35581b;

                    {
                        this.f35581b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h.U(this.f35581b);
                                return;
                            case 1:
                                h hVar = this.f35581b;
                                if (!hVar.f36823a.getAnimatedDrawable().f32566l0) {
                                    hVar.f36823a.getAnimatedDrawable().L(0, false, false);
                                    hVar.f36823a.d();
                                    return;
                                }
                                return;
                            case 2:
                                h hVar2 = this.f35581b;
                                if (!hVar2.f36823a.getAnimatedDrawable().f32566l0) {
                                    hVar2.f36823a.getAnimatedDrawable().L(0, false, false);
                                    hVar2.f36823a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f35581b.getParentLayout()).l(true, false);
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
                    this.d.setText(LocaleController.formatString("PhoneNumberKeepButton", R.string.PhoneNumberKeepButton, org.telegram.messenger.w1.j(new StringBuilder("+"), user.phone, gf.b.c())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final h f35581b;

                    {
                        this.f35581b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                h.U(this.f35581b);
                                return;
                            case 1:
                                h hVar = this.f35581b;
                                if (!hVar.f36823a.getAnimatedDrawable().f32566l0) {
                                    hVar.f36823a.getAnimatedDrawable().L(0, false, false);
                                    hVar.f36823a.d();
                                    return;
                                }
                                return;
                            case 2:
                                h hVar2 = this.f35581b;
                                if (!hVar2.f36823a.getAnimatedDrawable().f32566l0) {
                                    hVar2.f36823a.getAnimatedDrawable().L(0, false, false);
                                    hVar2.f36823a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) this.f35581b.getParentLayout()).l(true, false);
                                return;
                        }
                    }
                });
                this.f36826e.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                org.telegram.messenger.w1.n(R.string.PhoneNumberHelp, this.f36827f);
                this.f36825c.setText(LocaleController.getString(R.string.PhoneNumberChange2));
                this.f36823a.d();
                this.f36831w = true;
            }
        } else {
            this.f36823a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f36823a.f(R.raw.channel_create, 200, 200, null);
            this.f36826e.setText(LocaleController.getString(R.string.ChannelAlertTitle));
            this.f36827f.setText(LocaleController.getString(R.string.ChannelAlertText));
            this.f36825c.setText(LocaleController.getString(R.string.ChannelAlertCreate2));
            this.f36823a.d();
            this.f36831w = true;
        }
        if (this.f36831w) {
            this.f36825c.setPadding(AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(34.0f), AndroidUtilities.dp(8.0f));
            this.f36825c.setTextSize(1, 15.0f);
        }
        c0();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 0);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f20663d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, eVar, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        }
        TextView textView = this.f36826e;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, eVar, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36827f, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        TextView[] textViewArr = this.f36828n;
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
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, true)) > 0.699999988079071d) {
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
                u9.e0(getParentActivity(), 1, new g(this, 0));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20198a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new c(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
            alertDialog$Builder.o();
        }
    }
}
