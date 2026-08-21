package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.RecyclerListView;

public class FeaturesPageView extends BaseListPageView {
    RecyclerListView.SelectionAdapter adapter;
    Bitmap bitmap;
    ArrayList items;
    public final int type;

    public FeaturesPageView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        FeaturesPageView featuresPageView;
        final SparseIntArray sparseIntArray;
        super(context, resourcesProvider);
        this.items = new ArrayList();
        this.type = i;
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        if (i == 0) {
            arrayList.add(new Item(1, R.drawable.msg_stories_order, LocaleController.getString(R.string.PremiumStoriesPriority), LocaleController.getString(R.string.PremiumStoriesPriorityDescription), 20));
            arrayList.add(new Item(1, R.drawable.msg_stories_stealth, LocaleController.getString(R.string.PremiumStoriesStealth), LocaleController.getString(R.string.PremiumStoriesStealthDescription), 15));
            arrayList.add(new Item(1, R.drawable.menu_quality_hd, LocaleController.getString(R.string.PremiumStoriesQuality), LocaleController.getString(R.string.PremiumStoriesQualityDescription), 25));
            arrayList.add(new Item(1, R.drawable.msg_stories_views, LocaleController.getString(R.string.PremiumStoriesViews), LocaleController.getString(R.string.PremiumStoriesViewsDescription), 16));
            arrayList.add(new Item(1, R.drawable.msg_stories_timer, LocaleController.getString(R.string.PremiumStoriesExpiration), LocaleController.getString(R.string.PremiumStoriesExpirationDescription), 17));
            arrayList.add(new Item(1, R.drawable.msg_stories_save, LocaleController.getString(R.string.PremiumStoriesSaveToGallery), LocaleController.getString(R.string.PremiumStoriesSaveToGalleryDescription), 18));
            arrayList.add(new Item(1, R.drawable.msg_stories_caption, LocaleController.getString(R.string.PremiumStoriesCaption), LocaleController.getString(R.string.PremiumStoriesCaptionDescription), 21));
            featuresPageView = this;
            arrayList.add(featuresPageView.new Item(1, R.drawable.msg_stories_link, LocaleController.getString(R.string.PremiumStoriesFormatting), LocaleController.getString(R.string.PremiumStoriesFormattingDescription), 19));
        } else {
            if (i == 1) {
                sparseIntArray = messagesController.businessFeaturesTypesToPosition;
                arrayList.add(new Item(1, R.drawable.menu_premium_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription), 29));
                arrayList.add(new Item(1, R.drawable.menu_premium_clock, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription), 30));
                arrayList.add(new Item(1, R.drawable.menu_quickreply, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription), 31));
                arrayList.add(new Item(1, R.drawable.menu_feature_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription), 32));
                arrayList.add(new Item(1, R.drawable.menu_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription), 33));
                arrayList.add(new Item(1, R.drawable.menu_premium_chatbot, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription), 34));
                arrayList.add(new Item(1, R.drawable.menu_feature_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription), 36));
                featuresPageView = this;
                arrayList.add(featuresPageView.new Item(1, R.drawable.menu_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription), 37));
            } else {
                featuresPageView = this;
            }
            if (sparseIntArray != null) {
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return FeaturesPageView.m2584$r8$lambda$dXX_8nC6cQoBeyITZRw1xIN6w(sparseIntArray, (FeaturesPageView.Item) obj, (FeaturesPageView.Item) obj2);
                    }
                });
            }
            featuresPageView.items.add(new Item(0));
            featuresPageView.items.addAll(arrayList);
            featuresPageView.items.add(new Item(2));
            featuresPageView.bitmap = Bitmap.createBitmap(featuresPageView.items.size(), 1, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(featuresPageView.bitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, featuresPageView.bitmap.getWidth(), 0.0f, new int[]{Theme.getColor(Theme.key_premiumGradient1), Theme.getColor(Theme.key_premiumGradient2), Theme.getColor(Theme.key_premiumGradient3), Theme.getColor(Theme.key_premiumGradient4)}, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, featuresPageView.bitmap.getWidth(), featuresPageView.bitmap.getHeight(), paint);
        }
        sparseIntArray = null;
        if (sparseIntArray != null) {
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return FeaturesPageView.m2584$r8$lambda$dXX_8nC6cQoBeyITZRw1xIN6w(sparseIntArray, (FeaturesPageView.Item) obj, (FeaturesPageView.Item) obj2);
                }
            });
        }
        featuresPageView.items.add(new Item(0));
        featuresPageView.items.addAll(arrayList);
        featuresPageView.items.add(new Item(2));
        featuresPageView.bitmap = Bitmap.createBitmap(featuresPageView.items.size(), 1, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(featuresPageView.bitmap);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 0.0f, featuresPageView.bitmap.getWidth(), 0.0f, new int[]{Theme.getColor(Theme.key_premiumGradient1), Theme.getColor(Theme.key_premiumGradient2), Theme.getColor(Theme.key_premiumGradient3), Theme.getColor(Theme.key_premiumGradient4)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, featuresPageView.bitmap.getWidth(), featuresPageView.bitmap.getHeight(), paint2);
    }

    public static int m2584$r8$lambda$dXX_8nC6cQoBeyITZRw1xIN6w(SparseIntArray sparseIntArray, Item item, Item item2) {
        return sparseIntArray.get(item.order, Integer.MAX_VALUE) - sparseIntArray.get(item2.order, Integer.MAX_VALUE);
    }

    @Override
    public RecyclerView.Adapter createAdapter() {
        RecyclerListView.SelectionAdapter selectionAdapter = new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return false;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View itemCell;
                if (i == 0) {
                    FeaturesPageView featuresPageView = FeaturesPageView.this;
                    itemCell = featuresPageView.new HeaderView(featuresPageView.getContext());
                } else if (i == 2) {
                    itemCell = new FixedHeightEmptyCell(FeaturesPageView.this.getContext(), 16);
                } else {
                    FeaturesPageView featuresPageView2 = FeaturesPageView.this;
                    itemCell = featuresPageView2.new ItemCell(featuresPageView2.getContext());
                }
                itemCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(itemCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (((Item) FeaturesPageView.this.items.get(i)).viewType == 1) {
                    ItemCell itemCell = (ItemCell) viewHolder.itemView;
                    itemCell.imageView.setColorFilter(new PorterDuffColorFilter(FeaturesPageView.this.bitmap.getPixel(i, 0), PorterDuff.Mode.MULTIPLY));
                    itemCell.imageView.setImageDrawable(ContextCompat.getDrawable(FeaturesPageView.this.getContext(), ((Item) FeaturesPageView.this.items.get(i)).iconRes));
                    itemCell.textView.setText(((Item) FeaturesPageView.this.items.get(i)).text);
                    itemCell.description.setText(((Item) FeaturesPageView.this.items.get(i)).description);
                }
            }

            @Override
            public int getItemViewType(int i) {
                return ((Item) FeaturesPageView.this.items.get(i)).viewType;
            }

            @Override
            public int getItemCount() {
                return FeaturesPageView.this.items.size();
            }
        };
        this.adapter = selectionAdapter;
        return selectionAdapter;
    }

    class Item {
        String description;
        int iconRes;
        int order;
        String text;
        final int viewType;

        private Item(int i) {
            this.viewType = i;
        }

        public Item(int i, int i2, String str, String str2, int i3) {
            this.viewType = i;
            this.iconRes = i2;
            this.text = str;
            this.description = str2;
            this.order = i3;
        }
    }

    private class HeaderView extends FrameLayout {
        GradientTools gradientTools;
        int height;
        GLIconTextureView iconTextureView;
        BackupImageView imageView;
        StarParticlesView starParticlesView;

        public HeaderView(Context context) {
            super(context);
            this.gradientTools = new GradientTools();
            int i = FeaturesPageView.this.type;
            if (i == 0) {
                this.height = AndroidUtilities.dp(150.0f);
                BackupImageView backupImageView = new BackupImageView(context);
                this.imageView = backupImageView;
                backupImageView.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
                addView(this.imageView, LayoutHelper.createFrame(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
                TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setInfo(currentUser);
                this.imageView.getImageReceiver().setForUserOrChat(currentUser, avatarDrawable);
                TextView textView = new TextView(context);
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, FeaturesPageView.this.resourcesProvider));
                textView.setText(LocaleController.getString(R.string.UpgradedStories));
                addView(textView, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
                GradientTools gradientTools = this.gradientTools;
                gradientTools.isLinear = true;
                gradientTools.isDiagonal = true;
                gradientTools.setColors(Theme.getColor(Theme.key_premiumGradient2), Theme.getColor(Theme.key_premiumGradient1));
                this.gradientTools.paint.setStyle(Paint.Style.STROKE);
                this.gradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
                this.gradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
                return;
            }
            if (i == 1) {
                StarParticlesView starParticlesView = new StarParticlesView(context) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, i3);
                        this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                    }

                    @Override
                    protected void configure() {
                        StarParticlesView.Drawable drawable = this.drawable;
                        drawable.useGradient = true;
                        drawable.useBlur = false;
                        drawable.checkBounds = true;
                        drawable.isCircle = true;
                        drawable.centerOffsetY = AndroidUtilities.dp(-14.0f);
                        StarParticlesView.Drawable drawable2 = this.drawable;
                        drawable2.minLifeTime = 2000L;
                        drawable2.randLifeTime = 3000;
                        drawable2.size1 = 16;
                        drawable2.useRotate = false;
                        drawable2.type = 28;
                        drawable2.colorKey = Theme.key_premiumGradient2;
                        drawable2.init();
                    }
                };
                this.starParticlesView = starParticlesView;
                addView(starParticlesView, LayoutHelper.createFrame(-1, 190, 55));
                GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 1) {
                    @Override
                    protected void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        setPaused(false);
                    }

                    @Override
                    protected void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        setPaused(true);
                    }
                };
                this.iconTextureView = gLIconTextureView;
                gLIconTextureView.setStarParticlesView(this.starParticlesView);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                int i2 = Theme.key_premiumGradient2;
                canvas.drawColor(ColorUtils.blendARGB(Theme.getColor(i2, FeaturesPageView.this.resourcesProvider), Theme.getColor(Theme.key_dialogBackground, FeaturesPageView.this.resourcesProvider), 0.5f));
                this.iconTextureView.setBackgroundBitmap(bitmapCreateBitmap);
                GLIconRenderer gLIconRenderer = this.iconTextureView.mRenderer;
                gLIconRenderer.colorKey1 = i2;
                gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
                gLIconRenderer.updateColors();
                addView(this.iconTextureView, LayoutHelper.createFrame(160, 160, 1));
                GLIconTextureView gLIconTextureView2 = this.iconTextureView;
                if (gLIconTextureView2 != null) {
                    gLIconTextureView2.startEnterAnimation(-360, 100L);
                }
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 20.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, FeaturesPageView.this.resourcesProvider));
                textView2.setText(LocaleController.getString(R.string.TelegramBusiness));
                textView2.setGravity(17);
                addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, FeaturesPageView.this.resourcesProvider));
                textView3.setText(LocaleController.getString(R.string.TelegramBusinessSubtitle2));
                textView3.setGravity(17);
                addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (FeaturesPageView.this.type == 0) {
                BackupImageView backupImageView = this.imageView;
                Rect rect = AndroidUtilities.rectTmp2;
                backupImageView.getHitRect(rect);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.gradientTools.setBounds(rectF);
                float f = 360.0f / 7;
                for (int i = 0; i < 7; i++) {
                    float f2 = (i * f) - 90.0f;
                    float f3 = 5;
                    float f4 = f2 + f3;
                    canvas.drawArc(AndroidUtilities.rectTmp, f4, ((f2 + f) - f3) - f4, false, this.gradientTools.paint);
                }
            }
            super.dispatchDraw(canvas);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3 = this.height;
            if (i3 > 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    private class ItemCell extends FrameLayout {
        TextView description;
        ImageView imageView;
        TextView textView;

        public ItemCell(Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.imageView, LayoutHelper.createFrame(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, FeaturesPageView.this.resourcesProvider));
            this.textView.setTextSize(1, 14.0f);
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.description = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, FeaturesPageView.this.resourcesProvider));
            this.description.setTextSize(1, 14.0f);
            addView(this.description, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
        }
    }
}
