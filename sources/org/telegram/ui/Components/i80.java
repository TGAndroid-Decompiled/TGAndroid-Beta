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

public class i80 extends LinearLayout {
    public f80 A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final float[] E;
    public String F;
    public String G;

    public final TextView f29269a;

    public String f29270b;

    public final org.telegram.ui.ActionBar.n2 f29271c;
    public final ImageView d;

    public final TextView f29272e;

    public final TextView f29273f;
    public final TextView h;

    public final FrameLayout f29274n;

    public h80 f29275r;

    public org.telegram.ui.ActionBar.n1 f29276s;
    public final hh.h1 v;

    public int f29277w;

    public boolean f29278x;

    public boolean f29279y;

    public i80(Context context, final org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, boolean z11) {
        super(context);
        this.C = true;
        this.E = new float[2];
        this.f29271c = n2Var;
        this.f29278x = z10;
        this.D = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29274n = frameLayout;
        TextView textView = new TextView(context);
        this.f29269a = textView;
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
        frameLayout.addView(imageView, h7.z5.e(40, 48, 21));
        addView(frameLayout, h7.z5.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.f29272e = textView2;
        h7.b6.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new cq(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(LocaleController.getString(R.string.LinkActionCopy));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setSingleLine(true);
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView2, h7.z5.p(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f29273f = textViewI;
        h7.b6.b(textViewI, 0.025f, 1.2f);
        textViewI.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new cq(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
        textViewI.setText(spannableStringBuilder2);
        textViewI.setContentDescription(LocaleController.getString(R.string.LinkActionShare));
        textViewI.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textViewI.setTextSize(1, 14.0f);
        textViewI.setTypeface(AndroidUtilities.bold());
        textViewI.setSingleLine(true);
        TextView textViewI2 = org.telegram.ui.Cells.pa.i(linearLayout, textViewI, h7.z5.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = textViewI2;
        h7.b6.b(textViewI2, 0.025f, 1.2f);
        textViewI2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new cq(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        textViewI2.setText(spannableStringBuilder3);
        textViewI2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textViewI2.setTextSize(1, 14.0f);
        textViewI2.setTypeface(AndroidUtilities.bold());
        textViewI2.setSingleLine(true);
        linearLayout.addView(textViewI2, h7.z5.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        textViewI2.setVisibility(8);
        addView(linearLayout, h7.z5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        hh.h1 h1Var = new hh.h1(this, context);
        this.v = h1Var;
        ((g80) h1Var.f9371c).setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(h1Var, h7.z5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new gg.f(this, e3Var, n2Var, 28));
        if (z10) {
            h1Var.setOnClickListener(new b80(this, 0));
        }
        final int i10 = 0;
        textViewI.setOnClickListener(new View.OnClickListener(this) {

            public final i80 f27374b;

            {
                this.f27374b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i80 i80Var = this.f27374b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        try {
                            if (i80Var.f29270b != null) {
                                Context context2 = i80Var.getContext();
                                String str = i80Var.f29270b;
                                n2Var2.showDialog(new d80(i80Var, context2, str, str, n2Var2.getResourceProvider()));
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var3.getParentActivity());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a80(this.f27374b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        n2Var3.showDialog(alertDialog$Builder.f22702a);
                        break;
                }
            }
        });
        final int i11 = 1;
        textViewI2.setOnClickListener(new View.OnClickListener(this) {

            public final i80 f27374b;

            {
                this.f27374b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        i80 i80Var = this.f27374b;
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        try {
                            if (i80Var.f29270b != null) {
                                Context context2 = i80Var.getContext();
                                String str = i80Var.f29270b;
                                n2Var2.showDialog(new d80(i80Var, context2, str, str, n2Var2.getResourceProvider()));
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var3.getParentActivity());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a80(this.f27374b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        n2Var3.showDialog(alertDialog$Builder.f22702a);
                        break;
                }
            }
        });
        imageView.setOnClickListener(new gh.a4(this, context, e3Var, n2Var, 14));
        frameLayout.setOnClickListener(new g.a(this, 5));
        f();
    }

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float x8 = 0.0f;
        while (frameLayout != frameLayout2) {
            float y10 = frameLayout.getY() + f10;
            x8 += frameLayout.getX();
            if (frameLayout instanceof ScrollView) {
                y10 -= frameLayout.getScrollY();
            }
            f10 = y10;
            if (!(frameLayout.getParent() instanceof View)) {
                break;
            }
            frameLayout = (View) frameLayout.getParent();
            if (!(frameLayout instanceof ViewGroup)) {
                return;
            }
        }
        float paddingLeft = x8 - frameLayout2.getPaddingLeft();
        float paddingTop = f10 - frameLayout2.getPaddingTop();
        fArr[0] = paddingLeft;
        fArr[1] = paddingTop;
    }

    public final void b(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ab_other));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j10) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
            return;
        }
        if (TextUtils.equals(this.G, tL_chatInviteExported.link)) {
            return;
        }
        d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
        if (tL_chatInviteExported.usage <= 0 || tL_chatInviteExported.importers != null || this.f29279y) {
            return;
        }
        TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
        String str = tL_chatInviteExported.link;
        if (str != null) {
            tL_messages_getChatInviteImporters.flags |= 2;
            tL_messages_getChatInviteImporters.link = str;
        }
        tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-j10);
        tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
        tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
        this.f29279y = true;
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.gg(15, this, tL_chatInviteExported));
    }

    public final void d(int i10, ArrayList arrayList, boolean z10) {
        this.f29277w = i10;
        hh.h1 h1Var = this.v;
        if (i10 == 0) {
            h1Var.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            h1Var.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            ((TextView) h1Var.f9370b).setText(LocaleController.formatPluralString("PeopleJoined", i10, new Object[0]));
            h1Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser((TLRPC.User) arrayList.get(i11), false);
            }
            int iMin = Math.min(3, Math.min(i10, arrayList.size()));
            ((g80) h1Var.f9371c).setCount(iMin);
            for (int i12 = 0; i12 < iMin; i12++) {
                ((g80) h1Var.f9371c).b(i12, (TLObject) arrayList.get(i12), UserConfig.selectedAccount);
            }
        } else {
            ((g80) h1Var.f9371c).setCount(0);
        }
        ((g80) h1Var.f9371c).a(z10);
    }

    public void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        ec ecVarQ = mc.a0(this.f29271c).Q(i10, 36, spannableStringBuilder);
        ecVarQ.f28028r = false;
        ecVarQ.k(true);
    }

    public final void f() {
        int i10 = org.telegram.ui.ActionBar.g6.Sh;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextView textView = this.f29272e;
        textView.setTextColor(iW0);
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextView textView2 = this.f29273f;
        textView2.setTextColor(iW1);
        int iW2 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextView textView3 = this.h;
        textView3.setTextColor(iW2);
        int iDp = AndroidUtilities.dp(21.0f);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        int iW3 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.Qh;
        int iW4 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iW3, iW4, iW4));
        int iDp2 = AndroidUtilities.dp(21.0f);
        int iW5 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int iW6 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, iW5, iW6, iW6));
        int iDp3 = AndroidUtilities.dp(21.0f);
        int iW7 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23185ka, false);
        int iK = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp3, iDp3, iDp3, iDp3, iW7, iK, iK));
        int iDp4 = AndroidUtilities.dp(21.0f);
        int iW8 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23073e7, false);
        int iK2 = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 76);
        this.f29274n.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp4, iDp4, iDp4, iDp4, iW8, iK2, iK2));
        this.f29269a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.d.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23300r5, false));
        hh.h1 h1Var = this.v;
        TextView textView4 = (TextView) h1Var.f9370b;
        int i13 = org.telegram.ui.ActionBar.g6.f23234n6;
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int iDp5 = AndroidUtilities.dp(6.0f);
        int iK3 = i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 76);
        h1Var.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp5, iDp5, iDp5, iDp5, 0, iK3, iK3));
        f80 f80Var = this.A;
        if (f80Var != null) {
            f80Var.n();
        }
    }

    public void setCanEdit(boolean z10) {
        this.C = z10;
    }

    public void setDelegate(h80 h80Var) {
        this.f29275r = h80Var;
    }

    public void setLink(String str) {
        this.f29270b = str;
        TextView textView = this.f29269a;
        if (str == null) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.f29278x = z10;
    }

    public void setQrText(String str) {
        this.F = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.f29272e;
        TextView textView3 = this.f29273f;
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
