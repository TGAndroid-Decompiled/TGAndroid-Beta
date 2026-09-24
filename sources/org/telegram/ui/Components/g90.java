package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class g90 extends LinearLayout {
    public d90 E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public final float[] I;
    public String J;
    public String K;
    public final TextView f24388a;
    public String f24389b;
    public final org.telegram.ui.ActionBar.m2 f24390c;
    public final ImageView d;
    public final TextView e;
    public final TextView f24391f;
    public final TextView h;
    public final FrameLayout f24392n;
    public f90 f24393r;
    public org.telegram.ui.ActionBar.m1 f24394s;
    public final ai.w7 v;
    public int f24395w;
    public boolean f24396x;
    public boolean f24397y;

    public g90(Context context, final org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, boolean z11) {
        super(context);
        this.G = true;
        this.I = new float[2];
        this.f24390c = m2Var;
        this.f24396x = z10;
        this.H = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f24392n = frameLayout;
        TextView textView = new TextView(context);
        this.f24388a = textView;
        textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, w7.y5.e(40, 48, 21));
        addView(frameLayout, w7.y5.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        w7.a6.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new pq(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(LocaleController.getString(R.string.LinkActionCopy));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setSingleLine(true);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView2, w7.y5.p(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f24391f = h;
        w7.a6.b(h, 0.025f, 1.2f);
        h.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new pq(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
        h.setText(spannableStringBuilder2);
        h.setContentDescription(LocaleController.getString(R.string.LinkActionShare));
        h.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        h.setTextSize(1, 14.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setSingleLine(true);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(linearLayout, h, w7.y5.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = h10;
        w7.a6.b(h10, 0.025f, 1.2f);
        h10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new pq(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.q2(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        h10.setText(spannableStringBuilder3);
        h10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        h10.setTextSize(1, 14.0f);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setSingleLine(true);
        linearLayout.addView(h10, w7.y5.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        h10.setVisibility(8);
        addView(linearLayout, w7.y5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        ai.w7 w7Var = new ai.w7(this, context);
        this.v = w7Var;
        ((e90) w7Var.f1658c).setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(w7Var, w7.y5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new ai.d0(this, e3Var, m2Var));
        if (z10) {
            w7Var.setOnClickListener(new z80(this, 0));
        }
        h.setOnClickListener(new View.OnClickListener(this) {
            public final g90 f22622b;

            {
                this.f22622b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g90 g90Var = this.f22622b;
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        try {
                            if (g90Var.f24389b != null) {
                                Context context2 = g90Var.getContext();
                                String str = g90Var.f24389b;
                                m2Var2.showDialog(new b90(g90Var, context2, str, str, m2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var3.getParentActivity());
                        alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y80(this.f22622b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        m2Var3.showDialog(alertDialog$Builder.f18647a);
                        return;
                }
            }
        });
        h10.setOnClickListener(new View.OnClickListener(this) {
            public final g90 f22622b;

            {
                this.f22622b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        g90 g90Var = this.f22622b;
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        try {
                            if (g90Var.f24389b != null) {
                                Context context2 = g90Var.getContext();
                                String str = g90Var.f24389b;
                                m2Var2.showDialog(new b90(g90Var, context2, str, str, m2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var3.getParentActivity());
                        alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f18647a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new y80(this.f22622b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        m2Var3.showDialog(alertDialog$Builder.f18647a);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new ai.o5(this, context, e3Var, m2Var, 13));
        frameLayout.setOnClickListener(new androidx.mediarouter.app.x(this, 10));
        f();
    }

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f7 = 0.0f;
        float f10 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y3 = frameLayout3.getY() + f7;
            f10 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y3 -= frameLayout3.getScrollY();
            }
            f7 = y3;
            if (!(frameLayout3.getParent() instanceof View)) {
                break;
            }
            ?? r32 = (View) frameLayout3.getParent();
            boolean z10 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z10) {
                return;
            }
        }
        fArr[0] = f10 - frameLayout2.getPaddingLeft();
        fArr[1] = f7 - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ab_other));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j3) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
        } else if (!TextUtils.equals(this.K, tL_chatInviteExported.link)) {
            d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
            if (tL_chatInviteExported.usage > 0 && tL_chatInviteExported.importers == null && !this.f24397y) {
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                String str = tL_chatInviteExported.link;
                if (str != null) {
                    tL_messages_getChatInviteImporters.flags |= 2;
                    tL_messages_getChatInviteImporters.link = str;
                }
                tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-j3);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.f24397y = true;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.lo(11, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i10, ArrayList arrayList, boolean z10) {
        this.f24395w = i10;
        ai.w7 w7Var = this.v;
        if (i10 == 0) {
            w7Var.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            w7Var.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            ((TextView) w7Var.f1657b).setText(LocaleController.formatPluralString("PeopleJoined", i10, new Object[0]));
            w7Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser((TLRPC.User) arrayList.get(i11), false);
            }
            int min = Math.min(3, Math.min(i10, arrayList.size()));
            ((e90) w7Var.f1658c).setCount(min);
            for (int i12 = 0; i12 < min; i12++) {
                ((e90) w7Var.f1658c).b(i12, (TLObject) arrayList.get(i12), UserConfig.selectedAccount);
            }
        } else {
            ((e90) w7Var.f1658c).setCount(0);
        }
        ((e90) w7Var.f1658c).a(z10);
    }

    public void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        qc Q = yc.a0(this.f24390c).Q(i10, 36, spannableStringBuilder);
        Q.f27579r = false;
        Q.k(true);
    }

    public final void f() {
        int i10 = org.telegram.ui.ActionBar.h6.Sh;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        TextView textView = this.e;
        textView.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        TextView textView2 = this.f24391f;
        textView2.setTextColor(w03);
        int w04 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        TextView textView3 = this.h;
        textView3.setTextColor(w04);
        int dp = AndroidUtilities.dp(21.0f);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int w05 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.h6.Qh;
        int w06 = org.telegram.ui.ActionBar.h6.w0(null, i12, false);
        textView.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, w05, w06, w06));
        int dp2 = AndroidUtilities.dp(21.0f);
        int w07 = org.telegram.ui.ActionBar.h6.w0(null, i11, false);
        int w08 = org.telegram.ui.ActionBar.h6.w0(null, i12, false);
        textView2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp2, dp2, dp2, dp2, w07, w08, w08));
        int dp3 = AndroidUtilities.dp(21.0f);
        int w09 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19176ka, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.h6.i0(dp3, dp3, dp3, dp3, w09, k10, k10));
        int dp4 = AndroidUtilities.dp(21.0f);
        int w010 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.e7, false);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19134i6, false), 76);
        this.f24392n.setBackground(org.telegram.ui.ActionBar.h6.i0(dp4, dp4, dp4, dp4, w010, k11, k11));
        this.f24388a.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.d.setColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19301r5, false));
        ai.w7 w7Var = this.v;
        int i13 = org.telegram.ui.ActionBar.h6.f19229n6;
        ((TextView) w7Var.f1657b).setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        int dp5 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i13, false), 76);
        w7Var.setBackground(org.telegram.ui.ActionBar.h6.i0(dp5, dp5, dp5, dp5, 0, k12, k12));
        d90 d90Var = this.E;
        if (d90Var != null) {
            d90Var.n();
        }
    }

    public void setCanEdit(boolean z10) {
        this.G = z10;
    }

    public void setDelegate(f90 f90Var) {
        this.f24393r = f90Var;
    }

    public void setLink(String str) {
        this.f24389b = str;
        TextView textView = this.f24388a;
        if (str == null) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.f24396x = z10;
    }

    public void setQrText(String str) {
        this.J = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.e;
        TextView textView3 = this.f24391f;
        ImageView imageView = this.d;
        if (z10) {
            imageView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(0);
            return;
        }
        imageView.setVisibility(0);
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        textView.setVisibility(8);
    }
}
