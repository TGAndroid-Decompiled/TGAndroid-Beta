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
public final class q extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone X;
    public final AiTonesController Y;
    public final ImageView Z;
    public final FrameLayout f31742a0;
    public final TextView f31743b0;
    public final TextView f31744c0;
    public final FrameLayout f31745d0;
    public final FrameLayout f31746e0;
    public final fi.d f31747f0;
    public j71 f31748g0;
    public int f31749h0;
    public final TL_aicompose.aiComposeToneExample[] f31750i0;
    public int f31751j0;

    public q(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, false, false, 2, u6Var);
        int i10;
        this.f31749h0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.Y = tonesController;
        tonesController.load();
        this.X = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.f31750i0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.Z = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i11)), 1, -1);
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.1f, i11);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, L, u6Var);
        this.containerView.addView(imageView, gb1.h(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        gb1.c(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new n(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31742a0 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(100.0f);
        int i12 = org.telegram.ui.ActionBar.y6.f23356d6;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, K, N, null, u6Var);
        frameLayout.addView(frameLayout2, gb1.h(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        y9 y9Var = new y9(context);
        y9Var.setAnimatedEmojiDrawable(new t5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(y9Var, gb1.i(64, 64, 17));
        TextView textView = new TextView(context);
        this.f31743b0 = textView;
        org.telegram.messenger.t.r(textView, i11, u6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.f31744c0 = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i11, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.e.setTitle(aiComposeTone.title);
        int i13 = org.telegram.ui.ActionBar.y6.f23299a7;
        this.behindKeyboardColorKey = i13;
        setBackgroundColor(getThemedColor(i13));
        mm0 mm0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.u1();
        this.d.setOnItemClickListener(new j(this, 1));
        this.L = false;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.O = true;
        p pVar = new p(this);
        pVar.f47763m = false;
        pVar.C = false;
        pVar.o(ds.h);
        pVar.n(350L);
        this.d.setItemAnimator(pVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f31745d0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, getThemedColor(i13)), getThemedColor(i13), getThemedColor(i13)}));
        FrameLayout.LayoutParams i15 = gb1.i(-1, -2, 80);
        int i16 = i15.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        i15.leftMargin = i16 + i17;
        i15.rightMargin += i17;
        this.containerView.addView(frameLayout3, i15);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f31746e0 = frameLayout4;
        FrameLayout.LayoutParams h = gb1.h(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i18 = h.leftMargin;
        int i19 = this.backgroundPaddingLeft;
        h.leftMargin = i18 + i19;
        h.rightMargin += i19;
        this.containerView.addView(frameLayout4, h);
        fi.d f7 = org.telegram.messenger.vh.f(24, context, u6Var, true);
        this.f31747f0 = f7;
        if (U()) {
            i10 = R.string.AIEditorStyleDone;
        } else {
            i10 = R.string.AIEditorAddStyle;
        }
        f7.setText(LocaleController.getString(i10));
        f7.setOnClickListener(new bi.w0(this, aiComposeTone, u6Var, 14));
        frameLayout3.addView(f7, gb1.i(-1, 48, 119));
        this.f31748g0.O(false);
    }

    public static void P(q qVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.u6 u6Var) {
        fi.d dVar = qVar.f31747f0;
        if (dVar.f10687c0 && !dVar.Q) {
            if (qVar.U()) {
                qVar.dismiss();
                return;
            }
            dVar.setLoading(true);
            TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
            savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(savetone, new Object(), new bi.t0(qVar, u6Var, aiComposeTone, 4));
        }
    }

    public static void Q(q qVar) {
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
            return;
        }
        int i10 = qVar.f31749h0 + 1;
        qVar.f31749h0 = i10;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = qVar.f31750i0;
        if (i10 >= aicomposetoneexampleArr.length) {
            qVar.f31749h0 = 0;
        }
        int i11 = qVar.f31749h0;
        if (aicomposetoneexampleArr[i11] == null) {
            TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
            gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            gettoneexample.num = i11;
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(gettoneexample, new Object(), new o(qVar, i11, 0));
        }
        qVar.f31748g0.O(true);
    }

    public static void R(q qVar, ArrayList arrayList, j71 j71Var) {
        CharSequence formatTextWithEntities;
        CharSequence formatTextWithEntities2;
        String str;
        String formatString;
        j71Var.F = 1;
        TLRPC.User user = null;
        arrayList.add(t61.C(null));
        FrameLayout frameLayout = qVar.f31742a0;
        t61 t61Var = new t61(-4);
        t61Var.f32869c = frameLayout;
        t61Var.f32888z = -1;
        t61Var.e = true;
        arrayList.add(t61Var);
        arrayList.add(t61.C(null));
        arrayList.add(t61.m(qVar.f31743b0));
        arrayList.add(t61.D(AndroidUtilities.dp(1.0f)));
        arrayList.add(t61.m(qVar.f31744c0));
        arrayList.add(t61.D(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = qVar.f31750i0[qVar.f31749h0];
            j71Var.V();
            arrayList.add(l51.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new n(qVar, 1)));
            if (aicomposetoneexample == null) {
                formatTextWithEntities = V();
            } else {
                formatTextWithEntities = MessageObject.formatTextWithEntities(aicomposetoneexample.from);
            }
            arrayList.add(p51.a(4, formatTextWithEntities, false, null, null, null));
            arrayList.add(l51.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            if (aicomposetoneexample == null) {
                formatTextWithEntities2 = V();
            } else {
                formatTextWithEntities2 = MessageObject.formatTextWithEntities(aicomposetoneexample.to);
            }
            arrayList.add(p51.a(6, formatTextWithEntities2, false, null, null, null));
            j71Var.U();
            if (tL_aiComposeTone.author_id != 0) {
                user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(t61.C(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
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
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, b10.j("@", publicUsername));
                }
                sb2.append(formatString);
                arrayList.add(t61.C(AndroidUtilities.replaceSingleLinkKey(sb2.toString(), org.telegram.ui.ActionBar.y6.gc, qVar.resourcesProvider, new org.telegram.ui.ip(4, qVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(t61.D(AndroidUtilities.dp(32.0f)));
    }

    public static void S(q qVar, org.telegram.ui.ActionBar.u6 u6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = qVar.f31746e0;
        qVar.f31747f0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(qVar.currentAccount, new wc(frameLayout, u6Var));
                return;
            } else {
                org.telegram.ui.d3.t(frameLayout, u6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(qVar.currentAccount).getTonesController().add(aiComposeTone);
        qVar.dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            wc.b0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
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
            ea0 ea0Var = new ea0(null, dp, 0, null);
            ea0Var.f27792f = AndroidUtilities.dp(6.0f);
            ea0Var.h = 0.5f;
            ea0Var.f27793n = true;
            spannableStringBuilder.setSpan(ea0Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final void B(float f7) {
        xa xaVar = this.e;
        org.telegram.ui.ActionBar.b6 titleTextView = xaVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
        float translationY = xaVar.getTranslationY() + AndroidUtilities.statusBarHeight;
        int height = xaVar.getHeight() - AndroidUtilities.statusBarHeight;
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
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f22238id == tL_aiComposeTone.f22238id) {
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
            this.f31747f0.setText(LocaleController.getString(i12));
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23299a7);
            if (themedColor != this.f31751j0) {
                this.f31751j0 = themedColor;
                setBackgroundColor(themedColor);
                this.f31745d0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor, themedColor}));
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
    public final lm0 v(mm0 mm0Var) {
        j71 j71Var = new j71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f31748g0 = j71Var;
        j71Var.f29507r = false;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        TL_aicompose.AiComposeTone aiComposeTone = this.X;
        if (aiComposeTone == null) {
            return "";
        }
        return aiComposeTone.title;
    }
}
