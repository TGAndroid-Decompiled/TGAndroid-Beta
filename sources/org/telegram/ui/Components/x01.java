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
public final class x01 extends TableLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f34627a;
    public final Path f34628b;
    public final float[] f34629c;
    public final Paint d;
    public final Paint e;
    public final float f34630f;
    public final float h;
    public ArrayList f34631n;
    public ArrayList f34632r;

    public x01(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f34628b = new Path();
        this.f34629c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f34630f = max;
        this.h = max / 2.0f;
        this.f34627a = u6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final v01 a(CharSequence charSequence) {
        xh.n nVar = new xh.n(getContext());
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f34627a;
        org.telegram.ui.ActionBar.f7.V(nVar, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(nVar, org.telegram.ui.ActionBar.y6.gc, u6Var);
        nVar.setTextSize(1, 14.0f);
        nVar.setText(Emoji.replaceEmoji(charSequence, nVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        v01 v01Var = new v01(this, nVar, true);
        tableRow.addView(v01Var, layoutParams);
        addView(tableRow);
        return v01Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        b6 b6Var = new b6(getContext());
        org.telegram.ui.ActionBar.f7.V(b6Var, org.telegram.ui.ActionBar.y6.G6, this.f34627a);
        b6Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        b6Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, b6Var.getPaint().getFontMetricsInt(), false), arrayList, b6Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(b6Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new v01(this, b6Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, w01[] w01VarArr, yc[] ycVarArr) {
        yc ycVar = new yc(getContext());
        org.telegram.ui.ActionBar.f7.V(ycVar, org.telegram.ui.ActionBar.y6.G6, this.f34627a);
        ycVar.setTextSize(1, 14.0f);
        ycVar.setText(Emoji.replaceEmoji(charSequence2, ycVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(ycVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        w01 w01Var = new w01(this, charSequence);
        if (w01VarArr != null) {
            w01VarArr[0] = w01Var;
        }
        tableRow.addView(w01Var, layoutParams);
        tableRow.addView(new u01(this, ycVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (ycVarArr != null) {
            ycVarArr[0] = ycVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        yc ycVar = new yc(getContext());
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f34627a;
        org.telegram.ui.ActionBar.f7.V(ycVar, i10, u6Var);
        ycVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, ycVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) zc.b(str2, runnable, u6Var, num));
        }
        ycVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(ycVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new w01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new u01(this, ycVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(TextView textView, String str) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new w01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new u01(this, textView, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
    }

    public final void g(int i10, String str) {
        long j10 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))), null, null);
    }

    public final TableRow h(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.b4 b4Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.u6 u6Var = this.f34627a;
        yc ycVar = new yc(context, u6Var);
        ycVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        ycVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.y6.gc;
        org.telegram.ui.ActionBar.f7.V(ycVar, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(ycVar, i10, u6Var);
        ycVar.setTextSize(1, 14.0f);
        ycVar.setSingleLine(true);
        ycVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new tc(3, runnable), 0, spannableStringBuilder.length(), 33);
        ycVar.setText(spannableStringBuilder);
        if (str != null) {
            ycVar.O = new zc(str, b4Var, u6Var);
        }
        return l(ycVar, charSequence);
    }

    public final void i(String str, CharSequence charSequence, Runnable runnable) {
        h(str, charSequence, runnable, null, null);
    }

    public final TableRow j(CharSequence charSequence, CharSequence charSequence2, int i10, bi.f2 f2Var, String str, org.telegram.ui.Wallet.a4 a4Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final aa0 aa0Var = new aa0(getContext(), null);
        aa0Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        float f7 = i10;
        aa0Var.setTextSize(1, f7);
        int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.u6 u6Var = this.f34627a;
        org.telegram.ui.ActionBar.f7.V(aa0Var, i11, u6Var);
        aa0Var.setMaxLines(4);
        int i12 = 0;
        aa0Var.setSingleLine(false);
        aa0Var.setText(charSequence2);
        aa0Var.setDisablePaddingsOffsetY(true);
        aa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(aa0Var, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        if (str != null) {
            zc zcVar = new zc(str, a4Var, u6Var);
            final yc ycVar = new yc(getContext(), u6Var);
            ycVar.setTextSize(1, f7);
            ycVar.setPadding(0, AndroidUtilities.dp(9.33f), 0, AndroidUtilities.dp(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(zcVar, 0, spannableString.length(), 33);
            ycVar.setText(spannableString);
            if (f2Var != null) {
                i12 = 34;
            }
            float f10 = i12 + 12.66f;
            ((FrameLayout.LayoutParams) aa0Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10) + zcVar.a();
            frameLayout.addView(ycVar, kb1.h(-2, -2.0f, 53, 0.0f, 0.0f, f10, 0.0f));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
                    aa0 aa0Var2 = aa0.this;
                    if (aa0Var2.getLayout() != null && aa0Var2.getLayout().getLineCount() > 0) {
                        int left = aa0Var2.getLeft();
                        float lineRight = aa0Var2.getLayout().getLineRight(0) + aa0Var2.getPaddingLeft() + left + AndroidUtilities.dp(6.0f);
                        yc ycVar2 = ycVar;
                        ycVar2.setTranslationX(Math.min(0.0f, lineRight - ycVar2.getLeft()));
                    }
                }
            });
        }
        if (f2Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i13 = org.telegram.ui.ActionBar.y6.f23693v6;
            org.telegram.ui.ActionBar.f7.t(imageView, i13, u6Var, PorterDuff.Mode.SRC_IN);
            imageView.setOnClickListener(new ga(27, charSequence2, f2Var));
            kb1.b(imageView);
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(i13, u6Var)), 7, -1);
            org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.1f, i13);
            imageView.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(imageView, g02, null, L, u6Var);
            frameLayout.addView(imageView, kb1.i(30, 30, 21));
        }
        return l(frameLayout, charSequence);
    }

    public final void k(String str, CharSequence charSequence, int i10, bi.f2 f2Var) {
        j(str, charSequence, i10, f2Var, null, null);
    }

    public final TableRow l(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new w01(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new u01(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow m(CharSequence charSequence, int i10, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.u6 u6Var = this.f34627a;
        yc ycVar = new yc(context, u6Var);
        ycVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        ycVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.V(ycVar, i11, u6Var);
        org.telegram.ui.ActionBar.f7.H(ycVar, i11, u6Var);
        ycVar.setTextSize(1, 14.0f);
        ycVar.setSingleLine(true);
        ycVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(ycVar, 24.0f, i10);
        int i12 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = j5Var.f40427b;
        if (i12 == 0) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            ar a2 = bi.yc.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f26642f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else if (UserObject.isService(j10)) {
            str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
            ar a10 = bi.yc.a(44, "fragment");
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            a10.e = dp3;
            a10.f26642f = dp4;
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
                j5Var.e(user);
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
                j5Var.b(chat);
            }
            str3 = str2;
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(j5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new tc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            ycVar.O = new zc(str, runnable2, u6Var);
        }
        ycVar.setText(spannableStringBuilder);
        if (!z10) {
            return l(ycVar, charSequence);
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
        org.telegram.ui.ActionBar.u6 u6Var = this.f34627a;
        final y90 y90Var = new y90(context, u6Var);
        y90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.Y(y90Var, i11, u6Var);
        y90Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        y90Var.setTextSize(14);
        org.telegram.ui.j5 j5Var = new org.telegram.ui.j5(y90Var, 24.0f, i10);
        int i12 = (j10 > 2666000L ? 1 : (j10 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = j5Var.f40427b;
        if (i12 == 0) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            ar a2 = bi.yc.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f26642f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j10)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                ar a10 = bi.yc.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f26642f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else {
                if (j10 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    str2 = UserObject.getUserName(user);
                    j5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    if (chat == null) {
                        str2 = "";
                    } else {
                        str2 = chat.title;
                    }
                    j5Var.b(chat);
                }
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(j5Var, 0, 1, 33);
        if (z10) {
            y90Var.setClickable(true);
            spannableStringBuilder.setSpan(new tc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        final r5 r5Var = new r5(AndroidUtilities.dp(20.0f), y90Var);
        r5Var.k(Integer.valueOf(w02));
        r5Var.I = AndroidUtilities.dp(12.0f);
        r5Var.J = 0;
        if (this.f34631n == null) {
            this.f34631n = new ArrayList();
            this.f34632r = new ArrayList();
        }
        this.f34631n.add(y90Var);
        this.f34632r.add(r5Var);
        y90Var.addOnAttachStateChangeListener(new bi.i6(r5Var, 12));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        org.telegram.ui.ActionBar.f7.y(this, mutate, i11, u6Var, PorterDuff.Mode.SRC_IN);
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t01.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        y90Var.i(r5Var);
        NotificationCenter.getInstance(i10).listen(y90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(y90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        y90Var.l(spannableStringBuilder, false);
        return l(y90Var, str);
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
        paint.setStrokeWidth(this.f34630f);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        int i14 = org.telegram.ui.ActionBar.y6.f23607qh;
        org.telegram.ui.ActionBar.u6 u6Var = this.f34627a;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i14, u6Var));
        paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23590ph, u6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z16 = true;
                    if (childAt instanceof w01) {
                        w01 w01Var = (w01) childAt;
                        if (i15 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (w01Var.f34411b != z15 || w01Var.f34412c != z16) {
                            w01Var.f34411b = z15;
                            w01Var.f34412c = z16;
                            w01Var.invalidate();
                        }
                    } else if (childAt instanceof u01) {
                        u01 u01Var = (u01) childAt;
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
                        if (u01Var.f33185b != z12 || u01Var.f33186c != z13) {
                            u01Var.f33185b = z12;
                            u01Var.f33186c = z13;
                            u01Var.invalidate();
                        }
                        if (i16 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (u01Var.d != z14 || u01Var.e != z16) {
                            u01Var.d = z14;
                            u01Var.e = z16;
                            u01Var.invalidate();
                        }
                    } else if (childAt instanceof v01) {
                        v01 v01Var = (v01) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (v01Var.f33512c != z11 || v01Var.d != z16) {
                            v01Var.f33512c = z11;
                            v01Var.d = z16;
                            v01Var.invalidate();
                        }
                    }
                }
            }
        }
    }

    public final void p(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        aa0 aa0Var = new aa0(getContext(), null);
        aa0Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        aa0Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.u6 u6Var = this.f34627a;
        org.telegram.ui.ActionBar.f7.V(aa0Var, i10, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        aa0Var.setMaxLines(1);
        aa0Var.setSingleLine();
        aa0Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        aa0Var.setText(spannableStringBuilder);
        aa0Var.setDisablePaddingsOffsetY(true);
        aa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(aa0Var, kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        l(frameLayout, str);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.f23607qh;
        org.telegram.ui.ActionBar.u6 u6Var = this.f34627a;
        this.e.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        this.d.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23590ph, u6Var));
        try {
            if (this.f34631n != null && this.f34632r != null) {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var);
                for (int i11 = 0; i11 < this.f34631n.size(); i11++) {
                    y90 y90Var = (y90) this.f34631n.get(i11);
                    if (y90Var != null) {
                        y90Var.setLinkTextColor(w02);
                        y90Var.invalidate();
                    }
                }
                for (int i12 = 0; i12 < this.f34632r.size(); i12++) {
                    r5 r5Var = (r5) this.f34632r.get(i12);
                    if (r5Var != null) {
                        r5Var.k(Integer.valueOf(w02));
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
