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
public class y80 extends LinearLayout {
    public v80 B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public final float[] F;
    public String G;
    public String H;
    public final TextView f33404a;
    public String f33405b;
    public final org.telegram.ui.ActionBar.p2 f33406c;
    public final ImageView d;
    public final TextView f33407e;
    public final TextView f33408f;
    public final TextView h;
    public final FrameLayout f33409n;
    public x80 f33410r;
    public org.telegram.ui.ActionBar.p1 f33411s;
    public final eg.t3 v;
    public int f33412w;
    public boolean f33413x;
    public boolean f33414y;

    public y80(Context context, final org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.h3 h3Var, boolean z4, boolean z10) {
        super(context);
        this.D = true;
        this.F = new float[2];
        this.f33406c = p2Var;
        this.f33413x = z4;
        this.E = z10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33409n = frameLayout;
        TextView textView = new TextView(context);
        this.f33404a = textView;
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
        frameLayout.addView(imageView, k7.c6.e(40, 48, 21));
        addView(frameLayout, k7.c6.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.f33407e = textView2;
        k7.e6.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new oq(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(LocaleController.getString(R.string.LinkActionCopy));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setSingleLine(true);
        TextView i10 = org.telegram.ui.yh.i(linearLayout, textView2, k7.c6.p(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f33408f = i10;
        k7.e6.b(i10, 0.025f, 1.2f);
        i10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new oq(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
        i10.setText(spannableStringBuilder2);
        i10.setContentDescription(LocaleController.getString(R.string.LinkActionShare));
        i10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        i10.setTextSize(1, 14.0f);
        i10.setTypeface(AndroidUtilities.bold());
        i10.setSingleLine(true);
        TextView i11 = org.telegram.ui.yh.i(linearLayout, i10, k7.c6.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = i11;
        k7.e6.b(i11, 0.025f, 1.2f);
        i11.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new oq(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        i11.setText(spannableStringBuilder3);
        i11.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        i11.setTextSize(1, 14.0f);
        i11.setTypeface(AndroidUtilities.bold());
        i11.setSingleLine(true);
        linearLayout.addView(i11, k7.c6.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        i11.setVisibility(8);
        addView(linearLayout, k7.c6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        eg.t3 t3Var = new eg.t3(this, context);
        this.v = t3Var;
        ((w80) t3Var.d).setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(t3Var, k7.c6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new eg.o(this, h3Var, p2Var, 26));
        if (z4) {
            t3Var.setOnClickListener(new r80(this, 0));
        }
        i10.setOnClickListener(new View.OnClickListener(this) {
            public final y80 f31010b;

            {
                this.f31010b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        y80 y80Var = this.f31010b;
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        try {
                            if (y80Var.f33405b != null) {
                                Context context2 = y80Var.getContext();
                                String str = y80Var.f33405b;
                                p2Var2.showDialog(new t80(y80Var, context2, str, str, p2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var3.getParentActivity());
                        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new q80(this.f31010b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        p2Var3.showDialog(alertDialog$Builder.f21166a);
                        return;
                }
            }
        });
        i11.setOnClickListener(new View.OnClickListener(this) {
            public final y80 f31010b;

            {
                this.f31010b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        y80 y80Var = this.f31010b;
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        try {
                            if (y80Var.f33405b != null) {
                                Context context2 = y80Var.getContext();
                                String str = y80Var.f33405b;
                                p2Var2.showDialog(new t80(y80Var, context2, str, str, p2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var3.getParentActivity());
                        alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new q80(this.f31010b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        p2Var3.showDialog(alertDialog$Builder.f21166a);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new lh.u3(this, context, h3Var, p2Var, 11));
        frameLayout.setOnClickListener(new androidx.mediarouter.app.y(this, 10));
        f();
    }

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y10 = frameLayout3.getY() + f10;
            f11 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y10 -= frameLayout3.getScrollY();
            }
            f10 = y10;
            if (!(frameLayout3.getParent() instanceof View)) {
                break;
            }
            ?? r32 = (View) frameLayout3.getParent();
            boolean z4 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z4) {
                return;
            }
        }
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z4) {
        if (this.C != z4) {
            this.C = z4;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ab_other));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j10) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
        } else if (!TextUtils.equals(this.H, tL_chatInviteExported.link)) {
            d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
            if (tL_chatInviteExported.usage > 0 && tL_chatInviteExported.importers == null && !this.f33414y) {
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                String str = tL_chatInviteExported.link;
                if (str != null) {
                    tL_messages_getChatInviteImporters.flags |= 2;
                    tL_messages_getChatInviteImporters.link = str;
                }
                tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-j10);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.f33414y = true;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.lo(11, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i10, ArrayList arrayList, boolean z4) {
        this.f33412w = i10;
        eg.t3 t3Var = this.v;
        if (i10 == 0) {
            t3Var.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            t3Var.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            ((TextView) t3Var.f5497c).setText(LocaleController.formatPluralString("PeopleJoined", i10, new Object[0]));
            t3Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser((TLRPC.User) arrayList.get(i11), false);
            }
            int min = Math.min(3, Math.min(i10, arrayList.size()));
            ((w80) t3Var.d).setCount(min);
            for (int i12 = 0; i12 < min; i12++) {
                ((w80) t3Var.d).b(i12, (TLObject) arrayList.get(i12), UserConfig.selectedAccount);
            }
        } else {
            ((w80) t3Var.d).setCount(0);
        }
        ((w80) t3Var.d).a(z4);
    }

    public void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        ic Q = qc.a0(this.f33406c).Q(i10, 36, spannableStringBuilder);
        Q.f27753r = false;
        Q.k(true);
    }

    public final void f() {
        int i10 = org.telegram.ui.ActionBar.k6.Sh;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        TextView textView = this.f33407e;
        textView.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        TextView textView2 = this.f33408f;
        textView2.setTextColor(w03);
        int w04 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        TextView textView3 = this.h;
        textView3.setTextColor(w04);
        int dp = AndroidUtilities.dp(21.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        int w05 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.Qh;
        int w06 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
        textView.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, w05, w06, w06));
        int dp2 = AndroidUtilities.dp(21.0f);
        int w07 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
        int w08 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
        textView2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, w07, w08, w08));
        int dp3 = AndroidUtilities.dp(21.0f);
        int w09 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21789ka, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.i0(dp3, dp3, dp3, dp3, w09, k10, k10));
        int dp4 = AndroidUtilities.dp(21.0f);
        int w010 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21678e7, false);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false), 76);
        this.f33409n.setBackground(org.telegram.ui.ActionBar.k6.i0(dp4, dp4, dp4, dp4, w010, k11, k11));
        this.f33404a.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.d.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21911r5, false));
        eg.t3 t3Var = this.v;
        int i13 = org.telegram.ui.ActionBar.k6.f21839n6;
        ((TextView) t3Var.f5497c).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        int dp5 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i13, false), 76);
        t3Var.setBackground(org.telegram.ui.ActionBar.k6.i0(dp5, dp5, dp5, dp5, 0, k12, k12));
        v80 v80Var = this.B;
        if (v80Var != null) {
            v80Var.n();
        }
    }

    public void setCanEdit(boolean z4) {
        this.D = z4;
    }

    public void setDelegate(x80 x80Var) {
        this.f33410r = x80Var;
    }

    public void setLink(String str) {
        this.f33405b = str;
        TextView textView = this.f33404a;
        if (str == null) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z4) {
        this.f33413x = z4;
    }

    public void setQrText(String str) {
        this.G = str;
    }

    public void setRevoke(boolean z4) {
        TextView textView = this.h;
        TextView textView2 = this.f33407e;
        TextView textView3 = this.f33408f;
        ImageView imageView = this.d;
        if (z4) {
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
