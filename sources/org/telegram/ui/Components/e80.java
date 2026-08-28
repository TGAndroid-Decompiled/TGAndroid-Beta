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
public class e80 extends LinearLayout {
    public b80 A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final float[] E;
    public String F;
    public String G;
    public final TextView f27967a;
    public String f27968b;
    public final org.telegram.ui.ActionBar.o2 f27969c;
    public final ImageView d;
    public final TextView f27970e;
    public final TextView f27971f;
    public final TextView h;
    public final FrameLayout f27972n;
    public d80 f27973r;
    public org.telegram.ui.ActionBar.o1 f27974s;
    public final gh.h1 v;
    public int f27975w;
    public boolean f27976x;
    public boolean f27977y;

    public e80(Context context, final org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, boolean z11) {
        super(context);
        this.C = true;
        this.E = new float[2];
        this.f27969c = o2Var;
        this.f27976x = z10;
        this.D = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27972n = frameLayout;
        TextView textView = new TextView(context);
        this.f27967a = textView;
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
        frameLayout.addView(imageView, g7.e6.e(40, 48, 21));
        addView(frameLayout, g7.e6.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.f27970e = textView2;
        g7.g6.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new eq(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(LocaleController.getString(R.string.LinkActionCopy));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setSingleLine(true);
        TextView h = j3.r0.h(linearLayout, textView2, g7.e6.p(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f27971f = h;
        g7.g6.b(h, 0.025f, 1.2f);
        h.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new eq(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
        h.setText(spannableStringBuilder2);
        h.setContentDescription(LocaleController.getString(R.string.LinkActionShare));
        h.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        h.setTextSize(1, 14.0f);
        h.setTypeface(AndroidUtilities.bold());
        h.setSingleLine(true);
        TextView h10 = j3.r0.h(linearLayout, h, g7.e6.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = h10;
        g7.g6.b(h10, 0.025f, 1.2f);
        h10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new eq(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        h10.setText(spannableStringBuilder3);
        h10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        h10.setTextSize(1, 14.0f);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setSingleLine(true);
        linearLayout.addView(h10, g7.e6.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        h10.setVisibility(8);
        addView(linearLayout, g7.e6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        gh.h1 h1Var = new gh.h1(this, context);
        this.v = h1Var;
        ((c80) h1Var.f8193c).setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(h1Var, g7.e6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new fg.f(this, f3Var, o2Var, 28));
        if (z10) {
            h1Var.setOnClickListener(new x70(this, 0));
        }
        h.setOnClickListener(new View.OnClickListener(this) {
            public final e80 f34881b;

            {
                this.f34881b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e80 e80Var = this.f34881b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        try {
                            if (e80Var.f27968b != null) {
                                Context context2 = e80Var.getContext();
                                String str = e80Var.f27968b;
                                o2Var2.showDialog(new z70(e80Var, context2, str, str, o2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var3.getParentActivity());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new w70(this.f34881b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        o2Var3.showDialog(alertDialog$Builder.f22702a);
                        return;
                }
            }
        });
        h10.setOnClickListener(new View.OnClickListener(this) {
            public final e80 f34881b;

            {
                this.f34881b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        e80 e80Var = this.f34881b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        try {
                            if (e80Var.f27968b != null) {
                                Context context2 = e80Var.getContext();
                                String str = e80Var.f27968b;
                                o2Var2.showDialog(new z70(e80Var, context2, str, str, o2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var3.getParentActivity());
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new w70(this.f34881b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        o2Var3.showDialog(alertDialog$Builder.f22702a);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new fh.g4(this, context, f3Var, o2Var, 14));
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
            boolean z10 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z10) {
                return;
            }
        }
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
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
        } else if (!TextUtils.equals(this.G, tL_chatInviteExported.link)) {
            d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
            if (tL_chatInviteExported.usage > 0 && tL_chatInviteExported.importers == null && !this.f27977y) {
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                String str = tL_chatInviteExported.link;
                if (str != null) {
                    tL_messages_getChatInviteImporters.flags |= 2;
                    tL_messages_getChatInviteImporters.link = str;
                }
                tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-j10);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.f27977y = true;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.rc(18, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i9, ArrayList arrayList, boolean z10) {
        this.f27975w = i9;
        gh.h1 h1Var = this.v;
        if (i9 == 0) {
            h1Var.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            h1Var.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            ((TextView) h1Var.f8192b).setText(LocaleController.formatPluralString("PeopleJoined", i9, new Object[0]));
            h1Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser((TLRPC.User) arrayList.get(i10), false);
            }
            int min = Math.min(3, Math.min(i9, arrayList.size()));
            ((c80) h1Var.f8193c).setCount(min);
            for (int i11 = 0; i11 < min; i11++) {
                ((c80) h1Var.f8193c).b(i11, (TLObject) arrayList.get(i11), UserConfig.selectedAccount);
            }
        } else {
            ((c80) h1Var.f8193c).setCount(0);
        }
        ((c80) h1Var.f8193c).a(z10);
    }

    public void e(int i9, SpannableStringBuilder spannableStringBuilder) {
        gc Q = oc.a0(this.f27969c).Q(i9, 36, spannableStringBuilder);
        Q.f28745r = false;
        Q.k(true);
    }

    public final void f() {
        int i9 = org.telegram.ui.ActionBar.f6.Sh;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        TextView textView = this.f27970e;
        textView.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        TextView textView2 = this.f27971f;
        textView2.setTextColor(w03);
        int w04 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        TextView textView3 = this.h;
        textView3.setTextColor(w04);
        int dp = AndroidUtilities.dp(21.0f);
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        int w05 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.f6.Qh;
        int w06 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        textView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, w05, w06, w06));
        int dp2 = AndroidUtilities.dp(21.0f);
        int w07 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        int w08 = org.telegram.ui.ActionBar.f6.w0(null, i11, false);
        textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, w07, w08, w08));
        int dp3 = AndroidUtilities.dp(21.0f);
        int w09 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ka, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.f6.i0(dp3, dp3, dp3, dp3, w09, k10, k10));
        int dp4 = AndroidUtilities.dp(21.0f);
        int w010 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23020e7, false);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), 76);
        this.f27972n.setBackground(org.telegram.ui.ActionBar.f6.i0(dp4, dp4, dp4, dp4, w010, k11, k11));
        this.f27967a.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        this.d.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23247r5, false));
        gh.h1 h1Var = this.v;
        int i12 = org.telegram.ui.ActionBar.f6.f23179n6;
        ((TextView) h1Var.f8192b).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        int dp5 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i12, false), 76);
        h1Var.setBackground(org.telegram.ui.ActionBar.f6.i0(dp5, dp5, dp5, dp5, 0, k12, k12));
        b80 b80Var = this.A;
        if (b80Var != null) {
            b80Var.n();
        }
    }

    public void setCanEdit(boolean z10) {
        this.C = z10;
    }

    public void setDelegate(d80 d80Var) {
        this.f27973r = d80Var;
    }

    public void setLink(String str) {
        this.f27968b = str;
        TextView textView = this.f27967a;
        if (str == null) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.f27976x = z10;
    }

    public void setQrText(String str) {
        this.F = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.f27970e;
        TextView textView3 = this.f27971f;
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
