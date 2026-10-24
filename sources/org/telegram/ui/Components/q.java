package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.LaunchActivity;
public final class q extends za implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone X;
    public final AiTonesController Y;
    public final ImageView Z;
    public final FrameLayout f29693a0;
    public final TextView f29694b0;
    public final TextView f29695c0;
    public final FrameLayout f29696d0;
    public final FrameLayout f29697e0;
    public final ei.d f29698f0;
    public a71 f29699g0;
    public int f29700h0;
    public final TL_aicompose.aiComposeToneExample[] f29701i0;
    public int f29702j0;

    public q(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, 2, g6Var);
        int i10;
        this.f29700h0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.Y = tonesController;
        tonesController.load();
        this.X = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.f29701i0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.Z = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i11)), 1, -1);
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.1f, i11);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, M, g6Var);
        this.containerView.addView(imageView, w7.z5.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new n(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29693a0 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(100.0f);
        int i12 = org.telegram.ui.ActionBar.k6.f21184d6;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, K, O, null, g6Var);
        frameLayout.addView(frameLayout2, w7.z5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        u9 u9Var = new u9(context);
        u9Var.setAnimatedEmojiDrawable(new p5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(u9Var, w7.z5.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.f29694b0 = textView;
        org.telegram.messenger.v0.q(textView, i11, g6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.f29695c0 = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i11, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.e.setTitle(aiComposeTone.title);
        int i13 = org.telegram.ui.ActionBar.k6.f21126a7;
        this.behindKeyboardColorKey = i13;
        setBackgroundColor(getThemedColor(i13));
        lm0 lm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        lm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.t1();
        this.d.setOnItemClickListener(new j(this, 1));
        this.L = false;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.O = true;
        p pVar = new p(this);
        pVar.f46376m = false;
        pVar.C = false;
        pVar.o(zr.h);
        pVar.n(350L);
        this.d.setItemAnimator(pVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f29696d0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, getThemedColor(i13)), getThemedColor(i13), getThemedColor(i13)}));
        FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 80);
        int i15 = e.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        e.leftMargin = i15 + i16;
        e.rightMargin += i16;
        this.containerView.addView(frameLayout3, e);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f29697e0 = frameLayout4;
        FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i17 = d.leftMargin;
        int i18 = this.backgroundPaddingLeft;
        d.leftMargin = i17 + i18;
        d.rightMargin += i18;
        this.containerView.addView(frameLayout4, d);
        ei.d g10 = org.telegram.messenger.tl.g(24, context, g6Var, true);
        this.f29698f0 = g10;
        if (U()) {
            i10 = R.string.AIEditorStyleDone;
        } else {
            i10 = R.string.AIEditorAddStyle;
        }
        g10.setText(LocaleController.getString(i10));
        g10.setOnClickListener(new ai.v0(this, aiComposeTone, g6Var, 14));
        frameLayout3.addView(g10, w7.z5.e(-1, 48, 119));
        this.f29699g0.N(false);
    }

    public static void P(q qVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.g6 g6Var) {
        ei.d dVar = qVar.f29698f0;
        if (dVar.f8862c0 && !dVar.Q) {
            if (qVar.U()) {
                qVar.dismiss();
                return;
            }
            dVar.setLoading(true);
            TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
            savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(savetone, new Object(), new ai.s0(qVar, g6Var, aiComposeTone, 4));
        }
    }

    public static void Q(q qVar) {
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
            return;
        }
        int i10 = qVar.f29700h0 + 1;
        qVar.f29700h0 = i10;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = qVar.f29701i0;
        if (i10 >= aicomposetoneexampleArr.length) {
            qVar.f29700h0 = 0;
        }
        int i11 = qVar.f29700h0;
        if (aicomposetoneexampleArr[i11] == null) {
            TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
            gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            gettoneexample.num = i11;
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(gettoneexample, new Object(), new o(qVar, i11, 0));
        }
        qVar.f29699g0.N(true);
    }

    public static void R(q qVar, ArrayList arrayList, a71 a71Var) {
        CharSequence formatTextWithEntities;
        CharSequence formatTextWithEntities2;
        String str;
        String formatString;
        a71Var.F = 1;
        TLRPC.User user = null;
        arrayList.add(l61.B(null));
        FrameLayout frameLayout = qVar.f29693a0;
        l61 l61Var = new l61(-4);
        l61Var.f28221c = frameLayout;
        l61Var.f28240z = -1;
        l61Var.e = true;
        arrayList.add(l61Var);
        arrayList.add(l61.B(null));
        arrayList.add(l61.l(qVar.f29694b0));
        arrayList.add(l61.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(l61.l(qVar.f29695c0));
        arrayList.add(l61.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = qVar.f29701i0[qVar.f29700h0];
            a71Var.U();
            arrayList.add(d51.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new n(qVar, 1)));
            if (aicomposetoneexample == null) {
                formatTextWithEntities = V();
            } else {
                formatTextWithEntities = MessageObject.formatTextWithEntities(aicomposetoneexample.from);
            }
            arrayList.add(h51.a(4, formatTextWithEntities, false, null, null, null));
            arrayList.add(d51.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            if (aicomposetoneexample == null) {
                formatTextWithEntities2 = V();
            } else {
                formatTextWithEntities2 = MessageObject.formatTextWithEntities(aicomposetoneexample.to);
            }
            arrayList.add(h51.a(6, formatTextWithEntities2, false, null, null, null));
            a71Var.T();
            if (tL_aiComposeTone.author_id != 0) {
                user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(l61.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (tL_aiComposeTone.installs_count > 0) {
                    str = LocaleController.formatPluralString("AIEditorUsedBy", tL_aiComposeTone.installs_count, new Object[0]) + " ";
                } else {
                    str = "";
                }
                sb2.append(str);
                if (TextUtils.isEmpty(publicUsername)) {
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, UserObject.getUserName(user));
                } else {
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, si.o0.h("@", publicUsername));
                }
                sb2.append(formatString);
                arrayList.add(l61.B(AndroidUtilities.replaceSingleLinkKey(sb2.toString(), org.telegram.ui.ActionBar.k6.f21243gc, qVar.resourcesProvider, new org.telegram.ui.eh(23, qVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(l61.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(q qVar, org.telegram.ui.ActionBar.g6 g6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = qVar.f29697e0;
        qVar.f29698f0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(qVar.currentAccount, new vc(frameLayout, g6Var));
                return;
            } else {
                org.telegram.ui.Cells.b1.s(frameLayout, g6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(qVar.currentAccount).getTonesController().add(aiComposeTone);
        qVar.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            vc.a0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
        }
    }

    public static SpannableStringBuilder V() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < 5; i10++) {
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int dp = AndroidUtilities.dp((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            ba0 ba0Var = new ba0(null, dp, 0, null);
            ba0Var.f24955f = AndroidUtilities.dp(6.0f);
            ba0Var.h = 0.5f;
            ba0Var.f24956n = true;
            spannableStringBuilder.setSpan(ba0Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final void B(float f7) {
        va vaVar = this.e;
        org.telegram.ui.ActionBar.n5 titleTextView = vaVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
        float translationY = vaVar.getTranslationY() + AndroidUtilities.statusBarHeight;
        int height = vaVar.getHeight() - AndroidUtilities.statusBarHeight;
        ImageView imageView = this.Z;
        imageView.setTranslationY(((1.0f - f7) * AndroidUtilities.dp(28.0f)) + ((height - imageView.getHeight()) / 2.0f) + translationY);
    }

    public final boolean U() {
        TL_aicompose.AiComposeTone aiComposeTone = this.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i10 = 0;
            while (true) {
                AiTonesController aiTonesController = this.Y;
                if (i10 >= aiTonesController.tones.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = aiTonesController.tones.get(i10);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f20552id == tL_aiComposeTone.f20552id) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.loadedAiComposeTones) {
            if (U()) {
                i12 = R.string.AIEditorStyleDone;
            } else {
                i12 = R.string.AIEditorAddStyle;
            }
            this.f29698f0.setText(LocaleController.getString(i12));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21126a7);
            if (themedColor != this.f29702j0) {
                this.f29702j0 = themedColor;
                setBackgroundColor(themedColor);
                this.f29696d0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor, themedColor}));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        a71 a71Var = new a71(lm0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f29699g0 = a71Var;
        a71Var.f24646r = false;
        return a71Var;
    }

    @Override
    public final CharSequence z() {
        TL_aicompose.AiComposeTone aiComposeTone = this.X;
        if (aiComposeTone == null) {
            return "";
        }
        return aiComposeTone.title;
    }
}
