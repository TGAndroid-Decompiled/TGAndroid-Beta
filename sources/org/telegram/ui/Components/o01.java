package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o01 extends TableLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f29054a;
    public final Path f29055b;
    public final float[] f29056c;
    public final Paint d;
    public final Paint e;
    public final float f29057f;
    public final float h;
    public ArrayList f29058n;
    public ArrayList f29059r;

    public o01(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29055b = new Path();
        this.f29056c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f29057f = max;
        this.h = max / 2.0f;
        this.f29054a = g6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final m01 a(CharSequence charSequence) {
        wh.n nVar = new wh.n(getContext());
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29054a;
        org.telegram.ui.ActionBar.r6.W(nVar, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(nVar, org.telegram.ui.ActionBar.k6.f21242gc, g6Var);
        nVar.setTextSize(1, 14.0f);
        nVar.setText(Emoji.replaceEmoji(charSequence, nVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        m01 m01Var = new m01(this, nVar, true);
        tableRow.addView(m01Var, layoutParams);
        addView(tableRow);
        return m01Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        z5 z5Var = new z5(getContext());
        org.telegram.ui.ActionBar.r6.W(z5Var, org.telegram.ui.ActionBar.k6.G6, this.f29054a);
        z5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        z5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, z5Var.getPaint().getFontMetricsInt(), false), arrayList, z5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(z5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new m01(this, z5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, n01[] n01VarArr, zc[] zcVarArr) {
        zc zcVar = new zc(getContext());
        org.telegram.ui.ActionBar.r6.W(zcVar, org.telegram.ui.ActionBar.k6.G6, this.f29054a);
        zcVar.setTextSize(1, 14.0f);
        zcVar.setText(Emoji.replaceEmoji(charSequence2, zcVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(zcVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        n01 n01Var = new n01(this, charSequence);
        if (n01VarArr != null) {
            n01VarArr[0] = n01Var;
        }
        tableRow.addView(n01Var, layoutParams);
        tableRow.addView(new l01(this, zcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
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
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29054a;
        org.telegram.ui.ActionBar.r6.W(zcVar, i10, g6Var);
        zcVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, zcVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ad.b(str2, runnable, g6Var, num));
        }
        zcVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(zcVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new n01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new l01(this, zcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new n01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new l01(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i10, String str) {
        long j10 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.c4 c4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.g6 g6Var = this.f29054a;
        zc zcVar = new zc(context, g6Var);
        zcVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        zcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.k6.f21242gc;
        org.telegram.ui.ActionBar.r6.W(zcVar, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(zcVar, i10, g6Var);
        zcVar.setTextSize(1, 14.0f);
        zcVar.setSingleLine(true);
        zcVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new uc(3, runnable), 0, spannableStringBuilder.length(), 33);
        zcVar.setText(spannableStringBuilder);
        if (str != null) {
            zcVar.O = new ad(str, c4Var, g6Var);
        }
        return l(zcVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i10, ai.qa qaVar, String str, org.telegram.ui.Wallet.b4 b4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final y90 y90Var = new y90(getContext(), null);
        y90Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        float f7 = i10;
        y90Var.setTextSize(1, f7);
        int i11 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29054a;
        org.telegram.ui.ActionBar.r6.W(y90Var, i11, g6Var);
        y90Var.setMaxLines(4);
        int i12 = 0;
        y90Var.setSingleLine(false);
        y90Var.setText(charSequence2);
        y90Var.setDisablePaddingsOffsetY(true);
        y90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(y90Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            ad adVar = new ad(str, b4Var, g6Var);
            final zc zcVar = new zc(getContext(), g6Var);
            zcVar.setTextSize(1, f7);
            zcVar.setPadding(0, AndroidUtilities.dp(9.33f), 0, AndroidUtilities.dp(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(adVar, 0, spannableString.length(), 33);
            zcVar.setText(spannableString);
            if (qaVar != null) {
                i12 = 34;
            }
            float f10 = i12 + 12.66f;
            ((FrameLayout.LayoutParams) y90Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10) + adVar.a();
            frameLayout.addView(zcVar, w7.z5.d(-2, -2.0f, 53, 0.0f, 0.0f, f10, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
                    y90 y90Var2 = y90.this;
                    if (y90Var2.getLayout() != null && y90Var2.getLayout().getLineCount() > 0) {
                        int left = y90Var2.getLeft();
                        float lineRight = y90Var2.getLayout().getLineRight(0) + y90Var2.getPaddingLeft() + left + AndroidUtilities.dp(6.0f);
                        zc zcVar2 = zcVar;
                        zcVar2.setTranslationX(Math.min(0.0f, lineRight - zcVar2.getLeft()));
                    }
                }
            });
        }
        if (qaVar != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i13 = org.telegram.ui.ActionBar.k6.f21516v6;
            org.telegram.ui.ActionBar.r6.t(imageView, i13, g6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new ca(27, charSequence2, qaVar));
            w7.b6.a(imageView);
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i13, g6Var)), 7, -1);
            org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.1f, i13);
            imageView.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(imageView, g02, null, M, g6Var);
            frameLayout.addView(imageView, w7.z5.e(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i10, ai.qa qaVar) {
        j(str, charSequence, i10, qaVar, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new n01(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new l01(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i10, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.g6 g6Var = this.f29054a;
        zc zcVar = new zc(context, g6Var);
        zcVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        zcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        org.telegram.ui.ActionBar.r6.W(zcVar, i11, g6Var);
        org.telegram.ui.ActionBar.r6.I(zcVar, i11, g6Var);
        zcVar.setTextSize(1, 14.0f);
        zcVar.setSingleLine(true);
        zcVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(zcVar, 24.0f, i10);
        int i12 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = k5Var.f38816b;
        if (i12 == 0) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            yq a2 = ai.id.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f33015f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else if (UserObject.isService(j10)) {
            str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
            yq a10 = ai.id.a(44, "fragment");
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            a10.e = dp3;
            a10.f33015f = dp4;
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
            spannableStringBuilder.setSpan(new uc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            zcVar.O = new ad(str, runnable2, g6Var);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f29054a;
        final w90 w90Var = new w90(context, g6Var);
        w90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        org.telegram.ui.ActionBar.r6.Z(w90Var, i11, g6Var);
        w90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        w90Var.setTextSize(14);
        org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(w90Var, 24.0f, i10);
        int i12 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = k5Var.f38816b;
        if (i12 == 0) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            yq a2 = ai.id.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f33015f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j10)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                yq a10 = ai.id.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f33015f = dp4;
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
            w90Var.setClickable(true);
            spannableStringBuilder.setSpan(new uc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        final p5 p5Var = new p5(AndroidUtilities.dp(20.0f), w90Var);
        p5Var.k(Integer.valueOf(w02));
        p5Var.I = AndroidUtilities.dp(12.0f);
        p5Var.J = 0;
        if (this.f29058n == null) {
            this.f29058n = new ArrayList();
            this.f29059r = new ArrayList();
        }
        this.f29058n.add(w90Var);
        this.f29059r.add(p5Var);
        w90Var.addOnAttachStateChangeListener(new ai.n6(p5Var, 11));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        org.telegram.ui.ActionBar.r6.z(this, mutate, i11, g6Var, PorterDuff.Mode.SRC_IN);
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k01.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        w90Var.i(p5Var);
        NotificationCenter.getInstance(i10).listen(w90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(w90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        w90Var.l(spannableStringBuilder, false);
        return l(w90Var, str);
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
        paint.setStrokeWidth(this.f29057f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i14 = org.telegram.ui.ActionBar.k6.f21431qh;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29054a;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21412ph, g6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z16 = true;
                    if (childAt instanceof n01) {
                        n01 n01Var = (n01) childAt;
                        if (i15 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (n01Var.f28799b != z15 || n01Var.f28800c != z16) {
                            n01Var.f28799b = z15;
                            n01Var.f28800c = z16;
                            n01Var.invalidate();
                        }
                    } else if (childAt instanceof l01) {
                        l01 l01Var = (l01) childAt;
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
                        if (l01Var.f28192b != z12 || l01Var.f28193c != z13) {
                            l01Var.f28192b = z12;
                            l01Var.f28193c = z13;
                            l01Var.invalidate();
                        }
                        if (i16 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (l01Var.d != z14 || l01Var.e != z16) {
                            l01Var.d = z14;
                            l01Var.e = z16;
                            l01Var.invalidate();
                        }
                    } else if (childAt instanceof m01) {
                        m01 m01Var = (m01) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (m01Var.f28462c != z11 || m01Var.d != z16) {
                            m01Var.f28462c = z11;
                            m01Var.d = z16;
                            m01Var.invalidate();
                        }
                    }
                }
            }
        }
    }

    public final void p(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        y90 y90Var = new y90(getContext(), null);
        y90Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        y90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29054a;
        org.telegram.ui.ActionBar.r6.W(y90Var, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.f21242gc, g6Var);
        y90Var.setMaxLines(1);
        y90Var.setSingleLine();
        y90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        y90Var.setText(spannableStringBuilder);
        y90Var.setDisablePaddingsOffsetY(true);
        y90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(y90Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        l(frameLayout, str);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.f21431qh;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29054a;
        this.e.setColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21412ph, g6Var));
        try {
            if (this.f29058n != null && this.f29059r != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
                for (int i11 = 0; i11 < this.f29058n.size(); i11++) {
                    w90 w90Var = (w90) this.f29058n.get(i11);
                    if (w90Var != null) {
                        w90Var.setLinkTextColor(w02);
                        w90Var.invalidate();
                    }
                }
                for (int i12 = 0; i12 < this.f29059r.size(); i12++) {
                    p5 p5Var = (p5) this.f29059r.get(i12);
                    if (p5Var != null) {
                        p5Var.k(Integer.valueOf(w02));
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            childAt.invalidate();
            if (childAt instanceof ViewGroup) {
                int i14 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    if (i14 < viewGroup.getChildCount()) {
                        viewGroup.getChildAt(i14).invalidate();
                        i14++;
                    }
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
