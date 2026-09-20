package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.LaunchActivity;
public final class q extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone X;
    public final AiTonesController Y;
    public final ImageView Z;
    public final FrameLayout f27471a0;
    public final TextView f27472b0;
    public final TextView f27473c0;
    public final FrameLayout f27474d0;
    public final ci.d f27475e0;
    public k61 f27476f0;
    public int f27477g0;
    public final TL_aicompose.aiComposeToneExample[] f27478h0;

    public q(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, 2, f6Var);
        int i10;
        this.f27477g0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.Y = tonesController;
        tonesController.load();
        this.X = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.f27478h0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.Z = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i11));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i11)), 1, -1));
        this.containerView.addView(imageView, w7.y5.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new n(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27471a0 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, f6Var)));
        frameLayout.addView(frameLayout2, w7.y5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        v9 v9Var = new v9(context);
        v9Var.setAnimatedEmojiDrawable(new p5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(v9Var, w7.y5.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.f27472b0 = textView;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.f27473c0 = textView2;
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.e.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.j6.f19038a7;
        this.behindKeyboardColorKey = i12;
        setBackgroundColor(getThemedColor(i12));
        vl0 vl0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.q1();
        this.d.setOnItemClickListener(new j(this, 1));
        this.L = false;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.O = true;
        p pVar = new p(this);
        pVar.f43009m = false;
        pVar.C = false;
        pVar.o(qr.h);
        pVar.n(350L);
        this.d.setItemAnimator(pVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        FrameLayout.LayoutParams e = w7.y5.e(-1, -2, 80);
        int i14 = e.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        e.leftMargin = i14 + i15;
        e.rightMargin += i15;
        this.containerView.addView(frameLayout3, e);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f27474d0 = frameLayout4;
        FrameLayout.LayoutParams d = w7.y5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(frameLayout4, d);
        ci.d g10 = org.telegram.messenger.rk.g(24, context, f6Var, true);
        this.f27475e0 = g10;
        if (U()) {
            i10 = R.string.AIEditorStyleDone;
        } else {
            i10 = R.string.AIEditorAddStyle;
        }
        g10.setText(LocaleController.getString(i10));
        g10.setOnClickListener(new ai.d0(this, aiComposeTone, f6Var, 11));
        frameLayout3.addView(g10, w7.y5.e(-1, 48, 119));
        this.f27476f0.N(false);
    }

    public static void P(q qVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.f6 f6Var) {
        ci.d dVar = qVar.f27475e0;
        if (dVar.W && !dVar.N) {
            if (qVar.U()) {
                qVar.dismiss();
                return;
            }
            dVar.setLoading(true);
            TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
            savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(savetone, new Object(), new org.telegram.tgnet.e(qVar, f6Var, aiComposeTone, 2));
        }
    }

    public static void Q(final q qVar) {
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
            return;
        }
        int i10 = qVar.f27477g0 + 1;
        qVar.f27477g0 = i10;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = qVar.f27478h0;
        if (i10 >= aicomposetoneexampleArr.length) {
            qVar.f27477g0 = 0;
        }
        final int i11 = qVar.f27477g0;
        if (aicomposetoneexampleArr[i11] == null) {
            TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
            gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            gettoneexample.num = i11;
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(gettoneexample, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    q qVar2 = q.this;
                    if (aicomposetoneexample != null) {
                        qVar2.f27478h0[i11] = aicomposetoneexample;
                        qVar2.f27476f0.N(true);
                        return;
                    }
                    qVar2.getClass();
                }
            });
        }
        qVar.f27476f0.N(true);
    }

    public static void R(q qVar, ArrayList arrayList, k61 k61Var) {
        CharSequence formatTextWithEntities;
        CharSequence formatTextWithEntities2;
        String str;
        String formatString;
        k61Var.E = 1;
        TLRPC.User user = null;
        arrayList.add(w51.B(null));
        FrameLayout frameLayout = qVar.f27471a0;
        w51 w51Var = new w51(-4);
        w51Var.f29942c = frameLayout;
        w51Var.f29961z = -1;
        w51Var.e = true;
        arrayList.add(w51Var);
        arrayList.add(w51.B(null));
        arrayList.add(w51.l(qVar.f27472b0));
        arrayList.add(w51.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(w51.l(qVar.f27473c0));
        arrayList.add(w51.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = qVar.f27478h0[qVar.f27477g0];
            k61Var.U();
            arrayList.add(o41.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new n(qVar, 1)));
            if (aicomposetoneexample == null) {
                formatTextWithEntities = V();
            } else {
                formatTextWithEntities = MessageObject.formatTextWithEntities(aicomposetoneexample.from);
            }
            arrayList.add(s41.a(4, formatTextWithEntities, false, null, null, null));
            arrayList.add(o41.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            if (aicomposetoneexample == null) {
                formatTextWithEntities2 = V();
            } else {
                formatTextWithEntities2 = MessageObject.formatTextWithEntities(aicomposetoneexample.to);
            }
            arrayList.add(s41.a(6, formatTextWithEntities2, false, null, null, null));
            k61Var.T();
            if (tL_aiComposeTone.author_id != 0) {
                user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(w51.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
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
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, v7.j0.g("@", publicUsername));
                }
                sb2.append(formatString);
                arrayList.add(w51.B(AndroidUtilities.replaceSingleLink(sb2.toString(), qVar.getThemedColor(org.telegram.ui.ActionBar.j6.gc), new org.telegram.ui.gh(26, qVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(w51.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(q qVar, org.telegram.ui.ActionBar.f6 f6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = qVar.f27474d0;
        qVar.f27475e0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(qVar.currentAccount, new xc(frameLayout, f6Var));
                return;
            } else {
                org.telegram.ui.Cells.c1.s(frameLayout, f6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(qVar.currentAccount).getTonesController().add(aiComposeTone);
        qVar.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            xc.a0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
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
            p90 p90Var = new p90(null, dp, 0, null);
            p90Var.f27195f = AndroidUtilities.dp(6.0f);
            p90Var.h = 0.5f;
            p90Var.f27196n = true;
            spannableStringBuilder.setSpan(p90Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final void A(float f7) {
        wa waVar = this.e;
        org.telegram.ui.ActionBar.j5 titleTextView = waVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
        float translationY = waVar.getTranslationY() + AndroidUtilities.statusBarHeight;
        int height = waVar.getHeight() - AndroidUtilities.statusBarHeight;
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
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f18537id == tL_aiComposeTone.f18537id) {
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
            this.f27475e0.setText(LocaleController.getString(i12));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(vl0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f27476f0 = k61Var;
        k61Var.f25678r = false;
        return k61Var;
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
