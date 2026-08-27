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
import org.telegram.messenger.DialogObject;
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

public final class yy0 extends TableLayout {

    public final org.telegram.ui.ActionBar.c6 f35062a;

    public final Path f35063b;

    public final float[] f35064c;
    public final Paint d;

    public final Paint f35065e;

    public final float f35066f;
    public final float h;

    public yy0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f35063b = new Path();
        this.f35064c = new float[8];
        this.d = new Paint(1);
        this.f35065e = new Paint(1);
        float fMax = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f35066f = fMax;
        this.h = fMax / 2.0f;
        this.f35062a = c6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final wy0 a(CharSequence charSequence) {
        eh.s sVar = new eh.s(getContext());
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35062a;
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        sVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        sVar.setTextSize(1, 14.0f);
        sVar.setText(Emoji.replaceEmoji(charSequence, sVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(sVar);
        sVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        wy0 wy0Var = new wy0(this, sVar, true);
        tableRow.addView(wy0Var, layoutParams);
        addView(tableRow);
        return wy0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        s5 s5Var = new s5(getContext());
        s5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.f35062a));
        s5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        s5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, s5Var.getPaint().getFontMetricsInt(), false), arrayList, s5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(s5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new wy0(this, s5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, xy0[] xy0VarArr, oc[] ocVarArr) {
        oc ocVar = new oc(getContext(), null);
        ocVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.f35062a));
        ocVar.setTextSize(1, 14.0f);
        ocVar.setText(Emoji.replaceEmoji(charSequence2, ocVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(ocVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        xy0 xy0Var = new xy0(this, charSequence);
        if (xy0VarArr != null) {
            xy0VarArr[0] = xy0Var;
        }
        tableRow.addView(xy0Var, layoutParams);
        tableRow.addView(new vy0(this, ocVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (ocVarArr != null) {
            ocVarArr[0] = ocVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        oc ocVar = new oc(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35062a;
        ocVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        ocVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, ocVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) pc.b(str2, runnable, c6Var, num));
        }
        ocVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(ocVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new xy0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new vy0(this, ocVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j10 = ((long) i10) * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f35062a;
        p80 p80Var = new p80(context, c6Var);
        p80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.g6.gc;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setSingleLine(true);
        p80Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new jc(3, runnable), 0, spannableStringBuilder.length(), 33);
        p80Var.setText(spannableStringBuilder);
        i(p80Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, hh.m5 m5Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        textView.setTextSize(1, i10);
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35062a;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.g6.f23373v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new xh0(4, charSequence, m5Var));
        h7.b6.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), 7, -1));
        frameLayout.addView(imageView, h7.z5.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new xy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new vy0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i10, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String userName;
        String string;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f35062a;
        oc ocVar = new oc(context, c6Var);
        ocVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        ocVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.g6.gc;
        ocVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        ocVar.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        ocVar.setTextSize(1, 14.0f);
        ocVar.setSingleLine(true);
        ocVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(ocVar, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.f38316b;
        if (j10 == 2666000) {
            string = LocaleController.getString(R.string.StarsTransactionHidden);
            dq dqVarA = hh.ja.a(44, "anonymous");
            int iDp = AndroidUtilities.dp(16.0f);
            int iDp2 = AndroidUtilities.dp(16.0f);
            dqVarA.f27823e = iDp;
            dqVarA.f27824f = iDp2;
            imageReceiver.setImageBitmap(dqVarA);
            z10 = false;
            z11 = false;
        } else {
            if (UserObject.isService(j10)) {
                string = LocaleController.getString(R.string.StarsTransactionUnknown);
                dq dqVarA2 = hh.ja.a(44, "fragment");
                int iDp3 = AndroidUtilities.dp(16.0f);
                int iDp4 = AndroidUtilities.dp(16.0f);
                dqVarA2.f27823e = iDp3;
                dqVarA2.f27824f = iDp4;
                imageReceiver.setImageBitmap(dqVarA2);
                z10 = false;
            } else {
                if (j10 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    z10 = user == null;
                    userName = UserObject.getUserName(user);
                    g5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    z10 = chat == null;
                    userName = chat == null ? "" : chat.title;
                    g5Var.b(chat);
                }
                string = userName;
            }
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) string));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new jc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            ocVar.I = new pc(str, runnable2, c6Var);
        }
        ocVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return i(ocVar, charSequence);
    }

    public final void k(String str, int i10, long j10, Runnable runnable) {
        j(str, i10, j10, runnable, null, null);
    }

    public final TableRow l(String str, final int i10, final long j10, Runnable runnable) {
        String userName;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.c6 c6Var = this.f35062a;
        final n80 n80Var = new n80(context, c6Var);
        n80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        n80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        n80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        n80Var.setTextSize(14);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(n80Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.f38316b;
        if (j10 == 2666000) {
            userName = LocaleController.getString(R.string.StarsTransactionHidden);
            dq dqVarA = hh.ja.a(44, "anonymous");
            int iDp = AndroidUtilities.dp(16.0f);
            int iDp2 = AndroidUtilities.dp(16.0f);
            dqVarA.f27823e = iDp;
            dqVarA.f27824f = iDp2;
            imageReceiver.setImageBitmap(dqVarA);
            z10 = false;
        } else {
            if (UserObject.isService(j10)) {
                userName = LocaleController.getString(R.string.StarsTransactionUnknown);
                dq dqVarA2 = hh.ja.a(44, "fragment");
                int iDp3 = AndroidUtilities.dp(16.0f);
                int iDp4 = AndroidUtilities.dp(16.0f);
                dqVarA2.f27823e = iDp3;
                dqVarA2.f27824f = iDp4;
                imageReceiver.setImageBitmap(dqVarA2);
            } else if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                userName = UserObject.getUserName(user);
                g5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                userName = chat == null ? "" : chat.title;
                g5Var.b(chat);
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z10) {
            n80Var.setClickable(true);
            spannableStringBuilder.setSpan(new jc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        final i5 i5Var = new i5(AndroidUtilities.dp(20.0f), n80Var);
        i5Var.k(Integer.valueOf(iV0));
        i5Var.E = AndroidUtilities.dp(12.0f);
        i5Var.F = 0;
        n80Var.addOnAttachStateChangeListener(new bf.b(i5Var, 14));
        final Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z11;
                long emojiStatusDocumentId;
                i5 i5Var2;
                n80 n80Var2;
                long j11 = j10;
                if (j11 == 2666000 || UserObject.isService(j11)) {
                    return;
                }
                int i12 = i10;
                if (j11 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(j11));
                    emojiStatus = user2 != null ? user2.emoji_status : null;
                    if (user2 != null && user2.premium) {
                        z11 = true;
                    }
                    emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                    i5Var2 = i5Var;
                    n80Var2 = n80Var;
                    if (emojiStatusDocumentId != 0) {
                        i5Var2.j(emojiStatusDocumentId, true);
                        i5Var2.m(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                        n80Var2.i(i5Var2);
                    } else if (z11) {
                        i5Var2.g(drawableMutate, true);
                        i5Var2.m(false, true);
                        n80Var2.i(i5Var2);
                    } else {
                        n80Var2.i(null);
                    }
                    i5Var2.k(Integer.valueOf(iV0));
                }
                TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-j11));
                emojiStatus = chat2 != null ? chat2.emoji_status : null;
                z11 = false;
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                i5Var2 = i5Var;
                n80Var2 = n80Var;
                if (emojiStatusDocumentId != 0) {
                    i5Var2.j(emojiStatusDocumentId, true);
                    i5Var2.m(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                    n80Var2.i(i5Var2);
                } else if (z11) {
                    i5Var2.g(drawableMutate, true);
                    i5Var2.m(false, true);
                    n80Var2.i(i5Var2);
                } else {
                    n80Var2.i(null);
                }
                i5Var2.k(Integer.valueOf(iV0));
            }
        };
        callback.run(null);
        n80Var.i(i5Var);
        NotificationCenter.getInstance(i10).listen(n80Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(n80Var, NotificationCenter.userEmojiStatusUpdated, callback);
        n80Var.l(spannableStringBuilder, false);
        return i(n80Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        p80 p80Var = new p80(getContext(), null);
        p80Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        p80Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23161j5;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35062a;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var.setMaxLines(1);
        p80Var.setSingleLine();
        p80Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        p80Var.setText(spannableStringBuilder);
        p80Var.setDisablePaddingsOffsetY(true);
        p80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(p80Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        i(frameLayout, str);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f35065e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f35066f);
        int i14 = org.telegram.ui.ActionBar.g6.f23293qh;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35062a;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23276ph, c6Var));
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt = tableRow.getChildAt(i16);
                    if (childAt instanceof xy0) {
                        xy0 xy0Var = (xy0) childAt;
                        boolean z12 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (xy0Var.f34731b != z12 || xy0Var.f34732c != z11) {
                            xy0Var.f34731b = z12;
                            xy0Var.f34732c = z11;
                            xy0Var.invalidate();
                        }
                    } else if (childAt instanceof vy0) {
                        vy0 vy0Var = (vy0) childAt;
                        boolean z13 = i15 == 0;
                        boolean z14 = i15 == childCount + (-1);
                        if (vy0Var.f34069b != z13 || vy0Var.f34070c != z14) {
                            vy0Var.f34069b = z13;
                            vy0Var.f34070c = z14;
                            vy0Var.invalidate();
                        }
                        boolean z15 = i16 == 0;
                        z11 = i16 == childCount2 + (-1);
                        if (vy0Var.d != z15 || vy0Var.f34071e != z11) {
                            vy0Var.d = z15;
                            vy0Var.f34071e = z11;
                            vy0Var.invalidate();
                        }
                    } else if (childAt instanceof wy0) {
                        wy0 wy0Var = (wy0) childAt;
                        boolean z16 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (wy0Var.f34377c != z16 || wy0Var.d != z11) {
                            wy0Var.f34377c = z16;
                            wy0Var.d = z11;
                            wy0Var.invalidate();
                        }
                    }
                    i16++;
                }
            }
            i15++;
        }
    }
}
