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
public final class r extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone X;
    public final AiTonesController Y;
    public final ImageView Z;
    public final FrameLayout f29852a0;
    public final TextView f29853b0;
    public final TextView f29854c0;
    public final FrameLayout f29855d0;
    public final di.d f29856e0;
    public v51 f29857f0;
    public int f29858g0;
    public final TL_aicompose.aiComposeToneExample[] f29859h0;

    public r(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, 2, f6Var);
        int i10;
        this.f29858g0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.Y = tonesController;
        tonesController.load();
        this.X = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.f29859h0 = aicomposetoneexampleArr;
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
        this.containerView.addView(imageView, w7.x5.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new o(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f29852a0 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var)));
        frameLayout.addView(frameLayout2, w7.x5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        x9 x9Var = new x9(context);
        x9Var.setAnimatedEmojiDrawable(new q5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(x9Var, w7.x5.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.f29853b0 = textView;
        textView.setTextColor(getThemedColor(i11));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.f29854c0 = textView2;
        textView2.setTextColor(getThemedColor(i11));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.f24647e.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.j6.f20607a7;
        this.behindKeyboardColorKey = i12;
        setBackgroundColor(getThemedColor(i12));
        ll0 ll0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new k(this, 1));
        this.L = false;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.O = true;
        q qVar = new q(this);
        qVar.f45777m = false;
        qVar.C = false;
        qVar.o(pr.h);
        qVar.n(350L);
        this.d.setItemAnimator(qVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        FrameLayout.LayoutParams e7 = w7.x5.e(-1, -2, 80);
        int i14 = e7.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        e7.leftMargin = i14 + i15;
        e7.rightMargin += i15;
        this.containerView.addView(frameLayout3, e7);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.f29855d0 = frameLayout4;
        FrameLayout.LayoutParams d = w7.x5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(frameLayout4, d);
        di.d g10 = org.telegram.messenger.vl.g(24, context, f6Var, true);
        this.f29856e0 = g10;
        if (U()) {
            i10 = R.string.AIEditorStyleDone;
        } else {
            i10 = R.string.AIEditorAddStyle;
        }
        g10.setText(LocaleController.getString(i10));
        g10.setOnClickListener(new bi.x(this, aiComposeTone, f6Var, 11));
        frameLayout3.addView(g10, w7.x5.e(-1, 48, 119));
        this.f29857f0.N(false);
    }

    public static void P(r rVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.f6 f6Var) {
        di.d dVar = rVar.f29856e0;
        if (dVar.W && !dVar.N) {
            if (rVar.U()) {
                rVar.dismiss();
                return;
            }
            dVar.setLoading(true);
            TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
            savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            ConnectionsManager.getInstance(rVar.currentAccount).sendRequestTyped(savetone, new Object(), new org.telegram.tgnet.e(rVar, f6Var, aiComposeTone, 2));
        }
    }

    public static void Q(final r rVar) {
        TL_aicompose.AiComposeTone aiComposeTone = rVar.X;
        if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
            return;
        }
        int i10 = rVar.f29858g0 + 1;
        rVar.f29858g0 = i10;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = rVar.f29859h0;
        if (i10 >= aicomposetoneexampleArr.length) {
            rVar.f29858g0 = 0;
        }
        final int i11 = rVar.f29858g0;
        if (aicomposetoneexampleArr[i11] == null) {
            TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
            gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
            gettoneexample.num = i11;
            ConnectionsManager.getInstance(rVar.currentAccount).sendRequestTyped(gettoneexample, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    r rVar2 = r.this;
                    if (aicomposetoneexample != null) {
                        rVar2.f29859h0[i11] = aicomposetoneexample;
                        rVar2.f29857f0.N(true);
                        return;
                    }
                    rVar2.getClass();
                }
            });
        }
        rVar.f29857f0.N(true);
    }

    public static void R(r rVar, ArrayList arrayList, v51 v51Var) {
        CharSequence formatTextWithEntities;
        CharSequence formatTextWithEntities2;
        String str;
        String formatString;
        v51Var.E = 1;
        TLRPC.User user = null;
        arrayList.add(h51.B(null));
        FrameLayout frameLayout = rVar.f29852a0;
        h51 h51Var = new h51(-4);
        h51Var.f26587c = frameLayout;
        h51Var.f26607z = -1;
        h51Var.f26588e = true;
        arrayList.add(h51Var);
        arrayList.add(h51.B(null));
        arrayList.add(h51.l(rVar.f29853b0));
        arrayList.add(h51.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(h51.l(rVar.f29854c0));
        arrayList.add(h51.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = rVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = rVar.f29859h0[rVar.f29858g0];
            v51Var.U();
            arrayList.add(z31.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new o(rVar, 1)));
            if (aicomposetoneexample == null) {
                formatTextWithEntities = V();
            } else {
                formatTextWithEntities = MessageObject.formatTextWithEntities(aicomposetoneexample.from);
            }
            arrayList.add(d41.a(4, formatTextWithEntities, false, null, null, null));
            arrayList.add(z31.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            if (aicomposetoneexample == null) {
                formatTextWithEntities2 = V();
            } else {
                formatTextWithEntities2 = MessageObject.formatTextWithEntities(aicomposetoneexample.to);
            }
            arrayList.add(d41.a(6, formatTextWithEntities2, false, null, null, null));
            v51Var.T();
            if (tL_aiComposeTone.author_id != 0) {
                user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(h51.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
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
                    formatString = LocaleController.formatString(R.string.AIEditorCreatedBy, org.telegram.ui.Cells.p6.i("@", publicUsername));
                }
                sb2.append(formatString);
                arrayList.add(h51.B(AndroidUtilities.replaceSingleLink(sb2.toString(), rVar.getThemedColor(org.telegram.ui.ActionBar.j6.gc), new org.telegram.ui.fh(26, rVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(h51.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(r rVar, org.telegram.ui.ActionBar.f6 f6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = rVar.f29855d0;
        rVar.f29856e0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                f0.o0(rVar.currentAccount, new yc(frameLayout, f6Var));
                return;
            } else {
                org.telegram.ui.Cells.p6.q(frameLayout, f6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(rVar.currentAccount).getTonesController().add(aiComposeTone);
        rVar.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            yc.a0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
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
            i90 i90Var = new i90(null, dp, 0, null);
            i90Var.f27052f = AndroidUtilities.dp(6.0f);
            i90Var.h = 0.5f;
            i90Var.f27053n = true;
            spannableStringBuilder.setSpan(i90Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override
    public final void B(float f7) {
        xa xaVar = this.f24647e;
        org.telegram.ui.ActionBar.j5 titleTextView = xaVar.getTitleTextView();
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
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).f20081id == tL_aiComposeTone.f20081id) {
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
            this.f29856e0.setText(LocaleController.getString(i12));
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
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f29857f0 = v51Var;
        v51Var.f31135r = false;
        return v51Var;
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
