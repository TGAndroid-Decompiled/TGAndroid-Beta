package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
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
public class r90 extends LinearLayout {
    public o90 E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public final float[] I;
    public String J;
    public boolean K;
    public String L;
    public final TextView f32168a;
    public String f32169b;
    public final org.telegram.ui.ActionBar.r2 f32170c;
    public final ImageView d;
    public final TextView e;
    public final TextView f32171f;
    public final TextView h;
    public final FrameLayout f32172n;
    public q90 f32173r;
    public org.telegram.ui.ActionBar.o1 f32174s;
    public final bi.t1 v;
    public int f32175w;
    public boolean f32176x;
    public boolean f32177y;

    public r90(Context context, final org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.k3 k3Var, boolean z10, boolean z11) {
        super(context);
        this.G = true;
        this.I = new float[2];
        this.f32170c = r2Var;
        this.f32176x = z10;
        this.H = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32172n = frameLayout;
        TextView textView = new TextView(context);
        this.f32168a = textView;
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
        frameLayout.addView(imageView, gb1.i(40, 48, 21));
        addView(frameLayout, gb1.x(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        gb1.c(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new zq(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(LocaleController.getString(R.string.LinkActionCopy));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setSingleLine(true);
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView2, gb1.t(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f32171f = e;
        gb1.c(e, 0.025f, 1.2f);
        e.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new zq(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
        e.setText(spannableStringBuilder2);
        e.setContentDescription(LocaleController.getString(R.string.LinkActionShare));
        e.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        e.setTextSize(1, 14.0f);
        e.setTypeface(AndroidUtilities.bold());
        e.setSingleLine(true);
        TextView e10 = org.telegram.messenger.vh.e(linearLayout, e, gb1.q(1.0f, 0, 42, 4, 4, 0), context);
        this.h = e10;
        gb1.c(e10, 0.025f, 1.2f);
        e10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new zq(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        e10.setText(spannableStringBuilder3);
        e10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        e10.setTextSize(1, 14.0f);
        e10.setTypeface(AndroidUtilities.bold());
        e10.setSingleLine(true);
        linearLayout.addView(e10, gb1.q(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        e10.setVisibility(8);
        addView(linearLayout, gb1.o(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        bi.t1 t1Var = new bi.t1(this, context);
        this.v = t1Var;
        ((p90) t1Var.f5438c).setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(t1Var, gb1.o(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new bi.w0(this, k3Var, r2Var, 26));
        if (z10) {
            t1Var.setOnClickListener(new k90(this, 0));
        }
        e.setOnClickListener(new View.OnClickListener(this) {
            public final r90 f30130b;

            {
                this.f30130b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        r90 r90Var = this.f30130b;
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        try {
                            if (r90Var.f32169b != null) {
                                Context context2 = r90Var.getContext();
                                String str = r90Var.f32169b;
                                r2Var2.showDialog(new m90(r90Var, context2, str, str, r2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var3.getParentActivity());
                        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j90(this.f30130b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        r2Var3.showDialog(alertDialog$Builder.f22366a);
                        return;
                }
            }
        });
        e10.setOnClickListener(new View.OnClickListener(this) {
            public final r90 f30130b;

            {
                this.f30130b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        r90 r90Var = this.f30130b;
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        try {
                            if (r90Var.f32169b != null) {
                                Context context2 = r90Var.getContext();
                                String str = r90Var.f32169b;
                                r2Var2.showDialog(new m90(r90Var, context2, str, str, r2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r2Var3.getParentActivity());
                        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j90(this.f30130b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        r2Var3.showDialog(alertDialog$Builder.f22366a);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new di.c4(this, context, k3Var, r2Var, 13));
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

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j10) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
        } else if (!TextUtils.equals(this.L, tL_chatInviteExported.link)) {
            d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
            if (tL_chatInviteExported.usage > 0 && tL_chatInviteExported.importers == null && !this.f32177y) {
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                String str = tL_chatInviteExported.link;
                if (str != null) {
                    tL_messages_getChatInviteImporters.flags |= 2;
                    tL_messages_getChatInviteImporters.link = str;
                }
                tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-j10);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.f32177y = true;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.z7(19, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i10, ArrayList arrayList, boolean z10) {
        this.f32175w = i10;
        bi.t1 t1Var = this.v;
        if (i10 == 0) {
            t1Var.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            t1Var.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            ((TextView) t1Var.f5437b).setText(LocaleController.formatPluralString("PeopleJoined", i10, new Object[0]));
            t1Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser((TLRPC.User) arrayList.get(i11), false);
            }
            int min = Math.min(3, Math.min(i10, arrayList.size()));
            ((p90) t1Var.f5438c).setCount(min);
            for (int i12 = 0; i12 < min; i12++) {
                ((p90) t1Var.f5438c).b(i12, (TLObject) arrayList.get(i12), UserConfig.selectedAccount);
            }
        } else {
            ((p90) t1Var.f5438c).setCount(0);
        }
        ((p90) t1Var.f5438c).a(z10);
    }

    public void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        qc R = wc.b0(this.f32170c).R(i10, 36, spannableStringBuilder);
        R.f31896s = false;
        R.k(true);
    }

    public final void f() {
        boolean z10 = this.K;
        ImageView imageView = this.d;
        TextView textView = this.f32168a;
        FrameLayout frameLayout = this.f32172n;
        TextView textView2 = this.h;
        TextView textView3 = this.f32171f;
        TextView textView4 = this.e;
        bi.t1 t1Var = this.v;
        if (z10) {
            org.telegram.ui.ActionBar.f7.c0(textView4);
            org.telegram.ui.ActionBar.f7.c0(textView3);
            org.telegram.ui.ActionBar.f7.c0(textView2);
            org.telegram.ui.ActionBar.f7.c0(frameLayout);
            org.telegram.ui.ActionBar.f7.c0(textView);
            org.telegram.ui.ActionBar.f7.c0(imageView);
            org.telegram.ui.ActionBar.f7.c0((TextView) t1Var.f5437b);
            org.telegram.ui.ActionBar.f7.c0(t1Var);
            o90 o90Var = this.E;
            if (o90Var != null) {
                o90Var.updateColors();
                return;
            }
            return;
        }
        this.K = true;
        int i10 = org.telegram.ui.ActionBar.y6.Sh;
        org.telegram.ui.ActionBar.f7.V(textView4, i10, null);
        org.telegram.ui.ActionBar.f7.V(textView3, i10, null);
        org.telegram.ui.ActionBar.f7.V(textView2, i10, null);
        int dp = AndroidUtilities.dp(21.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.y6.Qh;
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
        org.telegram.ui.ActionBar.f7.R(textView4, org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, x02, x03, x03), org.telegram.ui.ActionBar.f7.N(i11), org.telegram.ui.ActionBar.f7.N(i12), null);
        int dp2 = AndroidUtilities.dp(21.0f);
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        int x05 = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
        org.telegram.ui.ActionBar.f7.R(textView3, org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, x04, x05, x05), org.telegram.ui.ActionBar.f7.N(i11), org.telegram.ui.ActionBar.f7.N(i12), null);
        int dp3 = AndroidUtilities.dp(21.0f);
        int i13 = org.telegram.ui.ActionBar.y6.f23486ka;
        int x06 = org.telegram.ui.ActionBar.y6.x0(null, i13, false);
        int i14 = org.telegram.ui.ActionBar.y6.f23354d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i14, false), 120);
        org.telegram.ui.ActionBar.f7.R(textView2, org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, x06, o10, o10), org.telegram.ui.ActionBar.f7.N(i13), org.telegram.ui.ActionBar.f7.h(i14, 120), null);
        int dp4 = AndroidUtilities.dp(21.0f);
        int i15 = org.telegram.ui.ActionBar.y6.f23374e7;
        int x07 = org.telegram.ui.ActionBar.y6.x0(null, i15, false);
        int i16 = org.telegram.ui.ActionBar.y6.f23446i6;
        int o11 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i16, false), 76);
        org.telegram.ui.ActionBar.f7.R(frameLayout, org.telegram.ui.ActionBar.y6.j0(dp4, dp4, dp4, dp4, x07, o11, o11), org.telegram.ui.ActionBar.f7.N(i15), org.telegram.ui.ActionBar.f7.h(i16, 76), null);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23612r5, null, PorterDuff.Mode.SRC_ATOP);
        int i17 = org.telegram.ui.ActionBar.y6.f23538n6;
        org.telegram.ui.ActionBar.f7.V((TextView) t1Var.f5437b, i17, null);
        int dp5 = AndroidUtilities.dp(6.0f);
        int o12 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i17, false), 76);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp5, dp5, dp5, dp5, 0, o12, o12);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i17, 76);
        t1Var.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(t1Var, j02, null, h, null);
        o90 o90Var2 = this.E;
        if (o90Var2 != null) {
            o90Var2.updateColors();
        }
    }

    public void setCanEdit(boolean z10) {
        this.G = z10;
    }

    public void setDelegate(q90 q90Var) {
        this.f32173r = q90Var;
    }

    public void setLink(String str) {
        this.f32169b = str;
        TextView textView = this.f32168a;
        if (str == null) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.f32176x = z10;
    }

    public void setQrText(String str) {
        this.J = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.e;
        TextView textView3 = this.f32171f;
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
