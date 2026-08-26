package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsIntroActivity$$ExternalSyntheticLambda10;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public abstract class LiveCommentsView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final AnonymousClass2 adapter;
    public boolean allowTouches;
    public Bulletin.UndoButton bulletinButton;
    public Bulletin.TwoLineAnimatedLottieLayout bulletinLayout;
    public boolean callHighlight;
    public final LiveCommentsView$$ExternalSyntheticLambda2 closeBulletin;
    public ValueAnimator collapseAnimator;
    public boolean collapsed;
    public final int currentAccount;
    public long dialogId;
    public final GradientClip gradientClip;
    public boolean hasTopMessages;
    public long highlightingDialog;
    public int highlightingMessageId;
    public TLRPC.InputGroupCall inputCall;
    public float keyboardFinalOffset;
    public float keyboardOffset;
    public long lastMinStars;
    public final LinearLayoutManager layoutManager;
    public final ChatActivity.AnonymousClass34 listView;
    public LivePlayer livePlayer;
    public long localStars;
    public int maxReadId;
    public final ArrayList messages;
    public final LiveCommentsView$$ExternalSyntheticLambda2 pollStarsRunnable;
    public boolean polling;
    public LivePlayer$1$$ExternalSyntheticLambda0 removeTopSendersRunnable;
    public boolean sentStars;
    public final View shadowView;
    public Bulletin starsBulletin;
    public Bulletin.TimerView timerView;
    public final UniversalAdapter topAdapter;
    public final FrameLayout topBulletinContainer;
    public ArrayList topDonors;
    public final LinearLayoutManager topLayoutManager;
    public final MessageSeenView.AnonymousClass1 topListView;
    public final ArrayList topMessages;
    public final HashMap topPlaces;
    public long totalStars;
    public final LiveCommentsView$$ExternalSyntheticLambda2 updateAdapters;

    public final class AnonymousClass5 extends DefaultItemAnimator {
        @Override
        public final float animateByScale(View view) {
            return 0.5f;
        }
    }

    public final class AnonymousClass8 extends DarkThemeResourceProvider {
        @Override
        public final void appendColors() {
            this.sparseIntArray.append(Theme.key_dialogBackground, -14671840);
        }
    }

    public final class CrownDrawable extends Drawable {
        public final Drawable crown;
        public final float scale = 0.75f;
        public final Text text;

        public CrownDrawable(Context context, int i) {
            this.crown = context.getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
            Text text = new Text(DiffUtil.m(i, ""), 8.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            this.text = text;
            text.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        @Override
        public final void draw(Canvas canvas) {
            Rect bounds = getBounds();
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            Drawable drawable = this.crown;
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            this.text.draw(bounds.centerX() - (this.text.width / 2.0f), AndroidUtilities.dp(0.15f) + bounds.centerY(), drawable.getAlpha() / 255.0f, -1, canvas);
            canvas.restore();
        }

        @Override
        public final int getAlpha() {
            return this.crown.getAlpha();
        }

        @Override
        public final int getIntrinsicHeight() {
            return (int) (this.crown.getIntrinsicHeight() * this.scale);
        }

        @Override
        public final int getIntrinsicWidth() {
            return (int) (this.crown.getIntrinsicWidth() * this.scale);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            this.crown.setAlpha(i);
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            this.crown.setColorFilter(colorFilter);
        }
    }

    public final class LiveCommentView extends FrameLayout implements ItemOptions.ScrimView {
        public final LinearLayout adminLayout;
        public final SpoilersTextView adminNameView;
        public final SpoilersTextView adminRoleView;
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarView;
        public Drawable background;
        public final Paint backgroundPaint;
        public float backgroundViewAlpha;
        public final int currentAccount;
        public boolean drawParticles;
        public boolean drawStar;
        public final boolean filled;
        public ValueAnimator highlightAnimator;
        public int highlightingMessageId;
        public final ColorPicker.AnonymousClass1 layout;
        public Message message;
        public final TextView smallStarsView;
        public final ColoredImageSpan[] smallStarsViewCache;
        public final TextView starsView;
        public final ColoredImageSpan[] starsViewCache;
        public CharSequence text;
        public final SpoilersTextView textView;

        public final class AlphaSpan extends CharacterStyle {
            public final float alpha = 0.75f;

            @Override
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setAlpha((int) (this.alpha * textPaint.getAlpha()));
            }
        }

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((LiveCommentView) view).set((Message) uItem.object);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                LiveCommentView liveCommentView = new LiveCommentView(i, context, false);
                liveCommentView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                return liveCommentView;
            }

            @Override
            public final boolean equals(UItem uItem, UItem uItem2) {
                return uItem.object == uItem2.object;
            }
        }

        public LiveCommentView(int i, Context context, boolean z) {
            super(context);
            this.drawParticles = false;
            this.drawStar = true;
            this.backgroundViewAlpha = 0.5f;
            this.starsViewCache = new ColoredImageSpan[1];
            this.smallStarsViewCache = new ColoredImageSpan[1];
            this.backgroundPaint = new Paint(1);
            this.currentAccount = i;
            this.filled = z;
            ColorPicker.AnonymousClass1 anonymousClass1 = new ColorPicker.AnonymousClass1(this, context);
            this.layout = anonymousClass1;
            anonymousClass1.setOrientation(0);
            addView(anonymousClass1, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(11.0f));
            anonymousClass1.addView(backupImageView, LayoutHelper.createLinear(22, 22, 0.0f, 51, 3, 2, 3, 2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            anonymousClass1.addView(linearLayout, LayoutHelper.createLinear(-2, -2, 1.0f, 51, 4, 3, 7, 3));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.adminLayout = linearLayout2;
            linearLayout2.setOrientation(0);
            linearLayout2.setVisibility(8);
            linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, -2));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, null, true);
            this.adminNameView = spoilersTextView;
            spoilersTextView.setTextColor(-1);
            spoilersTextView.setTextSize(1, 14.0f);
            spoilersTextView.setGravity(3);
            spoilersTextView.setTypeface(AndroidUtilities.bold());
            linearLayout2.addView(spoilersTextView, LayoutHelper.createLinear(-2, -2, 1.0f, 51, 0, 0, 16, 0));
            SpoilersTextView spoilersTextView2 = new SpoilersTextView(context, null, true);
            this.adminRoleView = spoilersTextView2;
            spoilersTextView2.setTextColor(Theme.multAlpha(0.55f, -1));
            spoilersTextView2.setTextSize(1, 12.0f);
            spoilersTextView2.setGravity(5);
            linearLayout2.addView(spoilersTextView2, LayoutHelper.createLinear(-2, -2, 0.0f, 53, 0, 0, 0, 0));
            SpoilersTextView spoilersTextView3 = new SpoilersTextView(context, null, true);
            this.textView = spoilersTextView3;
            spoilersTextView3.setTextColor(-1);
            spoilersTextView3.setTextSize(1, 14.0f);
            spoilersTextView3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), Theme.multAlpha(0.6f, -16777216));
            NotificationCenter.listenEmojiLoading(spoilersTextView3);
            linearLayout.addView(spoilersTextView3, LayoutHelper.createLinear(-2, -2));
            TextView textView = new TextView(context);
            this.starsView = textView;
            textView.setTextColor(-1);
            textView.setTextSize(1, 11.0f);
            textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
            textView.setVisibility(8);
            anonymousClass1.addView(textView, LayoutHelper.createLinear(-2, 16, 0.0f, 21, -3, 0, 6, 0));
            TextView textView2 = new TextView(context);
            this.smallStarsView = textView2;
            textView2.setTextColor(-1);
            textView2.setAlpha(0.65f);
            textView2.setTextSize(1, 11.0f);
            textView2.setVisibility(8);
            anonymousClass1.addView(textView2, LayoutHelper.createLinear(-2, -2, 0.0f, 85, 0, 3, 10, 0));
        }

        @Override
        public final void drawScrim(Canvas canvas, float f) {
            ColorPicker.AnonymousClass1 anonymousClass1 = this.layout;
            if (anonymousClass1.getBackground() == null) {
                Paint paint = this.backgroundPaint;
                paint.setColor(Theme.multAlpha(f * 0.5f, -16777216));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(anonymousClass1.getX(), anonymousClass1.getY(), anonymousClass1.getX() + anonymousClass1.getWidth(), anonymousClass1.getY() + anonymousClass1.getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
            }
            draw(canvas);
        }

        @Override
        public final void getBounds(RectF rectF) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        }

        public final void highlight() {
            ValueAnimator valueAnimator = this.highlightAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.highlightAnimator = null;
                Drawable drawable = this.background;
                if (drawable != null) {
                    drawable.setAlpha((int) (this.backgroundViewAlpha * 255.0f));
                    this.layout.invalidate();
                }
            }
            Message message = this.message;
            if (message == null || this.background == null) {
                return;
            }
            this.highlightingMessageId = message.id;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.highlightAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 23));
            this.highlightAnimator.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 19));
            this.highlightAnimator.setDuration(350L);
            this.highlightAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.highlightAnimator.start();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setPivotX(0.0f);
            setPivotY(getMeasuredHeight());
        }

        public void set(Message message) {
            ValueAnimator valueAnimator;
            String forcedFirstName;
            ColorPicker.AnonymousClass1 anonymousClass1;
            int i;
            int i2;
            int tierOption;
            int tierOption2;
            TLRPC.TL_textWithEntities tL_textWithEntities;
            ColorPicker.AnonymousClass1 anonymousClass2;
            int i3;
            long j;
            TextView textView;
            TextView textView2;
            View view;
            boolean z;
            float f;
            ColoredImageSpan coloredImageSpan;
            CharSequence charSequenceSuperTrim;
            CharSequence charSequence;
            AnimatedEmojiSpan[] animatedEmojiSpanArr;
            Emoji.EmojiSpan[] emojiSpanArr;
            this.message = message;
            ColorPicker.AnonymousClass1 anonymousClass3 = this.layout;
            if ((message == null || this.highlightingMessageId != message.id) && (valueAnimator = this.highlightAnimator) != null) {
                valueAnimator.cancel();
                this.highlightAnimator = null;
                Drawable drawable = this.background;
                if (drawable != null) {
                    drawable.setAlpha((int) (this.backgroundViewAlpha * 255.0f));
                    anonymousClass3.invalidate();
                }
            }
            long j2 = message.dialogId;
            BackupImageView backupImageView = this.avatarView;
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            int i4 = this.currentAccount;
            if (j2 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i4).getUser(Long.valueOf(message.dialogId));
                avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                backupImageView.onNewImageSet();
                forcedFirstName = UserObject.getForcedFirstName(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i4).getChat(Long.valueOf(-message.dialogId));
                avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                backupImageView.onNewImageSet();
                forcedFirstName = chat == null ? "" : chat.title;
            }
            int tierOption3 = HighlightMessageSheet.getTierOption(i4, (int) message.stars, 3);
            int tierOption4 = HighlightMessageSheet.getTierOption(i4, (int) message.stars, 4);
            int tierOption5 = HighlightMessageSheet.getTierOption(i4, (int) message.stars, 5);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z2 = message.fromAdmin;
            SpoilersTextView spoilersTextView = this.textView;
            String str = " ";
            boolean z3 = this.filled;
            if (z2) {
                anonymousClass1 = anonymousClass3;
                if (message.stars <= 0) {
                    z3 = z3;
                }
                tierOption = HighlightMessageSheet.getTierOption(i4, (int) message.stars, 1);
                tierOption2 = HighlightMessageSheet.getTierOption(i4, (int) message.stars, 2);
                tL_textWithEntities = message.text;
                if (tL_textWithEntities != null) {
                    CharSequence textWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, spoilersTextView.getPaint());
                    this.text = textWithEntities;
                    charSequenceSuperTrim = AndroidUtilities.superTrim(textWithEntities);
                    this.text = charSequenceSuperTrim;
                    if (charSequenceSuperTrim.length() > tierOption && !message.fromAdmin) {
                        this.text = this.text.subSequence(0, tierOption);
                    }
                    charSequence = this.text;
                    if (charSequence instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequence;
                        animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannable.getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
                        anonymousClass2 = anonymousClass1;
                        emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.text.length(), Emoji.EmojiSpan.class);
                        if (animatedEmojiSpanArr.length + emojiSpanArr.length <= tierOption2 && !message.fromAdmin) {
                            ArrayList arrayList = new ArrayList();
                            int i5 = 0;
                            while (i5 < animatedEmojiSpanArr.length) {
                                AnimatedEmojiSpan[] animatedEmojiSpanArr2 = animatedEmojiSpanArr;
                                int i6 = i5;
                                arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(animatedEmojiSpanArr2[i5])), Integer.valueOf(spannable.getSpanEnd(animatedEmojiSpanArr2[i6]))));
                                i5 = i6 + 1;
                                animatedEmojiSpanArr = animatedEmojiSpanArr2;
                            }
                            int i7 = 0;
                            while (i7 < emojiSpanArr.length) {
                                int i8 = i7;
                                arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i7])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i8]))));
                                i7 = i8 + 1;
                            }
                            Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda3(14));
                            if (!(this.text instanceof SpannableStringBuilder)) {
                                this.text = new SpannableStringBuilder(this.text);
                            }
                            for (int size = arrayList.size() - 1; size >= tierOption2; size--) {
                                Pair pair = (Pair) arrayList.get(size);
                                ((SpannableStringBuilder) this.text).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                            }
                        }
                    } else {
                        anonymousClass2 = anonymousClass1;
                    }
                    if (!message.fromAdmin) {
                        this.text = AndroidUtilities.replaceNewLines(this.text);
                    }
                    spannableStringBuilder.append(this.text);
                } else {
                    str = " ";
                    anonymousClass2 = anonymousClass1;
                    this.text = "";
                }
                spoilersTextView.setText(Emoji.replaceEmoji(spannableStringBuilder, spoilersTextView.getPaint().getFontMetricsInt(), false));
                this.background = null;
                LinearLayout linearLayout = this.adminLayout;
                if (message.fromAdmin || message.stars > 0) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                linearLayout.setVisibility(i3);
                j = message.stars;
                textView = this.smallStarsView;
                textView2 = this.starsView;
                if (j > 0) {
                    if (j >= 250) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.drawParticles = z;
                    view = anonymousClass2;
                    view.setWillNotDraw(!z);
                    view.invalidate();
                    spoilersTextView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int iDp = AndroidUtilities.dp(13.0f);
                    int i9 = Theme.default_shadow_color;
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{tierOption3, tierOption4});
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(iDp);
                    this.background = gradientDrawable;
                    view.setBackground(gradientDrawable);
                    Drawable drawable2 = this.background;
                    if (z3) {
                        f = 1.0f;
                    } else {
                        f = 0.65f;
                    }
                    this.backgroundViewAlpha = f;
                    drawable2.setAlpha((int) (f * 255.0f));
                    if (message.isReaction) {
                        textView.setVisibility(8);
                        textView.setText("");
                        textView2.setVisibility(0);
                        textView2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), Theme.multAlpha(0.25f, tierOption5)));
                        textView2.setText(StarsIntroActivity.replaceStars(false, BillingController$$ExternalSyntheticOutline0.m(message.stars, ',', new StringBuilder("⭐️ ")), 0.75f, this.starsViewCache, AndroidUtilities.dp(0.66f), 1.0f));
                        coloredImageSpan = this.starsViewCache[0];
                        if (coloredImageSpan != null) {
                            coloredImageSpan.draw = this.drawStar;
                        }
                    } else {
                        textView.setVisibility(0);
                        textView.setText(StarsIntroActivity.replaceStars(false, BillingController$$ExternalSyntheticOutline0.m(message.stars, ',', new StringBuilder("⭐️ ")), 0.75f, this.smallStarsViewCache, 0.0f, 1.0f));
                        textView2.setVisibility(8);
                        textView2.setText("");
                    }
                } else {
                    view = anonymousClass2;
                    if (message.fromAdmin) {
                        this.drawParticles = false;
                        view.setWillNotDraw(true);
                        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), -16777216);
                        this.background = shapeDrawableCreateRoundRectDrawable;
                        view.setBackground(shapeDrawableCreateRoundRectDrawable);
                        Drawable drawable3 = this.background;
                        this.backgroundViewAlpha = 0.5f;
                        drawable3.setAlpha((int) 127.5f);
                        spoilersTextView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) DialogObject.getName(i4, message.dialogId));
                        spannableStringBuilder2.append((CharSequence) str);
                        int length = spannableStringBuilder2.length();
                        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
                        spannableStringBuilder2.setSpan(new ReplacementSpan() {
                            public final RectF rect = new RectF();
                            public final Paint bg = new Paint(1);
                            public final Text text = new Text(LocaleController.getString(R.string.LiveStoryBadge), 8.0f, AndroidUtilities.bold());

                            @Override
                            public final void draw(Canvas canvas, CharSequence charSequence2, int i10, int i11, float f2, int i12, int i13, int i14, Paint paint) {
                                float fDp = ((i12 + i14) / 2.0f) + AndroidUtilities.dp(0.0f);
                                RectF rectF = this.rect;
                                rectF.set(f2, fDp - AndroidUtilities.dp(6.0f), this.text.getWidth() + f2 + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(6.0f) + fDp);
                                Paint paint2 = this.bg;
                                paint2.setColor(-572850);
                                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                                this.text.draw(AndroidUtilities.dp(4.0f) + f2, fDp, 1.0f, -1, canvas);
                            }

                            @Override
                            public final int getSize(Paint paint, CharSequence charSequence2, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
                                return (int) (this.text.getWidth() + AndroidUtilities.dp(8.0f));
                            }
                        }, length, spannableStringBuilder2.length(), 33);
                        this.adminNameView.setText(spannableStringBuilder2);
                        this.adminRoleView.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
                        textView.setVisibility(8);
                        textView2.setVisibility(8);
                    } else {
                        this.drawParticles = false;
                        view.setWillNotDraw(true);
                        spoilersTextView.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), Theme.multAlpha(0.6f, -16777216));
                        this.background = null;
                        view.setBackground(null);
                        textView.setVisibility(8);
                        textView2.setVisibility(8);
                    }
                }
                view.invalidate();
            }
            anonymousClass1 = anonymousClass3;
            if (message.place > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + message.place));
                ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(0, new CrownDrawable(getContext(), message.place));
                coloredImageSpan2.setTranslateY((float) AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(coloredImageSpan2, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            }
            spannableStringBuilder.append(TextUtils.ellipsize(forcedFirstName, spoilersTextView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
            if (z3 != 0) {
                i = 0;
                i2 = 33;
                spannableStringBuilder.setSpan(new AlphaSpan(), 0, spannableStringBuilder.length(), 33);
            } else {
                i = 0;
                i2 = 33;
            }
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), i, spannableStringBuilder.length(), i2);
            spannableStringBuilder.append((CharSequence) " ");
            tierOption = HighlightMessageSheet.getTierOption(i4, (int) message.stars, 1);
            tierOption2 = HighlightMessageSheet.getTierOption(i4, (int) message.stars, 2);
            tL_textWithEntities = message.text;
            if (tL_textWithEntities != null) {
                CharSequence textWithEntities2 = MessageObject.formatTextWithEntities(tL_textWithEntities, false, spoilersTextView.getPaint());
                this.text = textWithEntities2;
                charSequenceSuperTrim = AndroidUtilities.superTrim(textWithEntities2);
                this.text = charSequenceSuperTrim;
                if (charSequenceSuperTrim.length() > tierOption) {
                    this.text = this.text.subSequence(0, tierOption);
                }
                charSequence = this.text;
                if (charSequence instanceof Spannable) {
                    Spannable spannable2 = (Spannable) charSequence;
                    animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannable2.getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
                    anonymousClass2 = anonymousClass1;
                    emojiSpanArr = (Emoji.EmojiSpan[]) spannable2.getSpans(0, this.text.length(), Emoji.EmojiSpan.class);
                    if (animatedEmojiSpanArr.length + emojiSpanArr.length <= tierOption2) {
                    }
                } else {
                    anonymousClass2 = anonymousClass1;
                }
                if (!message.fromAdmin) {
                    this.text = AndroidUtilities.replaceNewLines(this.text);
                }
                spannableStringBuilder.append(this.text);
            } else {
                str = " ";
                anonymousClass2 = anonymousClass1;
                this.text = "";
            }
            spoilersTextView.setText(Emoji.replaceEmoji(spannableStringBuilder, spoilersTextView.getPaint().getFontMetricsInt(), false));
            this.background = null;
            LinearLayout linearLayout2 = this.adminLayout;
            if (message.fromAdmin) {
                i3 = 8;
            } else {
                i3 = 8;
            }
            linearLayout2.setVisibility(i3);
            j = message.stars;
            textView = this.smallStarsView;
            textView2 = this.starsView;
            if (j > 0) {
                if (j >= 250) {
                    z = true;
                } else {
                    z = false;
                }
                this.drawParticles = z;
                view = anonymousClass2;
                view.setWillNotDraw(!z);
                view.invalidate();
                spoilersTextView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                int iDp2 = AndroidUtilities.dp(13.0f);
                int i10 = Theme.default_shadow_color;
                GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{tierOption3, tierOption4});
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(iDp2);
                this.background = gradientDrawable2;
                view.setBackground(gradientDrawable2);
                Drawable drawable4 = this.background;
                if (z3) {
                    f = 0.65f;
                } else {
                    f = 1.0f;
                }
                this.backgroundViewAlpha = f;
                drawable4.setAlpha((int) (f * 255.0f));
                if (message.isReaction) {
                    textView.setVisibility(0);
                    textView.setText(StarsIntroActivity.replaceStars(false, BillingController$$ExternalSyntheticOutline0.m(message.stars, ',', new StringBuilder("⭐️ ")), 0.75f, this.smallStarsViewCache, 0.0f, 1.0f));
                    textView2.setVisibility(8);
                    textView2.setText("");
                } else {
                    textView.setVisibility(8);
                    textView.setText("");
                    textView2.setVisibility(0);
                    textView2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), Theme.multAlpha(0.25f, tierOption5)));
                    textView2.setText(StarsIntroActivity.replaceStars(false, BillingController$$ExternalSyntheticOutline0.m(message.stars, ',', new StringBuilder("⭐️ ")), 0.75f, this.starsViewCache, AndroidUtilities.dp(0.66f), 1.0f));
                    coloredImageSpan = this.starsViewCache[0];
                    if (coloredImageSpan != null) {
                        coloredImageSpan.draw = this.drawStar;
                    }
                }
            } else {
                view = anonymousClass2;
                if (message.fromAdmin) {
                    this.drawParticles = false;
                    view.setWillNotDraw(true);
                    ShapeDrawable shapeDrawableCreateRoundRectDrawable2 = Theme.createRoundRectDrawable(AndroidUtilities.dp(13.0f), -16777216);
                    this.background = shapeDrawableCreateRoundRectDrawable2;
                    view.setBackground(shapeDrawableCreateRoundRectDrawable2);
                    Drawable drawable5 = this.background;
                    this.backgroundViewAlpha = 0.5f;
                    drawable5.setAlpha((int) 127.5f);
                    spoilersTextView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) DialogObject.getName(i4, message.dialogId));
                    spannableStringBuilder3.append((CharSequence) str);
                    int length2 = spannableStringBuilder3.length();
                    spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
                    spannableStringBuilder3.setSpan(new ReplacementSpan() {
                        public final RectF rect = new RectF();
                        public final Paint bg = new Paint(1);
                        public final Text text = new Text(LocaleController.getString(R.string.LiveStoryBadge), 8.0f, AndroidUtilities.bold());

                        @Override
                        public final void draw(Canvas canvas, CharSequence charSequence2, int i11, int i12, float f2, int i13, int i14, int i15, Paint paint) {
                            float fDp = ((i13 + i15) / 2.0f) + AndroidUtilities.dp(0.0f);
                            RectF rectF = this.rect;
                            rectF.set(f2, fDp - AndroidUtilities.dp(6.0f), this.text.getWidth() + f2 + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(6.0f) + fDp);
                            Paint paint2 = this.bg;
                            paint2.setColor(-572850);
                            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                            this.text.draw(AndroidUtilities.dp(4.0f) + f2, fDp, 1.0f, -1, canvas);
                        }

                        @Override
                        public final int getSize(Paint paint, CharSequence charSequence2, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
                            return (int) (this.text.getWidth() + AndroidUtilities.dp(8.0f));
                        }
                    }, length2, spannableStringBuilder3.length(), 33);
                    this.adminNameView.setText(spannableStringBuilder3);
                    this.adminRoleView.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
                    textView.setVisibility(8);
                    textView2.setVisibility(8);
                } else {
                    this.drawParticles = false;
                    view.setWillNotDraw(true);
                    spoilersTextView.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), Theme.multAlpha(0.6f, -16777216));
                    this.background = null;
                    view.setBackground(null);
                    textView.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }
            view.invalidate();
        }

        public void setDrawStar(boolean z) {
            this.drawStar = z;
            ColoredImageSpan coloredImageSpan = this.starsViewCache[0];
            if (coloredImageSpan == null || coloredImageSpan.draw == z) {
                return;
            }
            coloredImageSpan.draw = z;
            this.starsView.invalidate();
        }
    }

    public final class LiveTopSenderView extends FrameLayout {
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarView;
        public final ImageView crownView;
        public final AnonymousClass1 layout;
        public TopSender sender;
        public final AnonymousClass2 textView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((LiveTopSenderView) view).set((TopSender) uItem.object);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new LiveTopSenderView(context);
            }

            @Override
            public final boolean equals(UItem uItem, UItem uItem2) {
                return uItem.object == uItem2.object;
            }
        }

        public LiveTopSenderView(Context context) {
            super(context);
            ScaleStateListAnimator.apply(this, 0.1f, 1.5f);
            ?? r0 = new LinearLayout(context) {
                public StarsReactionsSheet.Particles particles;
                public final Path clipPath = new Path();
                public final Paint fillPaint = new Paint(1);
                public long lastDialogId = 0;
                public final AnimatedFloat animatedProgress = new AnimatedFloat(this, 0, 1000, new LinearInterpolator());

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    Canvas canvas2;
                    Path path = this.clipPath;
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    LiveTopSenderView liveTopSenderView = LiveTopSenderView.this;
                    TopSender topSender = liveTopSenderView.sender;
                    if (topSender != null) {
                        int tierOption = HighlightMessageSheet.getTierOption(topSender.currentAccount, topSender.getStars(), 3);
                        TopSender topSender2 = liveTopSenderView.sender;
                        int tierOption2 = HighlightMessageSheet.getTierOption(topSender2.currentAccount, topSender2.getStars(), 5);
                        canvas.drawColor(tierOption);
                        long j = this.lastDialogId;
                        TopSender topSender3 = liveTopSenderView.sender;
                        long j2 = topSender3.dialogId;
                        AnimatedFloat animatedFloat = this.animatedProgress;
                        if (j != j2) {
                            animatedFloat.set(topSender3.getProgress(), true);
                        }
                        float f = animatedFloat.set(liveTopSenderView.sender.getProgress(), false);
                        this.lastDialogId = liveTopSenderView.sender.dialogId;
                        Paint paint = this.fillPaint;
                        paint.setColor(tierOption2);
                        paint.setAlpha(127);
                        canvas2 = canvas;
                        canvas2.drawRect(getWidth() * f, 0.0f, getWidth(), getHeight(), paint);
                    } else {
                        canvas2 = canvas;
                    }
                    if (this.particles == null) {
                        this.particles = new StarsReactionsSheet.Particles(1, 250);
                    }
                    StarsReactionsSheet.Particles particles = this.particles;
                    float f2 = 0;
                    particles.bounds.set(f2, f2, getWidth(), getHeight());
                    particles.removeParticlesOutside();
                    StarsReactionsSheet.Particles particles2 = this.particles;
                    particles2.speed = 30.0f;
                    particles2.process();
                    this.particles.draw(canvas2, -1, 0.85f);
                    invalidate();
                    canvas2.restore();
                    super.dispatchDraw(canvas2);
                }
            };
            this.layout = r0;
            r0.setOrientation(0);
            addView((View) r0, LayoutHelper.createFrame(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(11.0f));
            r0.addView(backupImageView, LayoutHelper.createLinear(22, 22, 0.0f, 51, 3, 2, 7, 2));
            ImageView imageView = new ImageView(context);
            this.crownView = imageView;
            imageView.setVisibility(8);
            r0.addView(imageView, LayoutHelper.createLinear(18, 18, 19, 0, 0, 3, 0));
            ?? r1 = new TextView(context) {
                public int width = -1;
                public final GradientClip clip = new GradientClip();

                @Override
                public final void onDraw(Canvas canvas) {
                    if (this.width < 0) {
                        this.width = getLayout() != null ? (int) getLayout().getLineWidth(0) : 0;
                    }
                    if (this.width <= AndroidUtilities.dp(100.0f)) {
                        super.onDraw(canvas);
                        return;
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    super.onDraw(canvas);
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getWidth() - AndroidUtilities.dp(15.0f), 0.0f, getWidth(), getHeight());
                    this.clip.draw(canvas, rectF, 2, 1.0f);
                    canvas.restore();
                    canvas.restore();
                }

                @Override
                public final void onMeasure(int i, int i2) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE), i2);
                }

                @Override
                public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                    super.setText(charSequence, bufferType);
                    this.width = -1;
                }
            };
            this.textView = r1;
            r1.setLines(1);
            r1.setSingleLine();
            r1.setTextColor(-1);
            r1.setTextSize(1, 14.0f);
            r1.setTypeface(AndroidUtilities.bold());
            r0.addView(r1, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 7, 0));
        }

        public void set(TopSender topSender) {
            this.sender = topSender;
            long j = topSender.dialogId;
            BackupImageView backupImageView = this.avatarView;
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            if (j >= 0) {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(topSender.dialogId));
                avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
                backupImageView.onNewImageSet();
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-topSender.dialogId));
                avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                backupImageView.onNewImageSet();
            }
            int i = topSender.place;
            ImageView imageView = this.crownView;
            if (i > 0) {
                imageView.setImageDrawable(new CrownDrawable(getContext(), topSender.place));
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            setText(DialogObject.getName(topSender.dialogId));
            invalidate();
        }
    }

    public final class Message {
        public int date;
        public long dialogId;
        public boolean fromAdmin;
        public int id;
        public boolean isReaction;
        public int place;
        public long stars;
        public TLRPC.TL_textWithEntities text;
    }

    public final class TopSender {
        public int currentAccount;
        public long dialogId;
        public int lastSentDate;
        public long max_stars;
        public final ArrayList messages = new ArrayList();
        public int place;

        public final float getProgress() {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            ArrayList arrayList = this.messages;
            int size = arrayList.size();
            int iMin = currentTime;
            int i = 0;
            int iMax = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Message message = (Message) obj;
                if (message.stars > 0) {
                    iMin = Math.min(iMin, message.date);
                    iMax = Math.max(iMax, HighlightMessageSheet.getTierOption(this.currentAccount, (int) message.stars, 0) + message.date);
                }
            }
            return AndroidUtilities.ilerp(currentTime, iMax, iMin);
        }

        public final int getStars() {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            ArrayList arrayList = this.messages;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Message message = (Message) obj;
                long j = message.stars;
                if (j > 0 && currentTime - message.date <= HighlightMessageSheet.getTierOption(this.currentAccount, (int) j, 0)) {
                    i2 += (int) message.stars;
                }
            }
            this.max_stars = Math.max(this.max_stars, i2);
            return i2;
        }
    }

    public LiveCommentsView(Context context, StoryViewer storyViewer, StoryViewer.AnonymousClass3 anonymousClass3, View view, FrameLayout frameLayout) {
        super(context);
        this.messages = new ArrayList();
        this.topMessages = new ArrayList();
        this.topPlaces = new HashMap();
        this.maxReadId = -1;
        this.allowTouches = true;
        this.gradientClip = new GradientClip();
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.topDonors = new ArrayList();
        final PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this;
        this.pollStarsRunnable = new LiveCommentsView$$ExternalSyntheticLambda2(anonymousClass10, 0);
        this.closeBulletin = new LiveCommentsView$$ExternalSyntheticLambda2(anonymousClass10, 2);
        this.collapsed = false;
        this.updateAdapters = new LiveCommentsView$$ExternalSyntheticLambda2(anonymousClass10, 3);
        this.shadowView = view;
        this.topBulletinContainer = frameLayout;
        view.setAlpha(0.5f);
        final PeerStoriesView.AnonymousClass10 anonymousClass11 = (PeerStoriesView.AnonymousClass10) this;
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(anonymousClass11, context, 28);
        this.listView = anonymousClass34;
        anonymousClass34.setWillNotDraw(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, true);
        this.layoutManager = linearLayoutManager;
        anonymousClass34.setLayoutManager(linearLayoutManager);
        final int i2 = 0;
        ?? r1 = new UniversalAdapter(anonymousClass34, context, i, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PeerStoriesView.AnonymousClass10 anonymousClass12 = anonymousClass10;
                int i3 = 0;
                ArrayList arrayList = (ArrayList) obj;
                switch (i2) {
                    case 0:
                        LivePlayer livePlayer = anonymousClass12.livePlayer;
                        long sendPaidMessagesStars = livePlayer == null ? 0L : livePlayer.getSendPaidMessagesStars();
                        anonymousClass12.lastMinStars = sendPaidMessagesStars;
                        while (true) {
                            ArrayList arrayList2 = anonymousClass12.messages;
                            if (i3 >= arrayList2.size()) {
                                return;
                            }
                            LiveCommentsView.Message message = (LiveCommentsView.Message) arrayList2.get(i3);
                            if (message.fromAdmin || !message.isReaction || message.stars >= sendPaidMessagesStars) {
                                int i4 = LiveCommentsView.LiveCommentView.Factory.$r8$clinit;
                                UItem uItemOfFactory = UItem.ofFactory(LiveCommentsView.LiveCommentView.Factory.class);
                                uItemOfFactory.object = message;
                                arrayList.add(uItemOfFactory);
                            }
                            i3++;
                        }
                        break;
                }
                while (true) {
                    ArrayList arrayList3 = anonymousClass12.topMessages;
                    if (i3 >= arrayList3.size()) {
                        return;
                    }
                    LiveCommentsView.TopSender topSender = (LiveCommentsView.TopSender) arrayList3.get(i3);
                    int i5 = LiveCommentsView.LiveTopSenderView.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(LiveCommentsView.LiveTopSenderView.Factory.class);
                    uItemOfFactory2.object = topSender;
                    arrayList.add(uItemOfFactory2);
                    i3++;
                }
            }
        }, new DarkThemeResourceProvider()) {
            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i3) {
                LiveCommentView liveCommentView;
                Message message;
                super.onBindViewHolder(viewHolder, i3);
                PeerStoriesView.AnonymousClass10 anonymousClass12 = anonymousClass11;
                if (anonymousClass12.callHighlight) {
                    View view2 = viewHolder.itemView;
                    if ((view2 instanceof LiveCommentView) && (message = (liveCommentView = (LiveCommentView) view2).message) != null && message.id == anonymousClass12.highlightingMessageId) {
                        liveCommentView.highlight();
                        anonymousClass12.callHighlight = false;
                    }
                }
            }

            @Override
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                LiveCommentView liveCommentView;
                Message message;
                updateReorder(viewHolder, this.allowReorder);
                updateColors(viewHolder);
                PeerStoriesView.AnonymousClass10 anonymousClass12 = anonymousClass11;
                if (anonymousClass12.callHighlight) {
                    View view2 = viewHolder.itemView;
                    if ((view2 instanceof LiveCommentView) && (message = (liveCommentView = (LiveCommentView) view2).message) != null && message.id == anonymousClass12.highlightingMessageId) {
                        liveCommentView.highlight();
                        anonymousClass12.callHighlight = false;
                    }
                }
            }
        };
        this.adapter = r1;
        anonymousClass34.setAdapter(r1);
        r1.applyBackground = false;
        anonymousClass34.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        anonymousClass34.setClipToPadding(false);
        addView(anonymousClass34, LayoutHelper.createFrame(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        anonymousClass34.setOnItemClickListener(new LiveCommentsView$$ExternalSyntheticLambda6(anonymousClass10, anonymousClass3, storyViewer, 0));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final float animateByScale(View view2) {
                return 0.5f;
            }

            @Override
            public final void onAddAnimationUpdate() {
                anonymousClass11.listView.invalidate();
            }

            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                anonymousClass11.listView.invalidate();
            }
        };
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(280L);
        defaultItemAnimator.delayIncrement = 14L;
        anonymousClass34.setItemAnimator(defaultItemAnimator);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        imageView.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(anonymousClass10, 16));
        MessageSeenView.AnonymousClass1 anonymousClass1 = new MessageSeenView.AnonymousClass1(context, 11, null);
        this.topListView = anonymousClass1;
        anonymousClass1.setWillNotDraw(false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(0, false);
        this.topLayoutManager = linearLayoutManager2;
        anonymousClass1.setLayoutManager(linearLayoutManager2);
        final int i3 = 1;
        UniversalAdapter universalAdapter = new UniversalAdapter(anonymousClass1, context, i, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PeerStoriesView.AnonymousClass10 anonymousClass12 = anonymousClass10;
                int i4 = 0;
                ArrayList arrayList = (ArrayList) obj;
                switch (i3) {
                    case 0:
                        LivePlayer livePlayer = anonymousClass12.livePlayer;
                        long sendPaidMessagesStars = livePlayer == null ? 0L : livePlayer.getSendPaidMessagesStars();
                        anonymousClass12.lastMinStars = sendPaidMessagesStars;
                        while (true) {
                            ArrayList arrayList2 = anonymousClass12.messages;
                            if (i4 >= arrayList2.size()) {
                                return;
                            }
                            LiveCommentsView.Message message = (LiveCommentsView.Message) arrayList2.get(i4);
                            if (message.fromAdmin || !message.isReaction || message.stars >= sendPaidMessagesStars) {
                                int i5 = LiveCommentsView.LiveCommentView.Factory.$r8$clinit;
                                UItem uItemOfFactory = UItem.ofFactory(LiveCommentsView.LiveCommentView.Factory.class);
                                uItemOfFactory.object = message;
                                arrayList.add(uItemOfFactory);
                            }
                            i4++;
                        }
                        break;
                }
                while (true) {
                    ArrayList arrayList3 = anonymousClass12.topMessages;
                    if (i4 >= arrayList3.size()) {
                        return;
                    }
                    LiveCommentsView.TopSender topSender = (LiveCommentsView.TopSender) arrayList3.get(i4);
                    int i6 = LiveCommentsView.LiveTopSenderView.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(LiveCommentsView.LiveTopSenderView.Factory.class);
                    uItemOfFactory2.object = topSender;
                    arrayList.add(uItemOfFactory2);
                    i4++;
                }
            }
        }, null);
        this.topAdapter = universalAdapter;
        anonymousClass1.setAdapter(universalAdapter);
        universalAdapter.applyBackground = false;
        anonymousClass1.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        anonymousClass1.setClipToPadding(false);
        addView(anonymousClass1, LayoutHelper.createFrame(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        anonymousClass1.setOnItemClickListener(new LiveCommentsView$$ExternalSyntheticLambda9(anonymousClass10));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        anonymousClass5.mSupportsChangeAnimations = false;
        anonymousClass5.delayAnimations = false;
        anonymousClass5.mAddInterpolator = cubicBezierInterpolator;
        anonymousClass5.mMoveInterpolator = cubicBezierInterpolator;
        anonymousClass5.mRemoveInterpolator = cubicBezierInterpolator;
        anonymousClass5.mChangeInterpolator = cubicBezierInterpolator;
        anonymousClass5.setDurations(350L);
        anonymousClass1.setItemAnimator(anonymousClass5);
        updateTopMessages(false);
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        LivePlayer livePlayer = this.livePlayer;
        if (livePlayer != null && livePlayer.isAdmin()) {
            TLRPC.GroupCall groupCall = this.livePlayer.call;
            if (groupCall == null ? false : !groupCall.messages_enabled) {
                return this.dialogId;
            }
        }
        return defaultSendAs == null ? UserConfig.getInstance(this.currentAccount).getClientUserId() : DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        int height = anonymousClass34.getHeight();
        for (int i = 0; i < anonymousClass34.getChildCount(); i++) {
            height = Math.min(anonymousClass34.getChildAt(i).getTop(), height);
        }
        return anonymousClass34.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.localStars)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i = (int) (((long) 0) + this.localStars);
        for (int i2 = 0; i2 < this.topDonors.size(); i2++) {
            if (((TL_phone.groupCallDonor) this.topDonors.get(i2)).my) {
                i = (int) (((long) i) + ((TL_phone.groupCallDonor) this.topDonors.get(i2)).stars);
            }
        }
        return i;
    }

    public final void cancelStars() {
        this.localStars = 0L;
        onCancelledStarReaction(getDefaultPeerId());
        PaidReactionButton paidReactionButton = ((PeerStoriesView.AnonymousClass10) this).this$0.starsButton;
        paidReactionButton.effectsView.updatePosition(paidReactionButton);
        paidReactionButton.effectsView.hide();
        onStarsCountUpdated();
    }

    public final void delete(int i) {
        ArrayList arrayList;
        Message message;
        ArrayList arrayList2;
        boolean z = false;
        int i2 = 0;
        while (true) {
            arrayList = this.messages;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                message = null;
                break;
            } else {
                if (((Message) arrayList.get(i2)).id == i) {
                    message = (Message) arrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (message == null) {
            return;
        }
        if (message.id < 0 && message.isReaction) {
            long j = message.stars;
            if (j > 0) {
                this.totalStars -= j;
                onStarsCountUpdated();
            }
        }
        int i3 = 0;
        while (true) {
            arrayList2 = this.topMessages;
            if (i3 >= arrayList2.size()) {
                break;
            }
            if (((TopSender) arrayList2.get(i3)).messages.contains(message)) {
                ((TopSender) arrayList2.get(i3)).messages.remove(message);
                if (!((TopSender) arrayList2.get(i3)).messages.isEmpty()) {
                    TopSender topSender = (TopSender) arrayList2.get(i3);
                    int currentTime = ConnectionsManager.getInstance(topSender.currentAccount).getCurrentTime();
                    ArrayList arrayList3 = topSender.messages;
                    int size = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList3.get(i4);
                        i4++;
                        Message message2 = (Message) obj;
                        if (message2.stars > 0) {
                            currentTime = Math.min(currentTime, message2.date);
                        }
                    }
                    topSender.lastSentDate = currentTime;
                    scheduleRemovingTopSenders();
                    break;
                }
                arrayList2.remove(i3);
                z = true;
                break;
            }
            i3++;
        }
        arrayList.remove(i2);
        update(true);
        if (z) {
            ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            Collections.sort(arrayList2, new TableModel$$ExternalSyntheticLambda0(this, 12));
            this.topAdapter.update(true);
            updateMessagesPlaces();
            updateTopMessages(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.liveStoryMessageUpdate) {
            int i3 = 0;
            long jLongValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            if (!(tLObject instanceof TL_update.TL_updateGroupCallMessage)) {
                if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                    TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                    TLRPC.InputGroupCall inputGroupCall = this.inputCall;
                    if (inputGroupCall == null || inputGroupCall.id != jLongValue) {
                        return;
                    }
                    ArrayList<Integer> arrayList = tL_updateDeleteGroupCallMessages.messages;
                    int size = arrayList.size();
                    while (i3 < size) {
                        Integer num = arrayList.get(i3);
                        i3++;
                        delete(num.intValue());
                    }
                    return;
                }
                return;
            }
            TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
            TLRPC.InputGroupCall inputGroupCall2 = this.inputCall;
            if (inputGroupCall2 != null && inputGroupCall2.id == jLongValue) {
                TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                int i4 = groupCallMessage.date;
                int i5 = groupCallMessage.id;
                boolean z = groupCallMessage.from_admin;
                long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                push(i4, i5, z, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, zBooleanValue);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.allowTouches) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= top()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (view != anonymousClass34) {
            return super.drawChild(canvas, view, j);
        }
        if (anonymousClass34.getAlpha() <= 0.0f) {
            return true;
        }
        float fMax = Math.max(0.0f, this.keyboardOffset - anonymousClass34.getTop()) + anonymousClass34.getY();
        canvas.saveLayerAlpha(anonymousClass34.getX(), anonymousClass34.getY(), anonymousClass34.getX() + anonymousClass34.getWidth(), anonymousClass34.getY() + anonymousClass34.getHeight(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((anonymousClass34.getY() + anonymousClass34.getHeight()) - fMax, getListViewTop()) * (1.0f - anonymousClass34.getAlpha()));
        canvas.clipRect(0.0f, fMax, getWidth(), getHeight());
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, fMax, getWidth(), AndroidUtilities.dp(12.0f) + fMax);
        GradientClip gradientClip = this.gradientClip;
        gradientClip.draw(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (anonymousClass34.getY() + anonymousClass34.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), anonymousClass34.getHeight() + anonymousClass34.getBottom());
        gradientClip.draw(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return zDrawChild;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        int height = anonymousClass34.getHeight();
        for (int i = 0; i < anonymousClass34.getChildCount(); i++) {
            height = Math.min(anonymousClass34.getChildAt(i).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.messages.size();
    }

    public long getStarsCount() {
        return this.totalStars + this.localStars;
    }

    public int getUnreadMessagesCount() {
        int i = 0;
        if (this.maxReadId < 0) {
            return 0;
        }
        LivePlayer livePlayer = this.livePlayer;
        long sendPaidMessagesStars = livePlayer == null ? 0L : livePlayer.getSendPaidMessagesStars();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.messages;
            if (i >= arrayList.size()) {
                return i2;
            }
            Message message = (Message) arrayList.get(i);
            int i3 = message.id;
            if (i3 >= 0 && i3 > this.maxReadId && (message.fromAdmin || !message.isReaction || message.stars >= sendPaidMessagesStars)) {
                i2++;
            }
            i++;
        }
    }

    public final boolean isAdmin() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.dialogId) {
            return false;
        }
        long j = this.dialogId;
        int i = this.currentAccount;
        if (j >= 0) {
            return j == UserConfig.getInstance(i).getClientUserId();
        }
        LivePlayer livePlayer = this.livePlayer;
        if (livePlayer == null || (inputGroupCall = this.inputCall) == null || inputGroupCall.id != livePlayer.getCallId() || (groupCall = this.livePlayer.call) == null || !groupCall.creator) {
            return ChatObject.canManageCalls(MessagesController.getInstance(i).getChat(Long.valueOf(-this.dialogId)));
        }
        return true;
    }

    public final boolean isCollapsed() {
        return this.collapsed;
    }

    public final void lambda$new$12$3$1() {
        AndroidUtilities.cancelRunOnUIThread(this.closeBulletin);
        Bulletin bulletin = this.starsBulletin;
        if (bulletin != null) {
            bulletin.hide();
            this.starsBulletin = null;
        }
        long j = this.localStars;
        if (j <= 0) {
            onStarsCountUpdated();
            return;
        }
        this.localStars = 0L;
        this.sentStars = true;
        send(getDefaultPeerId(), new TLRPC.TL_textWithEntities(), j);
    }

    public final Integer lambda$openStarsSheet$11(Long l) {
        this.closeBulletin.run();
        this.localStars = l.longValue();
        Bulletin bulletinCreateSimpleBulletin = new BulletinFactory(this.topBulletinContainer, new DarkThemeResourceProvider()).createSimpleBulletin(getStarsToastTitle(), getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z = false;
        bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
        bulletinCreateSimpleBulletin.show(true);
        this.localStars = 0L;
        this.sentStars = true;
        int iSend = send(getDefaultPeerId(), new TLRPC.TL_textWithEntities(), l.longValue());
        LivePlayer livePlayer = this.livePlayer;
        long sendPaidMessagesStars = livePlayer != null ? livePlayer.getSendPaidMessagesStars() : 0L;
        if (getDefaultPeerId() == this.dialogId && isAdmin()) {
            z = true;
        }
        if (l.longValue() >= sendPaidMessagesStars || z) {
            return Integer.valueOf(iSend);
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.inputCall != null) {
            LiveCommentsView$$ExternalSyntheticLambda2 liveCommentsView$$ExternalSyntheticLambda2 = this.pollStarsRunnable;
            AndroidUtilities.cancelRunOnUIThread(liveCommentsView$$ExternalSyntheticLambda2);
            AndroidUtilities.runOnUIThread(liveCommentsView$$ExternalSyntheticLambda2);
        }
    }

    public abstract void onCancelledStarReaction(long j);

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.inputCall != null) {
            AndroidUtilities.cancelRunOnUIThread(this.pollStarsRunnable);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= top()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public abstract void onStarsCountUpdated();

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= top()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void openStarsSheet(boolean z) {
        this.closeBulletin.run();
        ArrayList arrayList = new ArrayList();
        if (this.topDonors != null) {
            for (int i = 0; i < this.topDonors.size(); i++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.topDonors.get(i);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        ShareAlert.AnonymousClass3 anonymousClass3 = new ShareAlert.AnonymousClass3(2);
        StarsReactionsSheet starsReactionsSheet = new StarsReactionsSheet(getContext(), this.currentAccount, this.dialogId, null, null, arrayList, !z, true, clientUserId, anonymousClass3);
        starsReactionsSheet.commentsView = (PeerStoriesView.AnonymousClass10) this;
        starsReactionsSheet.onSendListener = new LiveCommentsView$$ExternalSyntheticLambda9((PeerStoriesView.AnonymousClass10) this);
        starsReactionsSheet.show();
    }

    public final void push(int i, int i2, boolean z, long j, TLRPC.TL_textWithEntities tL_textWithEntities, long j2, boolean z2) {
        int i3;
        long j3;
        int i4;
        TL_phone.groupCallDonor groupcalldonor;
        TopSender topSender;
        boolean z3;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.messages;
            if (i5 >= arrayList.size()) {
                int i6 = this.currentAccount;
                int currentTime = ConnectionsManager.getInstance(i6).getCurrentTime();
                Message message = new Message();
                message.date = i;
                message.fromAdmin = z;
                message.dialogId = j;
                message.text = tL_textWithEntities;
                message.stars = j2;
                message.id = i2;
                message.isReaction = TextUtils.isEmpty(tL_textWithEntities.text);
                int tierOption = HighlightMessageSheet.getTierOption(i6, (int) message.stars, 0);
                long j4 = message.stars;
                ArrayList arrayList2 = this.topMessages;
                long j5 = 0;
                if (j4 <= 0 || tierOption <= 0 || currentTime - message.date > tierOption) {
                    i3 = i6;
                    j3 = 0;
                } else {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList2.size()) {
                            topSender = null;
                            break;
                        } else {
                            if (((TopSender) arrayList2.get(i7)).dialogId == j) {
                                topSender = (TopSender) arrayList2.get(i7);
                                break;
                            }
                            i7++;
                        }
                    }
                    if (topSender == null) {
                        topSender = new TopSender();
                        topSender.currentAccount = i6;
                        topSender.dialogId = j;
                        topSender.messages.add(message);
                        arrayList2.add(0, topSender);
                        z3 = true;
                    } else {
                        topSender.messages.add(message);
                        this.topListView.invalidateViews();
                        z3 = false;
                    }
                    int currentTime2 = ConnectionsManager.getInstance(topSender.currentAccount).getCurrentTime();
                    ArrayList arrayList3 = topSender.messages;
                    int size = arrayList3.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj = arrayList3.get(i8);
                        i8++;
                        long j6 = j5;
                        Message message2 = (Message) obj;
                        int i9 = i6;
                        if (message2.stars > j6) {
                            currentTime2 = Math.min(currentTime2, message2.date);
                        }
                        j5 = j6;
                        i6 = i9;
                    }
                    i3 = i6;
                    j3 = j5;
                    topSender.lastSentDate = currentTime2;
                    updateTopMessages(true);
                    scheduleRemovingTopSenders();
                    Collections.sort(arrayList2, new TableModel$$ExternalSyntheticLambda0(this, 12));
                    if (!z2) {
                        this.topAdapter.update(true);
                    }
                    if (z3) {
                        this.topLayoutManager.scrollToPosition(0);
                    }
                }
                if (!z2 && message.isReaction) {
                    long j7 = message.stars;
                    if (j7 > j3) {
                        this.totalStars += j7;
                        onStarsCountUpdated();
                    }
                }
                if (message.id < 0) {
                    i4 = 0;
                    break;
                }
                int size2 = arrayList.size() - 1;
                while (true) {
                    if (size2 < 0) {
                        i4 = 0;
                        break;
                    } else {
                        if (message.id < ((Message) arrayList.get(size2)).id) {
                            i4 = size2 + 1;
                            break;
                        }
                        size2--;
                    }
                }
                arrayList.add(i4, message);
                if (!z2) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    update(true);
                }
                if (i4 <= 0 && !z2 && (!this.listView.canScrollVertically(1) || message.id < 0)) {
                    LinearLayoutManager linearLayoutManager = this.layoutManager;
                    linearLayoutManager.scrollToPositionWithOffset(0, AndroidUtilities.dp(100.0f), linearLayoutManager.mShouldReverseLayout);
                    int i10 = message.id;
                    if (i10 > 0) {
                        this.maxReadId = i10;
                    }
                }
                invalidate();
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this;
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass10.this$0;
                CommentButton commentButton = anonymousClass1.commentButton;
                if (commentButton != null) {
                    commentButton.setCount(anonymousClass10.getUnreadMessagesCount());
                }
                if (!z2 && i2 > 0 && message.stars > j3) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= this.topDonors.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.topDonors.get(i11)).peer_id) == message.dialogId) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.topDonors.get(i11);
                                break;
                            }
                            i11++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = UserConfig.getInstance(i3).getClientUserId() == message.dialogId;
                        groupcalldonor.peer_id = MessagesController.getInstance(i3).getPeer(message.dialogId);
                        groupcalldonor.stars = j3;
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            if (((TopSender) arrayList2.get(i12)).dialogId == message.dialogId) {
                                ((TopSender) arrayList2.get(i12)).getStars();
                                groupcalldonor.stars += ((TopSender) arrayList2.get(i12)).max_stars;
                            }
                        }
                        this.topDonors.add(groupcalldonor);
                    }
                    long j8 = groupcalldonor.stars;
                    long j9 = message.stars;
                    groupcalldonor.stars = j8 + j9;
                    long j10 = message.dialogId;
                    int i13 = (int) j9;
                    PaidReactionButton.PaidReactionButtonEffectsView paidReactionButtonEffectsView = anonymousClass1.starsButtonEffectsView;
                    if (paidReactionButtonEffectsView != null) {
                        ArrayList arrayList4 = paidReactionButtonEffectsView.chips;
                        arrayList4.add(new PaidReactionButton.PaidReactionButtonEffectsView.Chip(paidReactionButtonEffectsView, paidReactionButtonEffectsView, paidReactionButtonEffectsView.currentAccount, j10, i13, arrayList4.size() < 5));
                        paidReactionButtonEffectsView.invalidate();
                    }
                }
                updateMessagesPlaces();
                if (z2) {
                    LiveCommentsView$$ExternalSyntheticLambda2 liveCommentsView$$ExternalSyntheticLambda2 = this.updateAdapters;
                    AndroidUtilities.cancelRunOnUIThread(liveCommentsView$$ExternalSyntheticLambda2);
                    AndroidUtilities.runOnUIThread(liveCommentsView$$ExternalSyntheticLambda2, 100L);
                }
                LivePlayer livePlayer = this.livePlayer;
                if (livePlayer != null) {
                    livePlayer.messages = arrayList;
                    livePlayer.topMessages = arrayList2;
                    return;
                }
                return;
            }
            if (((Message) arrayList.get(i5)).id == i2) {
                return;
            } else {
                i5++;
            }
        }
    }

    public final void scheduleRemovingTopSenders() {
        LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda0 = this.removeTopSendersRunnable;
        if (livePlayer$1$$ExternalSyntheticLambda0 != null) {
            AndroidUtilities.cancelRunOnUIThread(livePlayer$1$$ExternalSyntheticLambda0);
            this.removeTopSendersRunnable = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        ArrayList arrayList = this.topMessages;
        int size = arrayList.size();
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (i < size) {
            Object obj = arrayList.get(i);
            int i2 = i + 1;
            TopSender topSender = (TopSender) obj;
            ArrayList arrayList2 = topSender.messages;
            int size2 = arrayList2.size();
            int iMin = currentTime;
            int i3 = 0;
            int iMax = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                Message message = (Message) obj2;
                int i4 = i2;
                if (message.stars > 0) {
                    iMin = Math.min(iMin, message.date);
                    iMax = Math.max(iMax, HighlightMessageSheet.getTierOption(topSender.currentAccount, (int) message.stars, 0) + message.date);
                }
                i2 = i4;
            }
            jMin = Math.min(jMin, ((long) Math.max(0, iMax - currentTime)) * 1000);
            i = i2;
        }
        if (jMin >= Long.MAX_VALUE) {
            return;
        }
        LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda1 = new LivePlayer$1$$ExternalSyntheticLambda0(this, 5);
        this.removeTopSendersRunnable = livePlayer$1$$ExternalSyntheticLambda1;
        AndroidUtilities.runOnUIThread(livePlayer$1$$ExternalSyntheticLambda1, jMin);
    }

    public final void send(TLRPC.TL_textWithEntities tL_textWithEntities, long j) {
        send(getDefaultPeerId(), tL_textWithEntities, j);
    }

    public final void sendStars() {
        ArrayList arrayList;
        Bulletin bulletin = this.starsBulletin;
        LiveCommentsView$$ExternalSyntheticLambda2 liveCommentsView$$ExternalSyntheticLambda2 = this.closeBulletin;
        if (bulletin == null || !bulletin.showing) {
            DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
            Bulletin.TwoLineAnimatedLottieLayout twoLineAnimatedLottieLayout = new Bulletin.TwoLineAnimatedLottieLayout(getContext(), darkThemeResourceProvider);
            this.bulletinLayout = twoLineAnimatedLottieLayout;
            twoLineAnimatedLottieLayout.setAnimation(R.raw.stars_topup, new String[0]);
            this.bulletinLayout.titleTextView.setText(getStarsToastTitle());
            Bulletin.UndoButton undoButton = new Bulletin.UndoButton(getContext(), darkThemeResourceProvider, true, false);
            this.bulletinButton = undoButton;
            String string = LocaleController.getString(R.string.StarsSentUndo);
            TextView textView = undoButton.undoTextView;
            if (textView != null) {
                textView.setText(string);
            }
            this.bulletinButton.undoAction = new LiveCommentsView$$ExternalSyntheticLambda2((PeerStoriesView.AnonymousClass10) this, 1);
            Bulletin.TimerView timerView = new Bulletin.TimerView(getContext(), darkThemeResourceProvider);
            this.timerView = timerView;
            timerView.timeLeft = 5000L;
            timerView.setColor(darkThemeResourceProvider.getColor(Theme.key_undo_cancelColor));
            this.bulletinButton.addView(this.timerView, LayoutHelper.createFrame(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.bulletinButton.undoTextView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.bulletinLayout.setButton(this.bulletinButton);
            Bulletin bulletinMake = Bulletin.make(this.topBulletinContainer, this.bulletinLayout, -1);
            this.starsBulletin = bulletinMake;
            bulletinMake.hideAfterBottomSheet = false;
            bulletinMake.show(true);
            this.starsBulletin.onHideListener = liveCommentsView$$ExternalSyntheticLambda2;
        }
        this.localStars++;
        onCancelledStarReaction(getDefaultPeerId());
        long defaultPeerId = getDefaultPeerId();
        getTotalMyStars();
        int i = (int) this.localStars;
        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = ((PeerStoriesView.AnonymousClass10) this).this$0;
        PaidReactionButton.PaidReactionButtonEffectsView paidReactionButtonEffectsView = anonymousClass1.starsButtonEffectsView;
        if (paidReactionButtonEffectsView != null) {
            ArrayList arrayList2 = paidReactionButtonEffectsView.chips;
            arrayList2.add(new PaidReactionButton.PaidReactionButtonEffectsView.Chip(paidReactionButtonEffectsView, paidReactionButtonEffectsView, paidReactionButtonEffectsView.currentAccount, defaultPeerId, i, arrayList2.size() < 5));
            paidReactionButtonEffectsView.invalidate();
        }
        this.bulletinLayout.titleTextView.setText(getStarsToastTitle());
        this.bulletinLayout.subtitleTextView.setText(getStarsToastSubtitle());
        this.timerView.timeLeft = 5000L;
        AndroidUtilities.cancelRunOnUIThread(liveCommentsView$$ExternalSyntheticLambda2);
        AndroidUtilities.runOnUIThread(liveCommentsView$$ExternalSyntheticLambda2, 5000L);
        long j = this.localStars;
        PaidReactionButton paidReactionButton = anonymousClass1.starsButton;
        paidReactionButton.effectsView.updatePosition(paidReactionButton);
        PaidReactionButton.PaidReactionButtonEffectsView paidReactionButtonEffectsView2 = paidReactionButton.effectsView;
        if (paidReactionButtonEffectsView2.hidden) {
            paidReactionButtonEffectsView2.hidden = false;
            paidReactionButtonEffectsView2.focusTo(1.0f, null);
        }
        while (true) {
            arrayList = paidReactionButtonEffectsView2.effects;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((RLottieDrawable) arrayList.remove(0)).recycle(true);
            }
        }
        Random random = Utilities.fastRandom;
        int[] iArr = paidReactionButtonEffectsView2.effectAssets;
        int i2 = iArr[random.nextInt(iArr.length)];
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, DiffUtil.m(i2, ""), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), true, null);
        rLottieDrawable.masterParent = paidReactionButtonEffectsView2;
        rLottieDrawable.decodeSingleFrame = true;
        rLottieDrawable.scheduleNextGetFrame();
        rLottieDrawable.setAutoRepeat(0);
        rLottieDrawable.start();
        arrayList.add(rLottieDrawable);
        paidReactionButtonEffectsView2.invalidate();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = paidReactionButtonEffectsView2.counter;
        animatedTextDrawable.cancelAnimation();
        animatedTextDrawable.setText(BillingController$$ExternalSyntheticOutline0.m(j, ',', new StringBuilder("+")), true, true);
        PaidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0 paidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0 = paidReactionButtonEffectsView2.hideCounterRunnable;
        AndroidUtilities.cancelRunOnUIThread(paidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0);
        AndroidUtilities.runOnUIThread(paidReactionButton$PaidReactionButtonEffectsView$$ExternalSyntheticLambda0, 1500L);
        int[] iArr2 = paidReactionButton.pos;
        paidReactionButton.getLocationInWindow(iArr2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - paidReactionButton.lastRippleTime;
        if (j2 < 100) {
            paidReactionButton.accumulatedRippleIntensity += 0.5f;
        } else {
            paidReactionButton.accumulatedRippleIntensity = Utilities.clamp(1.0f - ((j2 - 100) / 200.0f), 1.0f, 0.0f) * paidReactionButton.accumulatedRippleIntensity;
            LaunchActivity.makeRipple((paidReactionButton.getWidth() / 2.0f) + iArr2[0], (paidReactionButton.getHeight() / 2.0f) + iArr2[1], Utilities.clamp(paidReactionButton.accumulatedRippleIntensity, 0.9f, 0.3f));
            paidReactionButton.accumulatedRippleIntensity = 0.0f;
            paidReactionButton.lastRippleTime = jCurrentTimeMillis;
        }
        onStarsCountUpdated();
    }

    public void setAllowTouches(boolean z) {
        this.allowTouches = z;
    }

    public abstract void setCollapsed(boolean z, boolean z2);

    public void setLivePlayer(LivePlayer livePlayer) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z = this.livePlayer == null;
        this.livePlayer = livePlayer;
        if (!z || livePlayer == null || (arrayList = livePlayer.messages) == null || (arrayList2 = livePlayer.topMessages) == null || arrayList == (arrayList3 = this.messages) || arrayList2 == (arrayList4 = this.topMessages) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(livePlayer.messages);
        arrayList4.addAll(livePlayer.topMessages);
        update(true);
        ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        Collections.sort(arrayList4, new OAuthSheet$$ExternalSyntheticLambda3(this, 11));
        this.topAdapter.update(true);
        updateTopMessages(false);
    }

    public final boolean setup(long j, TLRPC.InputGroupCall inputGroupCall) {
        boolean z;
        TLRPC.InputGroupCall inputGroupCall2 = this.inputCall;
        if ((inputGroupCall2 == null ? 0L : inputGroupCall2.id) != (inputGroupCall != null ? inputGroupCall.id : 0L)) {
            this.messages.clear();
            z = true;
            update(true);
        } else {
            z = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.inputCall;
        int i = this.currentAccount;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.dialogId = j;
        this.inputCall = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z) {
            this.closeBulletin.run();
            LiveCommentsView$$ExternalSyntheticLambda2 liveCommentsView$$ExternalSyntheticLambda2 = this.pollStarsRunnable;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(liveCommentsView$$ExternalSyntheticLambda2);
                return z;
            }
            liveCommentsView$$ExternalSyntheticLambda2.run();
        }
        return z;
    }

    public final float top() {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        return Math.max(Math.max(0.0f, this.keyboardOffset - anonymousClass34.getTop()), getListViewContentTop()) + anonymousClass34.getY();
    }

    public final void updateMessagesPlaces() {
        LiveTopSenderView liveTopSenderView;
        TopSender topSender;
        LiveCommentView liveCommentView;
        Message message;
        HashMap map = this.topPlaces;
        map.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.topDonors;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda3(12));
        int size = arrayList.size();
        int i = Integer.MIN_VALUE;
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) obj;
            int i4 = (int) groupcalldonor.stars;
            if (i4 != i) {
                i3++;
                i = i4;
            }
            if (i3 > 3) {
                break;
            } else {
                map.put(Long.valueOf(DialogObject.getPeerDialogId(groupcalldonor.peer_id)), Integer.valueOf(i3));
            }
        }
        int i5 = 0;
        while (true) {
            ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
            if (i5 >= anonymousClass34.getChildCount()) {
                break;
            }
            View childAt = anonymousClass34.getChildAt(i5);
            if ((childAt instanceof LiveCommentView) && (message = (liveCommentView = (LiveCommentView) childAt).message) != null) {
                int iIntValue = ((Integer) Map.EL.getOrDefault(map, Long.valueOf(message.dialogId), 0)).intValue();
                Message message2 = liveCommentView.message;
                if (iIntValue != message2.place) {
                    message2.place = iIntValue;
                    liveCommentView.set(message2);
                }
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            ArrayList arrayList3 = this.messages;
            if (i6 >= arrayList3.size()) {
                break;
            }
            Message message3 = (Message) arrayList3.get(i6);
            int iIntValue2 = ((Integer) Map.EL.getOrDefault(map, Long.valueOf(message3.dialogId), 0)).intValue();
            if (iIntValue2 != message3.place) {
                message3.place = iIntValue2;
            }
            i6++;
        }
        int i7 = 0;
        while (true) {
            MessageSeenView.AnonymousClass1 anonymousClass1 = this.topListView;
            if (i7 >= anonymousClass1.getChildCount()) {
                break;
            }
            View childAt2 = anonymousClass1.getChildAt(i7);
            if ((childAt2 instanceof LiveTopSenderView) && (topSender = (liveTopSenderView = (LiveTopSenderView) childAt2).sender) != null) {
                int iIntValue3 = ((Integer) Map.EL.getOrDefault(map, Long.valueOf(topSender.dialogId), 0)).intValue();
                TopSender topSender2 = liveTopSenderView.sender;
                if (iIntValue3 != topSender2.place) {
                    topSender2.place = iIntValue3;
                    liveTopSenderView.set(topSender2);
                }
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            ArrayList arrayList4 = this.topMessages;
            if (i8 >= arrayList4.size()) {
                return;
            }
            TopSender topSender3 = (TopSender) arrayList4.get(i8);
            int iIntValue4 = ((Integer) Map.EL.getOrDefault(map, Long.valueOf(topSender3.dialogId), 0)).intValue();
            if (iIntValue4 != topSender3.place) {
                topSender3.place = iIntValue4;
            }
            i8++;
        }
    }

    public final void updateTopMessages(boolean z) {
        ArrayList arrayList = this.topMessages;
        if (z && this.hasTopMessages == (!arrayList.isEmpty())) {
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        this.hasTopMessages = !zIsEmpty;
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        MessageSeenView.AnonymousClass1 anonymousClass1 = this.topListView;
        if (z) {
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = anonymousClass34.animate().translationY(this.hasTopMessages ? 0.0f : AndroidUtilities.dp(35.0f));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            viewPropertyAnimatorTranslationY.setInterpolator(cubicBezierInterpolator).setUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 22)).setDuration(420L).start();
            anonymousClass1.animate().translationY(this.hasTopMessages ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.hasTopMessages ? 1.0f : 0.0f).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
            return;
        }
        anonymousClass34.setTranslationY(!zIsEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        anonymousClass1.setTranslationY(this.hasTopMessages ? 0.0f : AndroidUtilities.dp(35.0f));
        anonymousClass1.setAlpha(this.hasTopMessages ? 1.0f : 0.0f);
        invalidate();
    }

    public final int send(final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j2) {
        TL_phone.groupCallDonor groupcalldonor;
        int i = this.currentAccount;
        final int newMessageId = UserConfig.getInstance(i).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.inputCall;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j2 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j2;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i).getInputPeer(j);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LiveCommentsView liveCommentsView = this.f$0;
                liveCommentsView.getClass();
                boolean z = tLObject instanceof TLRPC.Updates;
                int i2 = newMessageId;
                if (!z) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new StarsIntroActivity$$ExternalSyntheticLambda10(liveCommentsView, i2, tL_error, j2, j, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateMessageID.class);
                int size = arrayListFindUpdatesAndRemove.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayListFindUpdatesAndRemove.get(i3);
                    i3++;
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                    if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                        int i4 = tL_updateMessageID.id;
                        ArrayList arrayList = liveCommentsView.messages;
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList.get(i5);
                            i5++;
                            LiveCommentsView.Message message = (LiveCommentsView.Message) obj2;
                            if (message.id == i2) {
                                message.id = i4;
                                break;
                            }
                        }
                    }
                }
                MessagesController.getInstance(liveCommentsView.currentAccount).processUpdates(updates, false);
            }
        });
        if (this.topDonors != null && j2 > 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.topDonors.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.topDonors.get(i2)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.topDonors.get(i2);
                    break;
                }
                i2++;
            }
            if (groupcalldonor != null) {
                groupcalldonor.stars += j2;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = MessagesController.getInstance(i).getPeer(j);
                groupcalldonor2.stars = j2;
                this.topDonors.add(groupcalldonor2);
            }
        }
        push(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime(), r3, j == this.dialogId || isAdmin(), j, tL_textWithEntities, j2, false);
        setCollapsed(false, true);
        return newMessageId;
    }
}
