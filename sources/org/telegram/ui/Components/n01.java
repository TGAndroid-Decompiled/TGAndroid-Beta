package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
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
import org.telegram.ui.je1;
public final class n01 extends TableLayout {
    public final org.telegram.ui.ActionBar.c6 f27553a;
    public final Path f27554b;
    public final float[] f27555c;
    public final Paint d;
    public final Paint e;
    public final float f27556f;
    public final float h;

    public n01(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f27554b = new Path();
        this.f27555c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f27556f = max;
        this.h = max / 2.0f;
        this.f27553a = c6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final l01 a(CharSequence charSequence) {
        wh.n nVar = new wh.n(getContext());
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27553a;
        nVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        nVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, c6Var));
        nVar.setTextSize(1, 14.0f);
        nVar.setText(Emoji.replaceEmoji(charSequence, nVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        l01 l01Var = new l01(this, nVar, true);
        tableRow.addView(l01Var, layoutParams);
        addView(tableRow);
        return l01Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        a6 a6Var = new a6(getContext());
        a6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.f27553a));
        a6Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        a6Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, a6Var.getPaint().getFontMetricsInt(), false), arrayList, a6Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(a6Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new l01(this, a6Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, m01[] m01VarArr, bd[] bdVarArr) {
        bd bdVar = new bd(getContext());
        bdVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, this.f27553a));
        bdVar.setTextSize(1, 14.0f);
        bdVar.setText(Emoji.replaceEmoji(charSequence2, bdVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(bdVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        m01 m01Var = new m01(this, charSequence);
        if (m01VarArr != null) {
            m01VarArr[0] = m01Var;
        }
        tableRow.addView(m01Var, layoutParams);
        tableRow.addView(new k01(this, bdVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (bdVarArr != null) {
            bdVarArr[0] = bdVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        bd bdVar = new bd(getContext());
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27553a;
        bdVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        bdVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, bdVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.b(str2, runnable, c6Var, num));
        }
        bdVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(bdVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new m01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new k01(this, bdVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j10 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))), null, null);
    }

    public final TableRow g(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.s3 s3Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f27553a;
        bd bdVar = new bd(context, c6Var);
        bdVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        bdVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.g6.f19960gc;
        bdVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        bdVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        bdVar.setTextSize(1, 14.0f);
        bdVar.setSingleLine(true);
        bdVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new wc(3, runnable), 0, spannableStringBuilder.length(), 33);
        bdVar.setText(spannableStringBuilder);
        if (str != null) {
            bdVar.O = new cd(str, s3Var, c6Var);
        }
        return k(bdVar, charSequence);
    }

    public final void h(String str, String str2, Runnable runnable) {
        g(str, str2, runnable, null, null);
    }

    public final TableRow i(CharSequence charSequence, CharSequence charSequence2, int i10, zh.m mVar, String str, je1 je1Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final da0 da0Var = new da0(getContext(), null);
        da0Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        float f7 = i10;
        da0Var.setTextSize(1, f7);
        int i11 = org.telegram.ui.ActionBar.g6.f20007j5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27553a;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        da0Var.setMaxLines(4);
        int i12 = 0;
        da0Var.setSingleLine(false);
        da0Var.setText(charSequence2);
        da0Var.setDisablePaddingsOffsetY(true);
        da0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(da0Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 34.0f, 0.0f, -1, 119));
        if (str != null) {
            cd cdVar = new cd(str, je1Var, c6Var);
            final bd bdVar = new bd(getContext(), c6Var);
            bdVar.setTextSize(1, f7);
            bdVar.setPadding(0, AndroidUtilities.dp(9.33f), 0, AndroidUtilities.dp(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(cdVar, 0, spannableString.length(), 33);
            bdVar.setText(spannableString);
            if (mVar != null) {
                i12 = 34;
            }
            float f10 = i12 + 12.66f;
            ((FrameLayout.LayoutParams) da0Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10) + cdVar.a();
            frameLayout.addView(bdVar, w7.a6.a(-2.0f, 0.0f, 0.0f, f10, 0.0f, -2, 53));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
                    da0 da0Var2 = da0.this;
                    if (da0Var2.getLayout() != null && da0Var2.getLayout().getLineCount() > 0) {
                        int left = da0Var2.getLeft();
                        float lineRight = da0Var2.getLayout().getLineRight(0) + da0Var2.getPaddingLeft() + left + AndroidUtilities.dp(6.0f);
                        bd bdVar2 = bdVar;
                        bdVar2.setTranslationX(Math.min(0.0f, lineRight - bdVar2.getLeft()));
                    }
                }
            });
        }
        if (mVar != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i13 = org.telegram.ui.ActionBar.g6.f20233v6;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i13, c6Var), PorterDuff.Mode.SRC_IN));
            imageView.setOnClickListener(new rt(16, charSequence2, mVar));
            w7.c6.a(imageView);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(i13, c6Var)), 7, -1));
            frameLayout.addView(imageView, w7.a6.e(30, 30, 21));
        }
        return k(frameLayout, charSequence);
    }

    public final void j(String str, CharSequence charSequence, int i10, zh.m mVar) {
        i(str, charSequence, i10, mVar, null, null);
    }

    public final TableRow k(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new m01(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new k01(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow l(CharSequence charSequence, int i10, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f27553a;
        bd bdVar = new bd(context, c6Var);
        bdVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        bdVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        bdVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        bdVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        bdVar.setTextSize(1, 14.0f);
        bdVar.setSingleLine(true);
        bdVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(bdVar, 24.0f, i10);
        int i12 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = k5Var.f37566b;
        if (i12 == 0) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            cr a2 = zh.j7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f24194f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else if (UserObject.isService(j10)) {
            str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
            cr a10 = zh.j7.a(44, "fragment");
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            a10.e = dp3;
            a10.f24194f = dp4;
            imageReceiver.setImageBitmap(a10);
            z11 = true;
            z10 = false;
        } else {
            if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                str2 = UserObject.getUserName(user);
                k5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
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
                k5Var.b(chat);
            }
            str3 = str2;
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new wc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            bdVar.O = new cd(str, runnable2, c6Var);
        }
        bdVar.setText(spannableStringBuilder);
        if (!z10) {
            return k(bdVar, charSequence);
        }
        return null;
    }

    public final void m(String str, int i10, long j10, Runnable runnable) {
        l(str, i10, j10, runnable, null, null);
    }

    public final TableRow n(String str, final int i10, final long j10, Runnable runnable) {
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f27553a;
        final ba0 ba0Var = new ba0(context, c6Var);
        ba0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        ba0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        ba0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        ba0Var.setTextSize(14);
        org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(ba0Var, 24.0f, i10);
        int i12 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = k5Var.f37566b;
        if (i12 == 0) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            cr a2 = zh.j7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f24194f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j10)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                cr a10 = zh.j7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f24194f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else {
                if (j10 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    str2 = UserObject.getUserName(user);
                    k5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    if (chat == null) {
                        str2 = "";
                    } else {
                        str2 = chat.title;
                    }
                    k5Var.b(chat);
                }
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
        if (z10) {
            ba0Var.setClickable(true);
            spannableStringBuilder.setSpan(new wc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        final q5 q5Var = new q5(AndroidUtilities.dp(20.0f), ba0Var);
        q5Var.k(Integer.valueOf(w02));
        q5Var.I = AndroidUtilities.dp(12.0f);
        q5Var.J = 0;
        ba0Var.addOnAttachStateChangeListener(new bi.j2(q5Var, 10));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j01.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        ba0Var.i(q5Var);
        NotificationCenter.getInstance(i10).listen(ba0Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(ba0Var, NotificationCenter.userEmojiStatusUpdated, callback);
        ba0Var.l(spannableStringBuilder, false);
        return k(ba0Var, str);
    }

    public final void o(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        da0 da0Var = new da0(getContext(), null);
        da0Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        da0Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f20007j5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27553a;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, c6Var));
        da0Var.setMaxLines(1);
        da0Var.setSingleLine();
        da0Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        da0Var.setText(spannableStringBuilder);
        da0Var.setDisablePaddingsOffsetY(true);
        da0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(da0Var, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        k(frameLayout, str);
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
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f27556f);
        int i14 = org.telegram.ui.ActionBar.g6.f20149qh;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27553a;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20130ph, c6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z16 = true;
                    if (childAt instanceof m01) {
                        m01 m01Var = (m01) childAt;
                        if (i15 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (m01Var.f27151b != z15 || m01Var.f27152c != z16) {
                            m01Var.f27151b = z15;
                            m01Var.f27152c = z16;
                            m01Var.invalidate();
                        }
                    } else if (childAt instanceof k01) {
                        k01 k01Var = (k01) childAt;
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
                        if (k01Var.f26529b != z12 || k01Var.f26530c != z13) {
                            k01Var.f26529b = z12;
                            k01Var.f26530c = z13;
                            k01Var.invalidate();
                        }
                        if (i16 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (k01Var.d != z14 || k01Var.e != z16) {
                            k01Var.d = z14;
                            k01Var.e = z16;
                            k01Var.invalidate();
                        }
                    } else if (childAt instanceof l01) {
                        l01 l01Var = (l01) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (l01Var.f26903c != z11 || l01Var.d != z16) {
                            l01Var.f26903c = z11;
                            l01Var.d = z16;
                            l01Var.invalidate();
                        }
                    }
                }
            }
        }
    }
}
