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
public final class j01 extends TableLayout {
    public final org.telegram.ui.ActionBar.d6 f27386a;
    public final Path f27387b;
    public final float[] f27388c;
    public final Paint d;
    public final Paint e;
    public final float f27389f;
    public final float h;

    public j01(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f27387b = new Path();
        this.f27388c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f27389f = max;
        this.h = max / 2.0f;
        this.f27386a = d6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final h01 a(CharSequence charSequence) {
        wh.n nVar = new wh.n(getContext());
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27386a;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        nVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var));
        nVar.setTextSize(1, 14.0f);
        nVar.setText(Emoji.replaceEmoji(charSequence, nVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        h01 h01Var = new h01(this, nVar, true);
        tableRow.addView(h01Var, layoutParams);
        addView(tableRow);
        return h01Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        z5 z5Var = new z5(getContext());
        z5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f27386a));
        z5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        z5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, z5Var.getPaint().getFontMetricsInt(), false), arrayList, z5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(z5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new h01(this, z5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, i01[] i01VarArr, zc[] zcVarArr) {
        zc zcVar = new zc(getContext());
        zcVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f27386a));
        zcVar.setTextSize(1, 14.0f);
        zcVar.setText(Emoji.replaceEmoji(charSequence2, zcVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(zcVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        i01 i01Var = new i01(this, charSequence);
        if (i01VarArr != null) {
            i01VarArr[0] = i01Var;
        }
        tableRow.addView(i01Var, layoutParams);
        tableRow.addView(new g01(this, zcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (zcVarArr != null) {
            zcVarArr[0] = zcVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        zc zcVar = new zc(getContext());
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27386a;
        zcVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        zcVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, zcVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ad.b(str2, runnable, d6Var, num));
        }
        zcVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(zcVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new i01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new g01(this, zcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new i01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new g01(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i10, String str) {
        long j10 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.c4 c4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f27386a;
        zc zcVar = new zc(context, d6Var);
        zcVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        zcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.h6.f21045gc;
        zcVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        zcVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        zcVar.setTextSize(1, 14.0f);
        zcVar.setSingleLine(true);
        zcVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new uc(3, runnable), 0, spannableStringBuilder.length(), 33);
        zcVar.setText(spannableStringBuilder);
        if (str != null) {
            zcVar.O = new ad(str, c4Var, d6Var);
        }
        return l(zcVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i10, ai.oa oaVar, String str, org.telegram.ui.Wallet.b4 b4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final x90 x90Var = new x90(getContext(), null);
        x90Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        float f7 = i10;
        x90Var.setTextSize(1, f7);
        int i11 = org.telegram.ui.ActionBar.h6.f21092j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27386a;
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        x90Var.setMaxLines(4);
        int i12 = 0;
        x90Var.setSingleLine(false);
        x90Var.setText(charSequence2);
        x90Var.setDisablePaddingsOffsetY(true);
        x90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(x90Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 34.0f, 0.0f, -1, 119));
        if (str != null) {
            ad adVar = new ad(str, b4Var, d6Var);
            final zc zcVar = new zc(getContext(), d6Var);
            zcVar.setTextSize(1, f7);
            zcVar.setPadding(0, AndroidUtilities.dp(9.33f), 0, AndroidUtilities.dp(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(adVar, 0, spannableString.length(), 33);
            zcVar.setText(spannableString);
            if (oaVar != null) {
                i12 = 34;
            }
            float f10 = i12 + 12.66f;
            ((FrameLayout.LayoutParams) x90Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10) + adVar.a();
            frameLayout.addView(zcVar, w7.z5.a(-2.0f, 0.0f, 0.0f, f10, 0.0f, -2, 53));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
                    x90 x90Var2 = x90.this;
                    if (x90Var2.getLayout() != null && x90Var2.getLayout().getLineCount() > 0) {
                        int left = x90Var2.getLeft();
                        float lineRight = x90Var2.getLayout().getLineRight(0) + x90Var2.getPaddingLeft() + left + AndroidUtilities.dp(6.0f);
                        zc zcVar2 = zcVar;
                        zcVar2.setTranslationX(Math.min(0.0f, lineRight - zcVar2.getLeft()));
                    }
                }
            });
        }
        if (oaVar != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i13 = org.telegram.ui.ActionBar.h6.f21319v6;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i13, d6Var), PorterDuff.Mode.SRC_IN));
            imageView.setOnClickListener(new ca(26, charSequence2, oaVar));
            w7.b6.a(imageView);
            imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i13, d6Var)), 7, -1));
            frameLayout.addView(imageView, w7.z5.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i10, ai.oa oaVar) {
        j(str, charSequence, i10, oaVar, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new i01(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new g01(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i10, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f27386a;
        zc zcVar = new zc(context, d6Var);
        zcVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        zcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        zcVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        zcVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        zcVar.setTextSize(1, 14.0f);
        zcVar.setSingleLine(true);
        zcVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.l5 l5Var = new org.telegram.ui.l5(zcVar, 24.0f, i10);
        int i12 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = l5Var.f38789b;
        if (i12 == 0) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            zq a2 = ai.gd.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f32995f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else if (UserObject.isService(j10)) {
            str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
            zq a10 = ai.gd.a(44, "fragment");
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            a10.e = dp3;
            a10.f32995f = dp4;
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
                l5Var.e(user);
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
                l5Var.b(chat);
            }
            str3 = str2;
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(l5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new uc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            zcVar.O = new ad(str, runnable2, d6Var);
        }
        zcVar.setText(spannableStringBuilder);
        if (!z10) {
            return l(zcVar, charSequence);
        }
        return null;
    }

    public final void n(String str, int i10, long j10, Runnable runnable) {
        m(str, i10, j10, runnable, null, null);
    }

    public final TableRow o(String str, final int i10, final long j10, Runnable runnable) {
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f27386a;
        final v90 v90Var = new v90(context, d6Var);
        v90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        v90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        v90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        v90Var.setTextSize(14);
        org.telegram.ui.l5 l5Var = new org.telegram.ui.l5(v90Var, 24.0f, i10);
        int i12 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = l5Var.f38789b;
        if (i12 == 0) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            zq a2 = ai.gd.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f32995f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j10)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                zq a10 = ai.gd.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f32995f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else {
                if (j10 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    str2 = UserObject.getUserName(user);
                    l5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    if (chat == null) {
                        str2 = "";
                    } else {
                        str2 = chat.title;
                    }
                    l5Var.b(chat);
                }
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(l5Var, 0, 1, 33);
        if (z10) {
            v90Var.setClickable(true);
            spannableStringBuilder.setSpan(new uc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        final p5 p5Var = new p5(AndroidUtilities.dp(20.0f), v90Var);
        p5Var.k(Integer.valueOf(w02));
        p5Var.I = AndroidUtilities.dp(12.0f);
        p5Var.J = 0;
        v90Var.addOnAttachStateChangeListener(new ai.m6(p5Var, 11));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f01.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        v90Var.i(p5Var);
        NotificationCenter.getInstance(i10).listen(v90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(v90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        v90Var.l(spannableStringBuilder, false);
        return l(v90Var, str);
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
        paint.setStrokeWidth(this.f27389f);
        int i14 = org.telegram.ui.ActionBar.h6.f21234qh;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27386a;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21215ph, d6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z16 = true;
                    if (childAt instanceof i01) {
                        i01 i01Var = (i01) childAt;
                        if (i15 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (i01Var.f27032b != z15 || i01Var.f27033c != z16) {
                            i01Var.f27032b = z15;
                            i01Var.f27033c = z16;
                            i01Var.invalidate();
                        }
                    } else if (childAt instanceof g01) {
                        g01 g01Var = (g01) childAt;
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
                        if (g01Var.f26431b != z12 || g01Var.f26432c != z13) {
                            g01Var.f26431b = z12;
                            g01Var.f26432c = z13;
                            g01Var.invalidate();
                        }
                        if (i16 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (g01Var.d != z14 || g01Var.e != z16) {
                            g01Var.d = z14;
                            g01Var.e = z16;
                            g01Var.invalidate();
                        }
                    } else if (childAt instanceof h01) {
                        h01 h01Var = (h01) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (h01Var.f26724c != z11 || h01Var.d != z16) {
                            h01Var.f26724c = z11;
                            h01Var.d = z16;
                            h01Var.invalidate();
                        }
                    }
                }
            }
        }
    }

    public final void p(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        x90 x90Var = new x90(getContext(), null);
        x90Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        x90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f21092j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27386a;
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var));
        x90Var.setMaxLines(1);
        x90Var.setSingleLine();
        x90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        x90Var.setText(spannableStringBuilder);
        x90Var.setDisablePaddingsOffsetY(true);
        x90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(x90Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        l(frameLayout, str);
    }
}
