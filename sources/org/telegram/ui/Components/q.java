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
public final class q extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone X;
    public final AiTonesController Y;
    public final ImageView Z;
    public final FrameLayout f27460a0;
    public final TextView f27461b0;
    public final TextView f27462c0;
    public final FrameLayout f27463d0;
    public final ci.d f27464e0;
    public j61 f27465f0;
    public int f27466g0;
    public final TL_aicompose.aiComposeToneExample[] f27467h0;

    public q(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, 2, d6Var);
        int i10;
        this.f27466g0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.Y = tonesController;
        tonesController.load();
        this.X = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.f27467h0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.Z = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(getThemedColor(i11));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.l1(0.1f, getThemedColor(i11)), 1, -1));
        this.containerView.addView(imageView, w7.y5.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.a6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new n(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f27460a0 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var)));
        frameLayout.addView(frameLayout2, w7.y5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        w9 w9Var = new w9(context);
        w9Var.setAnimatedEmojiDrawable(new q5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(w9Var, w7.y5.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.f27461b0 = textView;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.f27462c0 = textView2;
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.e.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.h6.f19004a7;
        this.behindKeyboardColorKey = i12;
        setBackgroundColor(getThemedColor(i12));
        wl0 wl0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new j(this, 1));
        this.L = false;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.O = true;
        p pVar = new p(this);
        pVar.f42996m = false;
        pVar.C = false;
        pVar.o(rr.h);
        pVar.n(350L);
        this.d.setItemAnimator(pVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.l1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        FrameLayout.LayoutParams e = w7.y5.e(-1, -2, 80);
        int i14 = e.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        e.leftMargin = i14 + i15;
        e.rightMargin += i15;
        this.containerView.addView(frameLayout3, e);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f27463d0 = frameLayout4;
        FrameLayout.LayoutParams d = w7.y5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(frameLayout4, d);
        ci.d g10 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        this.f27464e0 = g10;
        if (U()) {
            i10 = R.string.AIEditorStyleDone;
        } else {
            i10 = R.string.AIEditorAddStyle;
        }
        g10.setText(LocaleController.getString(i10));
        g10.setOnClickListener(new ai.d0(this, aiComposeTone, d6Var, 11));
        frameLayout3.addView(g10, w7.y5.e(-1, 48, 119));
        this.f27465f0.N(false);
    }

    public static void P(q qVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.d6 d6Var) {
        ci.d dVar = qVar.f27464e0;
        if (dVar.W && !dVar.N) {
            if (qVar.U()) {
                qVar.dismiss();
                return;
            }
            dVar.setLoading(true);
            TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
            savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(savetone, new Object(), new org.telegram.tgnet.e(qVar, d6Var, aiComposeTone, 2));
        }
    }

    public static void Q(final q qVar) {
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
            return;
        }
        int i10 = qVar.f27466g0 + 1;
        qVar.f27466g0 = i10;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = qVar.f27467h0;
        if (i10 >= aicomposetoneexampleArr.length) {
            qVar.f27466g0 = 0;
        }
        final int i11 = qVar.f27466g0;
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
                        qVar2.f27467h0[i11] = aicomposetoneexample;
                        qVar2.f27465f0.N(true);
                        return;
                    }
                    qVar2.getClass();
                }
            });
        }
        qVar.f27465f0.N(true);
    }

    public static void R(q qVar, ArrayList arrayList, j61 j61Var) {
        CharSequence formatTextWithEntities;
        CharSequence formatTextWithEntities2;
        String str;
        String formatString;
        j61Var.E = 1;
        TLRPC.User user = null;
        arrayList.add(v51.B(null));
        FrameLayout frameLayout = qVar.f27460a0;
        v51 v51Var = new v51(-4);
        v51Var.f29043c = frameLayout;
        v51Var.f29062z = -1;
        v51Var.e = true;
        arrayList.add(v51Var);
        arrayList.add(v51.B(null));
        arrayList.add(v51.l(qVar.f27461b0));
        arrayList.add(v51.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(v51.l(qVar.f27462c0));
        arrayList.add(v51.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = qVar.f27467h0[qVar.f27466g0];
            j61Var.U();
            arrayList.add(n41.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new n(qVar, 1)));
            if (aicomposetoneexample == null) {
                formatTextWithEntities = V();
            } else {
                formatTextWithEntities = MessageObject.formatTextWithEntities(aicomposetoneexample.from);
            }
            arrayList.add(r41.a(4, formatTextWithEntities, false, null, null, null));
            arrayList.add(n41.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            if (aicomposetoneexample == null) {
                formatTextWithEntities2 = V();
            } else {
                formatTextWithEntities2 = MessageObject.formatTextWithEntities(aicomposetoneexample.to);
            }
            arrayList.add(r41.a(6, formatTextWithEntities2, false, null, null, null));
            j61Var.T();
            if (tL_aiComposeTone.author_id != 0) {
                user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(v51.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
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
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, v7.j.g("@", publicUsername));
                }
                sb2.append(formatString);
                arrayList.add(v51.B(AndroidUtilities.replaceSingleLink(sb2.toString(), qVar.getThemedColor(org.telegram.ui.ActionBar.h6.gc), new org.telegram.ui.fh(25, qVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(v51.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(q qVar, org.telegram.ui.ActionBar.d6 d6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = qVar.f27463d0;
        qVar.f27464e0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(qVar.currentAccount, new xc(frameLayout, d6Var));
                return;
            } else {
                org.telegram.ui.Cells.c1.r(frameLayout, d6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(qVar.currentAccount).getTonesController().add(aiComposeTone);
        qVar.dismiss();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
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
            s90 s90Var = new s90(null, dp, 0, null);
            s90Var.f28212f = AndroidUtilities.dp(6.0f);
            s90Var.h = 0.5f;
            s90Var.f28213n = true;
            spannableStringBuilder.setSpan(s90Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final void A(float f7) {
        xa xaVar = this.e;
        org.telegram.ui.ActionBar.h5 titleTextView = xaVar.getTitleTextView();
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
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f18545id == tL_aiComposeTone.f18545id) {
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
            this.f27464e0.setText(LocaleController.getString(i12));
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
    public final vl0 v(wl0 wl0Var) {
        j61 j61Var = new j61(wl0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f27465f0 = j61Var;
        j61Var.f25291r = false;
        return j61Var;
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
