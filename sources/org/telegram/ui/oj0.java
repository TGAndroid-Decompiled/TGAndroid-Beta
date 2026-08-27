package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;

public final class oj0 extends org.telegram.ui.ActionBar.e3 implements AdapterView.OnItemSelectedListener {
    public static final int Z = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public boolean F;
    public String G;
    public String H;
    public final org.telegram.ui.ActionBar.n2 I;
    public final int J;
    public final mj0 K;
    public final View L;
    public final mj0 M;
    public final ImageView N;
    public final org.telegram.ui.Components.bp O;
    public final TextView P;
    public final LinearLayout Q;
    public int R;
    public final lj0 S;
    public final TextView T;
    public final RadialProgressView U;
    public final FrameLayout V;
    public final TextView W;
    public String X;
    public int Y;

    public final LinearLayout f41120b;

    public final org.telegram.ui.Components.hq f41121c;
    public final org.telegram.ui.Components.ic0 d;

    public final org.telegram.ui.Components.ic0 f41122e;

    public final FrameLayout f41123f;
    public final View h;

    public final lh.d f41124n;

    public final org.telegram.ui.Components.ic0 f41125r;

    public final org.telegram.ui.Components.jc0 f41126s;
    public final org.telegram.ui.Components.p80 v;

    public final ArrayList f41127w;

    public final HashMap f41128x;

    public final HashMap f41129y;

    public oj0(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        String upperCase;
        String str;
        nt ntVar;
        super(context, true);
        final int i10 = 1;
        this.f41127w = new ArrayList();
        this.f41128x = new HashMap();
        this.f41129y = new HashMap();
        this.Y = -1;
        fixNavigationBar();
        this.waitingKeyboard = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.J = ConnectionsManager.generateClassGuid();
        this.I = n2Var;
        Context context2 = getContext();
        org.telegram.ui.Components.hq hqVar = new org.telegram.ui.Components.hq(context2, 1);
        this.f41121c = hqVar;
        final int i11 = 4;
        hqVar.setVisibility(4);
        ScrollView scrollView = new ScrollView(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f41120b = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.f41120b.setOrientation(1);
        scrollView.addView(this.f41120b, h7.z5.x(-1, -2, 51));
        this.f41120b.setOnTouchListener(new kh.e(27));
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f41120b.addView(frameLayout, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.ic0 ic0Var = new org.telegram.ui.Components.ic0(context2);
        this.d = ic0Var;
        ic0Var.getEditText().setInputType(49152);
        this.d.getEditText().setImeOptions(5);
        this.d.setHint(LocaleController.getString(R.string.FirstName));
        if (this.G != null) {
            this.d.getEditText().setText(this.G);
            this.G = null;
        }
        frameLayout.addView(this.d, h7.z5.d(-1, 58.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final oj0 f39382b;

            {
                this.f39382b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                switch (i10) {
                    case 0:
                        if (i13 != 5) {
                            return false;
                        }
                        oj0 oj0Var = this.f39382b;
                        oj0Var.K.requestFocus();
                        mj0 mj0Var = oj0Var.K;
                        mj0Var.setSelection(mj0Var.length());
                        return true;
                    case 1:
                        oj0 oj0Var2 = this.f39382b;
                        if (i13 != 5) {
                            oj0Var2.getClass();
                            return false;
                        }
                        oj0Var2.f41122e.requestFocus();
                        oj0Var2.f41122e.getEditText().setSelection(oj0Var2.f41122e.getEditText().length());
                        return true;
                    case 2:
                        if (i13 != 5) {
                            return false;
                        }
                        oj0 oj0Var3 = this.f39382b;
                        oj0Var3.K.requestFocus();
                        mj0 mj0Var2 = oj0Var3.K;
                        mj0Var2.setSelection(mj0Var2.length());
                        return true;
                    case 3:
                        if (i13 != 5) {
                            return false;
                        }
                        oj0 oj0Var4 = this.f39382b;
                        oj0Var4.M.requestFocus();
                        mj0 mj0Var3 = oj0Var4.M;
                        mj0Var3.setSelection(mj0Var3.length());
                        return true;
                    default:
                        oj0 oj0Var5 = this.f39382b;
                        if (i13 == 5) {
                            oj0Var5.V.callOnClick();
                            return true;
                        }
                        oj0Var5.getClass();
                        return false;
                }
            }
        });
        org.telegram.ui.Components.ic0 ic0Var2 = new org.telegram.ui.Components.ic0(context2);
        this.f41122e = ic0Var2;
        ic0Var2.setBackground(null);
        this.f41122e.getEditText().setInputType(49152);
        this.f41122e.getEditText().setImeOptions(5);
        this.f41122e.setHint(LocaleController.getString(R.string.LastName));
        if (this.H != null) {
            this.f41122e.getEditText().setText(this.H);
            this.H = null;
        }
        frameLayout.addView(this.f41122e, h7.z5.d(-1, 58.0f, 51, 0.0f, 68.0f, 0.0f, 0.0f));
        final int i13 = 2;
        this.f41122e.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final oj0 f39382b;

            {
                this.f39382b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                switch (i13) {
                    case 0:
                        if (i14 != 5) {
                            return false;
                        }
                        oj0 oj0Var = this.f39382b;
                        oj0Var.K.requestFocus();
                        mj0 mj0Var = oj0Var.K;
                        mj0Var.setSelection(mj0Var.length());
                        return true;
                    case 1:
                        oj0 oj0Var2 = this.f39382b;
                        if (i14 != 5) {
                            oj0Var2.getClass();
                            return false;
                        }
                        oj0Var2.f41122e.requestFocus();
                        oj0Var2.f41122e.getEditText().setSelection(oj0Var2.f41122e.getEditText().length());
                        return true;
                    case 2:
                        if (i14 != 5) {
                            return false;
                        }
                        oj0 oj0Var3 = this.f39382b;
                        oj0Var3.K.requestFocus();
                        mj0 mj0Var2 = oj0Var3.K;
                        mj0Var2.setSelection(mj0Var2.length());
                        return true;
                    case 3:
                        if (i14 != 5) {
                            return false;
                        }
                        oj0 oj0Var4 = this.f39382b;
                        oj0Var4.M.requestFocus();
                        mj0 mj0Var3 = oj0Var4.M;
                        mj0Var3.setSelection(mj0Var3.length());
                        return true;
                    default:
                        oj0 oj0Var5 = this.f39382b;
                        if (i14 == 5) {
                            oj0Var5.V.callOnClick();
                            return true;
                        }
                        oj0Var5.getClass();
                        return false;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context2, null);
        this.f41126s = jc0Var;
        jc0Var.addView(linearLayout2, h7.z5.d(-1, -2.0f, 16, 4.0f, 8.0f, 16.0f, 8.0f));
        this.f41126s.setText(LocaleController.getString(R.string.PhoneNumber));
        this.f41120b.addView(this.f41126s, h7.z5.k(0.0f, 12.0f, 0.0f, 6.0f, -1, 58));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context2, null);
        this.v = p80Var;
        p80Var.setTextSize(1, 12.0f);
        this.v.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
        this.v.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.gc));
        this.f41120b.addView(this.v, h7.z5.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        lj0 lj0Var = new lj0(context2);
        this.S = lj0Var;
        lj0Var.setTextSize(1, 16.0f);
        this.S.setFocusable(false);
        this.S.setGravity(17);
        final int i14 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {

            public final oj0 f39118b;

            {
                this.f39118b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        oj0 oj0Var = this.f39118b;
                        oj0Var.dismiss();
                        t9.e0(LaunchActivity.C1, 1, new nj0(oj0Var));
                        break;
                    case 1:
                        oj0 oj0Var2 = this.f39118b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = oj0Var2.I;
                        if (!oj0Var2.D && n2Var2 != null && n2Var2.getParentActivity() != null) {
                            if (oj0Var2.d.getEditText().length() == 0) {
                                Vibrator vibrator = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.d);
                            } else if (oj0Var2.K.length() == 0) {
                                Vibrator vibrator2 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.K);
                            } else if (oj0Var2.M.length() == 0) {
                                Vibrator vibrator3 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.M);
                            } else if (!oj0Var2.O.f27188a.f26309q) {
                                oj0Var2.s();
                            } else {
                                org.telegram.ui.Components.pd0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new x3(oj0Var2, 11));
                            }
                            break;
                        }
                        break;
                    case 2:
                        tt ttVar = new tt(null, true);
                        oj0 oj0Var3 = this.f39118b;
                        ttVar.f43010r = new g(oj0Var3, 27);
                        oj0Var3.I.showAsSheet(ttVar);
                        break;
                    default:
                        oj0 oj0Var4 = this.f39118b;
                        org.telegram.ui.Components.bp bpVar = oj0Var4.O;
                        bpVar.a(!bpVar.f27188a.f26309q, true);
                        oj0Var4.y(true);
                        break;
                }
            }
        });
        int iDp = AndroidUtilities.dp(6.0f);
        int i15 = org.telegram.ui.ActionBar.g6.f23144i6;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i15, false);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, iW0, iW0));
        frameLayout2.addView(this.S, h7.z5.e(-1, -2, 16));
        linearLayout2.addView(frameLayout2, h7.z5.n(42, -1));
        TextView textView = new TextView(context2);
        this.W = textView;
        textView.setText("+");
        this.W.setTextSize(1, 16.0f);
        this.W.setFocusable(false);
        linearLayout2.addView(this.W, h7.z5.n(-2, -2));
        mj0 mj0Var = new mj0(this, context2, 0);
        this.K = mj0Var;
        int i16 = org.telegram.ui.ActionBar.g6.G6;
        mj0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.K.setInputType(3);
        this.K.setCursorSize(AndroidUtilities.dp(20.0f));
        this.K.setCursorWidth(1.5f);
        this.K.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        this.K.setTextSize(1, 16.0f);
        this.K.setMaxLines(1);
        this.K.setGravity(19);
        this.K.setImeOptions(268435461);
        this.K.setBackground(null);
        this.K.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(this.K, h7.z5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        this.K.addTextChangedListener(new p0(this, 11));
        final int i17 = 3;
        this.K.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final oj0 f39382b;

            {
                this.f39382b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView2, int i18, KeyEvent keyEvent) {
                switch (i17) {
                    case 0:
                        if (i18 != 5) {
                            return false;
                        }
                        oj0 oj0Var = this.f39382b;
                        oj0Var.K.requestFocus();
                        mj0 mj0Var2 = oj0Var.K;
                        mj0Var2.setSelection(mj0Var2.length());
                        return true;
                    case 1:
                        oj0 oj0Var2 = this.f39382b;
                        if (i18 != 5) {
                            oj0Var2.getClass();
                            return false;
                        }
                        oj0Var2.f41122e.requestFocus();
                        oj0Var2.f41122e.getEditText().setSelection(oj0Var2.f41122e.getEditText().length());
                        return true;
                    case 2:
                        if (i18 != 5) {
                            return false;
                        }
                        oj0 oj0Var3 = this.f39382b;
                        oj0Var3.K.requestFocus();
                        mj0 mj0Var3 = oj0Var3.K;
                        mj0Var3.setSelection(mj0Var3.length());
                        return true;
                    case 3:
                        if (i18 != 5) {
                            return false;
                        }
                        oj0 oj0Var4 = this.f39382b;
                        oj0Var4.M.requestFocus();
                        mj0 mj0Var4 = oj0Var4.M;
                        mj0Var4.setSelection(mj0Var4.length());
                        return true;
                    default:
                        oj0 oj0Var5 = this.f39382b;
                        if (i18 == 5) {
                            oj0Var5.V.callOnClick();
                            return true;
                        }
                        oj0Var5.getClass();
                        return false;
                }
            }
        });
        this.L = new View(context2);
        LinearLayout.LayoutParams layoutParamsK = h7.z5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        layoutParamsK.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(this.L, layoutParamsK);
        mj0 mj0Var2 = new mj0(this, context2, 1);
        this.M = mj0Var2;
        mj0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.M.setInputType(3);
        this.M.setPadding(0, 0, 0, 0);
        this.M.setCursorSize(AndroidUtilities.dp(20.0f));
        this.M.setCursorWidth(1.5f);
        this.M.setTextSize(1, 16.0f);
        this.M.setMaxLines(1);
        this.M.setGravity(19);
        this.M.setImeOptions(268435461);
        this.M.setBackground(null);
        this.M.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(this.M, h7.z5.n(-1, 36));
        this.M.addTextChangedListener(new tr(this, 2));
        this.M.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final oj0 f39382b;

            {
                this.f39382b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView2, int i18, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i18 != 5) {
                            return false;
                        }
                        oj0 oj0Var = this.f39382b;
                        oj0Var.K.requestFocus();
                        mj0 mj0Var3 = oj0Var.K;
                        mj0Var3.setSelection(mj0Var3.length());
                        return true;
                    case 1:
                        oj0 oj0Var2 = this.f39382b;
                        if (i18 != 5) {
                            oj0Var2.getClass();
                            return false;
                        }
                        oj0Var2.f41122e.requestFocus();
                        oj0Var2.f41122e.getEditText().setSelection(oj0Var2.f41122e.getEditText().length());
                        return true;
                    case 2:
                        if (i18 != 5) {
                            return false;
                        }
                        oj0 oj0Var3 = this.f39382b;
                        oj0Var3.K.requestFocus();
                        mj0 mj0Var4 = oj0Var3.K;
                        mj0Var4.setSelection(mj0Var4.length());
                        return true;
                    case 3:
                        if (i18 != 5) {
                            return false;
                        }
                        oj0 oj0Var4 = this.f39382b;
                        oj0Var4.M.requestFocus();
                        mj0 mj0Var5 = oj0Var4.M;
                        mj0Var5.setSelection(mj0Var5.length());
                        return true;
                    default:
                        oj0 oj0Var5 = this.f39382b;
                        if (i18 == 5) {
                            oj0Var5.V.callOnClick();
                            return true;
                        }
                        oj0Var5.getClass();
                        return false;
                }
            }
        });
        ImageView imageView = new ImageView(context2);
        this.N = imageView;
        imageView.setScaleX(0.5f);
        this.N.setScaleY(0.5f);
        this.N.setAlpha(0.0f);
        this.f41126s.addView(this.N, h7.z5.d(24, 24.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context2, 21, this.resourcesProvider);
        this.O = bpVar;
        bpVar.b(org.telegram.ui.ActionBar.g6.f23126h7, org.telegram.ui.ActionBar.g6.f23163j7, org.telegram.ui.ActionBar.g6.f23182k7);
        this.O.setDrawUnchecked(true);
        this.O.a(false, false);
        this.O.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context2);
        this.P = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, this.resourcesProvider));
        this.P.setTextSize(1, 14.0f);
        this.P.setText(LocaleController.getString(R.string.AddContactSync));
        LinearLayout linearLayout3 = new LinearLayout(context2);
        this.Q = linearLayout3;
        linearLayout3.setOrientation(0);
        this.Q.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        this.Q.addView(this.O, h7.z5.t(21, 21, 16, 0, 0, 9, 0));
        this.Q.addView(this.P, h7.z5.q(-2, -2, 16));
        final int i18 = 3;
        this.Q.setOnClickListener(new View.OnClickListener(this) {

            public final oj0 f39118b;

            {
                this.f39118b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        oj0 oj0Var = this.f39118b;
                        oj0Var.dismiss();
                        t9.e0(LaunchActivity.C1, 1, new nj0(oj0Var));
                        break;
                    case 1:
                        oj0 oj0Var2 = this.f39118b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = oj0Var2.I;
                        if (!oj0Var2.D && n2Var2 != null && n2Var2.getParentActivity() != null) {
                            if (oj0Var2.d.getEditText().length() == 0) {
                                Vibrator vibrator = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.d);
                            } else if (oj0Var2.K.length() == 0) {
                                Vibrator vibrator2 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.K);
                            } else if (oj0Var2.M.length() == 0) {
                                Vibrator vibrator3 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.M);
                            } else if (!oj0Var2.O.f27188a.f26309q) {
                                oj0Var2.s();
                            } else {
                                org.telegram.ui.Components.pd0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new x3(oj0Var2, 11));
                            }
                            break;
                        }
                        break;
                    case 2:
                        tt ttVar = new tt(null, true);
                        oj0 oj0Var3 = this.f39118b;
                        ttVar.f43010r = new g(oj0Var3, 27);
                        oj0Var3.I.showAsSheet(ttVar);
                        break;
                    default:
                        oj0 oj0Var4 = this.f39118b;
                        org.telegram.ui.Components.bp bpVar2 = oj0Var4.O;
                        bpVar2.a(!bpVar2.f27188a.f26309q, true);
                        oj0Var4.y(true);
                        break;
                }
            }
        });
        this.Q.setTranslationY(AndroidUtilities.dp(-21.33f));
        this.Q.setPivotX(0.0f);
        h7.b6.b(this.Q, 0.0125f, 1.2f);
        this.Q.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(i15, this.resourcesProvider), 6, 6));
        this.f41120b.addView(this.Q, h7.z5.k(0.0f, 5.0f, 0.0f, 0.0f, -2, -2));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f41123f = frameLayout3;
        frameLayout3.setTranslationY(AndroidUtilities.dp(-10.665f));
        this.f41120b.addView(this.f41123f, h7.z5.k(0.0f, 6.0f, 0.0f, -6.0f, -1, -2));
        View view = new View(context2);
        this.h = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, this.resourcesProvider));
        this.f41123f.addView(this.h, h7.z5.d(-1, 1.0f / AndroidUtilities.density, 48, 0.0f, 6.0f, 0.0f, 0.0f));
        lh.d dVar = new lh.d(context2, this.resourcesProvider, false);
        this.f41124n = dVar;
        dVar.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("QR");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(R.drawable.header_qr_24, 0), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AddContactQr));
        this.f41124n.g(spannableStringBuilder, false, true);
        this.f41124n.setOnClickListener(new View.OnClickListener(this) {

            public final oj0 f39118b;

            {
                this.f39118b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        oj0 oj0Var = this.f39118b;
                        oj0Var.dismiss();
                        t9.e0(LaunchActivity.C1, 1, new nj0(oj0Var));
                        break;
                    case 1:
                        oj0 oj0Var2 = this.f39118b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = oj0Var2.I;
                        if (!oj0Var2.D && n2Var2 != null && n2Var2.getParentActivity() != null) {
                            if (oj0Var2.d.getEditText().length() == 0) {
                                Vibrator vibrator = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.d);
                            } else if (oj0Var2.K.length() == 0) {
                                Vibrator vibrator2 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.K);
                            } else if (oj0Var2.M.length() == 0) {
                                Vibrator vibrator3 = (Vibrator) n2Var2.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.M);
                            } else if (!oj0Var2.O.f27188a.f26309q) {
                                oj0Var2.s();
                            } else {
                                org.telegram.ui.Components.pd0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new x3(oj0Var2, 11));
                            }
                            break;
                        }
                        break;
                    case 2:
                        tt ttVar = new tt(null, true);
                        oj0 oj0Var3 = this.f39118b;
                        ttVar.f43010r = new g(oj0Var3, 27);
                        oj0Var3.I.showAsSheet(ttVar);
                        break;
                    default:
                        oj0 oj0Var4 = this.f39118b;
                        org.telegram.ui.Components.bp bpVar2 = oj0Var4.O;
                        bpVar2.a(!bpVar2.f27188a.f26309q, true);
                        oj0Var4.y(true);
                        break;
                }
            }
        });
        this.f41123f.addView(this.f41124n, h7.z5.d(-1, 48.0f, 48, 0.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ic0 ic0Var3 = new org.telegram.ui.Components.ic0(context2);
        this.f41125r = ic0Var3;
        ic0Var3.setBackground(null);
        this.f41125r.getEditText().setInputType(49152);
        this.f41125r.getEditText().setImeOptions(5);
        this.f41125r.setHint("Notes");
        this.f41123f.addView(this.f41125r, h7.z5.d(-1, 58.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f41125r.getEditText().setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final oj0 f39382b;

            {
                this.f39382b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i19, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i19 != 5) {
                            return false;
                        }
                        oj0 oj0Var = this.f39382b;
                        oj0Var.K.requestFocus();
                        mj0 mj0Var3 = oj0Var.K;
                        mj0Var3.setSelection(mj0Var3.length());
                        return true;
                    case 1:
                        oj0 oj0Var2 = this.f39382b;
                        if (i19 != 5) {
                            oj0Var2.getClass();
                            return false;
                        }
                        oj0Var2.f41122e.requestFocus();
                        oj0Var2.f41122e.getEditText().setSelection(oj0Var2.f41122e.getEditText().length());
                        return true;
                    case 2:
                        if (i19 != 5) {
                            return false;
                        }
                        oj0 oj0Var3 = this.f39382b;
                        oj0Var3.K.requestFocus();
                        mj0 mj0Var4 = oj0Var3.K;
                        mj0Var4.setSelection(mj0Var4.length());
                        return true;
                    case 3:
                        if (i19 != 5) {
                            return false;
                        }
                        oj0 oj0Var4 = this.f39382b;
                        oj0Var4.M.requestFocus();
                        mj0 mj0Var5 = oj0Var4.M;
                        mj0Var5.setSelection(mj0Var5.length());
                        return true;
                    default:
                        oj0 oj0Var5 = this.f39382b;
                        if (i19 == 5) {
                            oj0Var5.V.callOnClick();
                            return true;
                        }
                        oj0Var5.getClass();
                        return false;
                }
            }
        });
        y(false);
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                nt ntVar2 = new nt();
                ntVar2.f40915a = strArrSplit[2];
                ntVar2.f40917c = strArrSplit[0];
                ntVar2.d = strArrSplit[1];
                this.f41127w.add(0, ntVar2);
                List list = (List) this.f41128x.get(strArrSplit[0]);
                if (list == null) {
                    HashMap map2 = this.f41128x;
                    String str2 = strArrSplit[0];
                    ArrayList arrayList = new ArrayList();
                    map2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(ntVar2);
                if (strArrSplit.length > 3) {
                    this.f41129y.put(strArrSplit[0], Collections.singletonList(strArrSplit[3]));
                }
                map.put(strArrSplit[1], strArrSplit[2]);
            }
            bufferedReader.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        Collections.sort(this.f41127w, Comparator$CC.comparing(new l8(7)));
        if (TextUtils.isEmpty(this.E)) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                upperCase = telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase() : null;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (upperCase != null && (str = (String) map.get(upperCase)) != null) {
                int i19 = 0;
                while (true) {
                    if (i19 >= this.f41127w.size()) {
                        ntVar = null;
                        break;
                    } else {
                        if (Objects.equals(((nt) this.f41127w.get(i19)).f40915a, str)) {
                            ntVar = (nt) this.f41127w.get(i19);
                            break;
                        }
                        i19++;
                    }
                }
                if (ntVar != null) {
                    this.K.setText(ntVar.f40917c);
                }
            }
            if (this.K.length() == 0) {
                this.M.setHintText((String) null);
            }
        } else {
            TLRPC.User currentUser = this.I.getUserConfig().getCurrentUser();
            if (this.E.startsWith("+")) {
                this.K.setText(this.E.substring(1));
            } else if (this.F || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
                this.K.setText(this.E);
            } else {
                String str3 = currentUser.phone;
                while (i11 >= 1) {
                    String strSubstring = str3.substring(0, i11);
                    if (((List) this.f41128x.get(strSubstring)) != null) {
                        this.K.setText(strSubstring);
                        break;
                    }
                    i11--;
                }
                this.M.setText(this.E);
            }
            this.E = null;
        }
        this.V = new FrameLayout(getContext());
        TextView textView3 = new TextView(context2);
        this.T = textView3;
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        this.T.setGravity(17);
        this.T.setLines(1);
        this.T.setSingleLine(true);
        this.T.setText(LocaleController.getString(R.string.CreateContact));
        TextView textView4 = this.T;
        org.telegram.ui.ActionBar.n2 n2Var2 = this.I;
        int i20 = org.telegram.ui.ActionBar.g6.Sh;
        textView4.setTextColor(n2Var2.getThemedColor(i20));
        this.T.setTextSize(1, 15.0f);
        this.T.setTypeface(AndroidUtilities.bold());
        h7.b6.b(this.V, 0.02f, 1.2f);
        RadialProgressView radialProgressView = new RadialProgressView(context2, null);
        this.U = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.U.setProgressColor(this.I.getThemedColor(i20));
        this.V.addView(this.T, h7.z5.c(-1.0f, -1));
        this.V.addView(this.U, h7.z5.e(40, 40, 17));
        this.f41120b.addView(this.V, h7.z5.t(-1, 48, 0, 0, 8, 0, 4));
        AndroidUtilities.updateViewVisibilityAnimated(this.T, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.U, false, 1.0f, false);
        this.V.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{24.0f}, this.I.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)));
        this.V.setOnClickListener(new View.OnClickListener(this) {

            public final oj0 f39118b;

            {
                this.f39118b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        oj0 oj0Var = this.f39118b;
                        oj0Var.dismiss();
                        t9.e0(LaunchActivity.C1, 1, new nj0(oj0Var));
                        break;
                    case 1:
                        oj0 oj0Var2 = this.f39118b;
                        org.telegram.ui.ActionBar.n2 n2Var3 = oj0Var2.I;
                        if (!oj0Var2.D && n2Var3 != null && n2Var3.getParentActivity() != null) {
                            if (oj0Var2.d.getEditText().length() == 0) {
                                Vibrator vibrator = (Vibrator) n2Var3.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.d);
                            } else if (oj0Var2.K.length() == 0) {
                                Vibrator vibrator2 = (Vibrator) n2Var3.getParentActivity().getSystemService("vibrator");
                                if (vibrator2 != null) {
                                    vibrator2.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.K);
                            } else if (oj0Var2.M.length() == 0) {
                                Vibrator vibrator3 = (Vibrator) n2Var3.getParentActivity().getSystemService("vibrator");
                                if (vibrator3 != null) {
                                    vibrator3.vibrate(200L);
                                }
                                AndroidUtilities.shakeView(oj0Var2.M);
                            } else if (!oj0Var2.O.f27188a.f26309q) {
                                oj0Var2.s();
                            } else {
                                org.telegram.ui.Components.pd0.e(R.raw.permission_request_contacts, R.string.PermissionNoContactsSaving, new String[]{"android.permission.WRITE_CONTACTS"}, new String[]{"android.permission.WRITE_CONTACTS"}, new x3(oj0Var2, 11));
                            }
                            break;
                        }
                        break;
                    case 2:
                        tt ttVar = new tt(null, true);
                        oj0 oj0Var3 = this.f39118b;
                        ttVar.f43010r = new g(oj0Var3, 27);
                        oj0Var3.I.showAsSheet(ttVar);
                        break;
                    default:
                        oj0 oj0Var4 = this.f39118b;
                        org.telegram.ui.Components.bp bpVar2 = oj0Var4.O;
                        bpVar2.a(!bpVar2.f27188a.f26309q, true);
                        oj0Var4.y(true);
                        break;
                }
            }
        });
        this.W.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.L.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181k6, false));
        setCustomView(scrollView);
        setTitle(LocaleController.getString(R.string.NewContactTitle), true);
    }

    public static void m(oj0 oj0Var, TLObject tLObject, ib0 ib0Var) {
        TLRPC.User user;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            MessagesController.getInstance(oj0Var.currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
            MessagesController.getInstance(oj0Var.currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
            long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
            if (peerDialogId >= 0) {
                user = MessagesController.getInstance(oj0Var.currentAccount).getUser(Long.valueOf(peerDialogId));
            } else {
                user = null;
            }
        } else {
            user = null;
        }
        ib0Var.run(user);
    }

    public static void n(oj0 oj0Var, TLRPC.TL_contacts_importedContacts tL_contacts_importedContacts, TLRPC.TL_inputPhoneContact tL_inputPhoneContact, TLRPC.TL_error tL_error, TLRPC.TL_contacts_importContacts tL_contacts_importContacts) {
        org.telegram.ui.ActionBar.n2 n2Var = oj0Var.I;
        oj0Var.D = false;
        if (tL_contacts_importedContacts == null) {
            AndroidUtilities.updateViewVisibilityAnimated(oj0Var.T, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(oj0Var.U, false, 0.5f, true);
            org.telegram.ui.Components.y4.f0(oj0Var.currentAccount, tL_error, n2Var, tL_contacts_importContacts, new Object[0]);
        } else if (!tL_contacts_importedContacts.users.isEmpty()) {
            MessagesController.getInstance(oj0Var.currentAccount).putUsers(tL_contacts_importedContacts.users, false);
            MessagesController.getInstance(oj0Var.currentAccount).openChatOrProfileWith(tL_contacts_importedContacts.users.get(0), null, oj0Var.I, 1, false);
            oj0Var.dismiss();
        } else {
            if (n2Var.getParentActivity() == null) {
                return;
            }
            AndroidUtilities.updateViewVisibilityAnimated(oj0Var.T, true, 0.5f, true);
            AndroidUtilities.updateViewVisibilityAnimated(oj0Var.U, false, 0.5f, true);
            org.telegram.ui.Components.y4.v(n2Var, tL_inputPhoneContact.first_name, tL_inputPhoneContact.last_name, tL_inputPhoneContact.phone);
        }
    }

    public static void r(oj0 oj0Var) {
        String strReplaceAll = (oj0Var.K.getText().toString() + oj0Var.M.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int iMin = Math.min(3, strReplaceAll.length()); iMin >= 0; iMin--) {
            String strSubstring = strReplaceAll.substring(0, iMin);
            List list = (List) oj0Var.f41128x.get(strSubstring);
            if (list == null || list.isEmpty()) {
                if (z10) {
                    break;
                }
            } else {
                List list2 = (List) oj0Var.f41129y.get(strSubstring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (strReplaceAll.length() - iMin >= ((String) it.next()).replace(" ", "").length()) {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        break;
                        break;
                    }
                }
            }
        }
        if (z10) {
            if (TextUtils.equals(oj0Var.X, strReplaceAll)) {
                return;
            }
            oj0Var.X = strReplaceAll;
            oj0Var.z(strReplaceAll);
            return;
        }
        if (TextUtils.isEmpty(oj0Var.X)) {
            return;
        }
        oj0Var.X = null;
        oj0Var.z(null);
    }

    public static String t(LaunchActivity launchActivity, TLRPC.User user, String str) {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(launchActivity.getResources().getAssets().open("countries.txt")));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split(";");
                map.put(strArrSplit[0], strArrSplit[2]);
            }
            bufferedReader.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (!str.startsWith("+")) {
            if (user == null || TextUtils.isEmpty(user.phone)) {
                return "+".concat(str);
            }
            String str2 = user.phone;
            for (int i10 = 4; i10 >= 1; i10--) {
                String strSubstring = str2.substring(0, i10);
                if (((String) map.get(strSubstring)) != null) {
                    return a9.p.m("+", strSubstring, str);
                }
            }
        }
        return str;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        AndroidUtilities.runOnUIThread(new hj0(this, 0), 50L);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 8388608, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23181k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.f23198l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41122e, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41122e, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41122e, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41122e, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41121c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41121c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.E7));
        return arrayList;
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.C) {
            this.C = false;
            return;
        }
        this.A = true;
        this.K.setText(((nt) this.f41127w.get(i10)).f40917c);
        this.A = false;
    }

    public final void s() {
        this.D = true;
        AndroidUtilities.updateViewVisibilityAnimated(this.T, false, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.U, true, 0.5f, true);
        String str = "+" + this.K.getText().toString() + this.M.getText().toString();
        String string = this.d.getEditText().getText().toString();
        String string2 = this.f41122e.getEditText().getText().toString();
        String string3 = this.f41125r.getVisibility() == 0 ? this.f41125r.getEditText().getText().toString() : "";
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = string;
        tL_inputPhoneContact.last_name = string2;
        tL_inputPhoneContact.phone = str;
        if (!TextUtils.isEmpty(string3)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = string3;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_importContacts, new z9(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.J);
        if (this.O.f27188a.f26309q) {
            Context context = getContext();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            ContentProviderOperation.Builder builderNewInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
            builderNewInsert.withValue("account_type", null);
            builderNewInsert.withValue("account_name", null);
            arrayList.add(builderNewInsert.build());
            Uri uri = ContactsContract.Data.CONTENT_URI;
            ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
            if (!TextUtils.isEmpty(string)) {
                builderWithValue = builderWithValue.withValue("data2", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                builderWithValue = builderWithValue.withValue("data2", string2);
            }
            arrayList.add(builderWithValue.build());
            if (str != null && !str.isEmpty()) {
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str).withValue("data2", 2).build());
            }
            try {
                context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            } catch (OperationApplicationException | RemoteException e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        this.d.getEditText().requestFocus();
        this.d.getEditText().setSelection(this.d.getEditText().length());
        AndroidUtilities.runOnUIThread(new hj0(this, 1), 50L);
    }

    public final void u(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.S.animate();
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
            viewPropertyAnimatorAnimate.setInterpolator(erVar).translationY(AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.W.animate().setInterpolator(erVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            this.K.animate().setInterpolator(erVar).translationX(-AndroidUtilities.dp(30.0f)).setDuration(150L);
            return;
        }
        this.S.animate().setInterpolator(AndroidUtilities.overshootInterpolator).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = this.W.animate();
        org.telegram.ui.Components.er erVar2 = org.telegram.ui.Components.er.f28122f;
        viewPropertyAnimatorAnimate2.setInterpolator(erVar2).translationX(0.0f).setDuration(150L);
        this.K.animate().setInterpolator(erVar2).translationX(0.0f).setDuration(150L);
        this.S.setText(charSequence);
    }

    public final void v(String str, nt ntVar) {
        int i10;
        int i11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(ntVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag);
        }
        u(Emoji.replaceEmoji(spannableStringBuilder, this.S.getPaint().getFontMetricsInt(), false));
        this.R = -1;
        String strReplace = this.M.getText() != null ? this.M.getText().toString().replace(" ", "") : "";
        HashMap map = this.f41129y;
        if (map.get(str) == null || ((List) map.get(str)).isEmpty()) {
            if (this.R != -1) {
                int selectionStart = this.M.getSelectionStart();
                int selectionEnd = this.M.getSelectionEnd();
                this.M.setHintText((String) null);
                this.M.setSelection(selectionStart, selectionEnd);
                this.R = -1;
                return;
            }
            return;
        }
        List list = (List) map.get(str);
        if (strReplace.isEmpty()) {
            i10 = -1;
            break;
        }
        i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                i10 = -1;
                break;
            } else if (strReplace.startsWith(((String) list.get(i10)).replace(" ", "").replace("X", "").replace("0", ""))) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                String str2 = (String) list.get(i12);
                if (str2.startsWith("X") || str2.startsWith("0")) {
                    i10 = i12;
                    break;
                }
            }
            i11 = i10 != -1 ? i10 : 0;
        }
        if (this.R != i11) {
            String str3 = (String) ((List) map.get(str)).get(i11);
            int selectionStart2 = this.M.getSelectionStart();
            int selectionEnd2 = this.M.getSelectionEnd();
            this.M.setHintText(str3 != null ? str3.replace('X', '0') : null);
            this.M.setSelection(selectionStart2, selectionEnd2);
            this.R = i11;
        }
    }

    public final void w(String str, boolean z10) {
        this.E = str;
        this.F = z10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        if (this.E.startsWith("+")) {
            this.K.setText(this.E.substring(1));
        } else if (this.F || currentUser == null || TextUtils.isEmpty(currentUser.phone)) {
            this.K.setText(this.E);
        } else {
            String str2 = currentUser.phone;
            int i10 = 4;
            while (true) {
                if (i10 < 1) {
                    if (Build.VERSION.SDK_INT < 23) {
                        break;
                    }
                    Context context = ApplicationLoader.applicationContext;
                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                    this.K.setText(upperCase);
                    if (!upperCase.endsWith("0") || !this.E.startsWith("0")) {
                        break;
                        break;
                    } else {
                        this.E = this.E.substring(1);
                        break;
                    }
                }
                List list = (List) this.f41128x.get(str2.substring(0, i10));
                if (list != null && list.size() > 0) {
                    String str3 = ((nt) list.get(0)).f40917c;
                    this.K.setText(str3);
                    if (!str3.endsWith("0") || !this.E.startsWith("0")) {
                        break;
                        break;
                    } else {
                        this.E = this.E.substring(1);
                        break;
                    }
                }
                i10--;
            }
            this.M.setText(this.E);
        }
        this.E = null;
    }

    public final void x(boolean z10) {
        ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.Q.animate().translationY(z10 ? -AndroidUtilities.dp(21.33f) : 0.0f);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        org.telegram.messenger.rl.o(viewPropertyAnimatorTranslationY, erVar, 420L);
        this.f41123f.animate().translationY(z10 ? -AndroidUtilities.dp(10.665f) : 0.0f).setInterpolator(erVar).setDuration(420L).start();
    }

    public final void y(boolean z10) {
        boolean z11 = this.O.f27188a.f26309q;
        final boolean z12 = !z11;
        if (!z10) {
            this.f41124n.animate().cancel();
            this.f41124n.setVisibility(!z11 ? 0 : 4);
            this.f41124n.setAlpha(!z11 ? 1.0f : 0.0f);
            this.h.animate().cancel();
            this.h.setVisibility(!z11 ? 0 : 8);
            this.h.setAlpha(!z11 ? 1.0f : 0.0f);
            this.f41125r.animate().cancel();
            this.f41125r.setVisibility(z11 ? 0 : 4);
            this.f41125r.setAlpha(z11 ? 1.0f : 0.0f);
            return;
        }
        this.f41124n.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.f41124n.animate().alpha(!z11 ? 1.0f : 0.0f);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        final int i10 = 0;
        viewPropertyAnimatorAlpha.setInterpolator(erVar).setDuration(420L).withEndAction(new Runnable(this) {

            public final oj0 f39788b;

            {
                this.f39788b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z13 = z12;
                        oj0 oj0Var = this.f39788b;
                        if (!z13) {
                            oj0Var.f41124n.setVisibility(4);
                        } else {
                            oj0Var.getClass();
                        }
                        break;
                    case 1:
                        boolean z14 = z12;
                        oj0 oj0Var2 = this.f39788b;
                        if (!z14) {
                            oj0Var2.h.setVisibility(4);
                        } else {
                            oj0Var2.getClass();
                        }
                        break;
                    default:
                        boolean z15 = z12;
                        oj0 oj0Var3 = this.f39788b;
                        if (!z15) {
                            oj0Var3.getClass();
                        } else {
                            oj0Var3.f41125r.setVisibility(4);
                        }
                        break;
                }
            }
        }).start();
        this.h.setVisibility(0);
        final int i11 = 1;
        this.h.animate().alpha(!z11 ? 1.0f : 0.0f).setInterpolator(erVar).setDuration(420L).withEndAction(new Runnable(this) {

            public final oj0 f39788b;

            {
                this.f39788b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z13 = z12;
                        oj0 oj0Var = this.f39788b;
                        if (!z13) {
                            oj0Var.f41124n.setVisibility(4);
                        } else {
                            oj0Var.getClass();
                        }
                        break;
                    case 1:
                        boolean z14 = z12;
                        oj0 oj0Var2 = this.f39788b;
                        if (!z14) {
                            oj0Var2.h.setVisibility(4);
                        } else {
                            oj0Var2.getClass();
                        }
                        break;
                    default:
                        boolean z15 = z12;
                        oj0 oj0Var3 = this.f39788b;
                        if (!z15) {
                            oj0Var3.getClass();
                        } else {
                            oj0Var3.f41125r.setVisibility(4);
                        }
                        break;
                }
            }
        }).start();
        this.f41125r.setVisibility(0);
        final int i12 = 2;
        this.f41125r.animate().alpha(z11 ? 1.0f : 0.0f).setInterpolator(erVar).setDuration(420L).withEndAction(new Runnable(this) {

            public final oj0 f39788b;

            {
                this.f39788b = this;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        boolean z13 = z12;
                        oj0 oj0Var = this.f39788b;
                        if (!z13) {
                            oj0Var.f41124n.setVisibility(4);
                        } else {
                            oj0Var.getClass();
                        }
                        break;
                    case 1:
                        boolean z14 = z12;
                        oj0 oj0Var2 = this.f39788b;
                        if (!z14) {
                            oj0Var2.h.setVisibility(4);
                        } else {
                            oj0Var2.getClass();
                        }
                        break;
                    default:
                        boolean z15 = z12;
                        oj0 oj0Var3 = this.f39788b;
                        if (!z15) {
                            oj0Var3.getClass();
                        } else {
                            oj0Var3.f41125r.setVisibility(4);
                        }
                        break;
                }
            }
        }).start();
    }

    public final void z(String str) {
        if (this.Y >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Y, true);
            this.Y = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.rl.o(this.N.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.er.h, 420L);
            this.v.setText("");
            x(true);
            return;
        }
        org.telegram.messenger.rl.o(this.N.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.er.h, 420L);
        this.N.setImageDrawable(new org.telegram.ui.Components.hp(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f23214m5)));
        this.v.setText("");
        x(true);
        ib0 ib0Var = new ib0(3, this, str);
        TLRPC.TL_contact tL_contact = ContactsController.getInstance(this.currentAccount).contactsByPhone.get(oe.b.d(str, false));
        if (tL_contact == null) {
            TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
            tL_contacts_resolvePhone.phone = oe.b.d(str, false);
            this.Y = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_contacts_resolvePhone, new v80(10, this, ib0Var));
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                ib0Var.run(user);
            } else {
                MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new bf0((Object) this, (Object) tL_contact, (Object) ib0Var, 6));
            }
        }
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
