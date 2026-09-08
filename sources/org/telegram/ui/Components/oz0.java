package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class oz0 extends TableLayout {
    public final org.telegram.ui.ActionBar.f6 f29269a;
    public final Path f29270b;
    public final float[] f29271c;
    public final Paint d;
    public final Paint f29272e;
    public final float f29273f;
    public final float h;

    public oz0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29270b = new Path();
        this.f29271c = new float[8];
        this.d = new Paint(1);
        this.f29272e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f29273f = max;
        this.h = max / 2.0f;
        this.f29269a = f6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final mz0 a(CharSequence charSequence) {
        wh.p pVar = new wh.p(getContext());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f29269a;
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        pVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        pVar.setTextSize(1, 14.0f);
        pVar.setText(Emoji.replaceEmoji(charSequence, pVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(pVar);
        pVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        mz0 mz0Var = new mz0(this, pVar, true);
        tableRow.addView(mz0Var, layoutParams);
        addView(tableRow);
        return mz0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        y5 y5Var = new y5(getContext());
        y5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f29269a));
        y5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        y5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, y5Var.getPaint().getFontMetricsInt(), false), arrayList, y5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(y5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new mz0(this, y5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, nz0[] nz0VarArr, ad[] adVarArr) {
        d90 d90Var = new d90(getContext(), null);
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f29269a));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setText(Emoji.replaceEmoji(charSequence2, d90Var.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(d90Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        nz0 nz0Var = new nz0(this, charSequence);
        if (nz0VarArr != null) {
            nz0VarArr[0] = nz0Var;
        }
        tableRow.addView(nz0Var, layoutParams);
        tableRow.addView(new lz0(this, d90Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (adVarArr != 0) {
            adVarArr[0] = d90Var;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        d90 d90Var = new d90(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f29269a;
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        d90Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, d90Var.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.b(str2, runnable, f6Var, num));
        }
        d90Var.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(d90Var);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new nz0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new lz0(this, d90Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j3 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f29269a;
        d90 d90Var = new d90(context, f6Var);
        d90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        d90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setSingleLine(true);
        d90Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new vc(3, runnable), 0, spannableStringBuilder.length(), 33);
        d90Var.setText(spannableStringBuilder);
        i(d90Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, zh.q5 q5Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        textView.setTextSize(1, i10);
        int i11 = org.telegram.ui.ActionBar.j6.f20797j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f29269a;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.j6.f21017v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ct(16, charSequence, q5Var));
        w7.z5.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), 7, -1));
        frameLayout.addView(imageView, w7.x5.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new nz0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new lz0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i10, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f29269a;
        ?? d90Var = new d90(context, f6Var);
        d90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        d90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setSingleLine(true);
        d90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(d90Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.f36589b;
        if (j3 == 2666000) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            oq a2 = zh.p7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f29189e = dp;
            a2.f29190f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else {
            if (UserObject.isService(j3)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                oq a10 = zh.p7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.f29189e = dp3;
                a10.f29190f = dp4;
                imageReceiver.setImageBitmap(a10);
                z10 = false;
            } else {
                if (j3 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    if (user == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    str2 = UserObject.getUserName(user);
                    g5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    if (chat == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (chat == null) {
                        str2 = "";
                    } else {
                        str2 = chat.title;
                    }
                    g5Var.b(chat);
                }
                str3 = str2;
            }
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new vc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            d90Var.M = new bd(str, runnable2, f6Var);
        }
        d90Var.setText(spannableStringBuilder);
        if (!z10) {
            return i(d90Var, charSequence);
        }
        return null;
    }

    public final void k(String str, int i10, long j3, Runnable runnable) {
        j(str, i10, j3, runnable, null, null);
    }

    public final TableRow l(String str, final int i10, final long j3, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f29269a;
        final b90 b90Var = new b90(context, f6Var);
        b90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        b90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        b90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        b90Var.setTextSize(14);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(b90Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.f36589b;
        if (j3 == 2666000) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            oq a2 = zh.p7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f29189e = dp;
            a2.f29190f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j3)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                oq a10 = zh.p7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.f29189e = dp3;
                a10.f29190f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else if (j3 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                str2 = UserObject.getUserName(user);
                g5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                if (chat == null) {
                    str2 = "";
                } else {
                    str2 = chat.title;
                }
                g5Var.b(chat);
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z10) {
            b90Var.setClickable(true);
            spannableStringBuilder.setSpan(new vc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        final o5 o5Var = new o5(AndroidUtilities.dp(20.0f), b90Var);
        o5Var.k(Integer.valueOf(v02));
        o5Var.I = AndroidUtilities.dp(12.0f);
        o5Var.J = 0;
        b90Var.addOnAttachStateChangeListener(new bi.i2(o5Var, 9));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r12) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kz0.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        b90Var.i(o5Var);
        NotificationCenter.getInstance(i10).listen(b90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(b90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        b90Var.l(spannableStringBuilder, false);
        return i(b90Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        d90 d90Var = new d90(getContext(), null);
        d90Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        d90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f20797j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f29269a;
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        d90Var.setMaxLines(1);
        d90Var.setSingleLine();
        d90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        d90Var.setText(spannableStringBuilder);
        d90Var.setDisablePaddingsOffsetY(true);
        d90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(d90Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        i(frameLayout, str);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        super.onLayout(z10, i10, i11, i12, i13);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f29272e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f29273f);
        int i14 = org.telegram.ui.ActionBar.j6.f20935qh;
        org.telegram.ui.ActionBar.f6 f6Var = this.f29269a;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20917ph, f6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z16 = true;
                    if (childAt instanceof nz0) {
                        nz0 nz0Var = (nz0) childAt;
                        if (i15 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (nz0Var.f28922b != z15 || nz0Var.f28923c != z16) {
                            nz0Var.f28922b = z15;
                            nz0Var.f28923c = z16;
                            nz0Var.invalidate();
                        }
                    } else if (childAt instanceof lz0) {
                        lz0 lz0Var = (lz0) childAt;
                        if (i15 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i15 == childCount - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (lz0Var.f28348b != z12 || lz0Var.f28349c != z13) {
                            lz0Var.f28348b = z12;
                            lz0Var.f28349c = z13;
                            lz0Var.invalidate();
                        }
                        if (i16 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (lz0Var.d != z14 || lz0Var.f28350e != z16) {
                            lz0Var.d = z14;
                            lz0Var.f28350e = z16;
                            lz0Var.invalidate();
                        }
                    } else if (childAt instanceof mz0) {
                        mz0 mz0Var = (mz0) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (mz0Var.f28604c != z11 || mz0Var.d != z16) {
                            mz0Var.f28604c = z11;
                            mz0Var.d = z16;
                            mz0Var.invalidate();
                        }
                    }
                }
            }
        }
    }
}
