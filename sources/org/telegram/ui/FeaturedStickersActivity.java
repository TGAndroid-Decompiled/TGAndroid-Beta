package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.FeaturedStickerSetCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StickersAlert;

public class FeaturedStickersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private LongSparseArray<TLRPC.StickerSetCovered> installingStickerSets;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int rowCount;
    private int stickersEndRow;
    private int stickersShadowRow;
    private int stickersStartRow;
    private ArrayList<Long> unreadStickers;

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public void lambda$onCreateViewHolder$0(View view) {
            FeaturedStickerSetCell featuredStickerSetCell = (FeaturedStickerSetCell) view.getParent();
            TLRPC.StickerSetCovered stickerSet = featuredStickerSetCell.getStickerSet();
            if (FeaturedStickersActivity.this.installingStickerSets.indexOfKey(stickerSet.set.id) >= 0) {
                return;
            }
            FeaturedStickersActivity.this.installingStickerSets.put(stickerSet.set.id, stickerSet);
            MediaDataController.getInstance(((BaseFragment) FeaturedStickersActivity.this).currentAccount).toggleStickerSet(FeaturedStickersActivity.this.getParentActivity(), stickerSet, 2, FeaturedStickersActivity.this, false, false);
            featuredStickerSetCell.addButton.setDrawProgress(true, true);
        }

        @Override
        public int getItemCount() {
            return FeaturedStickersActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            return ((i < FeaturedStickersActivity.this.stickersStartRow || i >= FeaturedStickersActivity.this.stickersEndRow) && i == FeaturedStickersActivity.this.stickersShadowRow) ? 1 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            char c;
            boolean z;
            if (getItemViewType(i) == 0) {
                ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(((BaseFragment) FeaturedStickersActivity.this).currentAccount).getFeaturedStickerSets();
                final FeaturedStickerSetCell featuredStickerSetCell = (FeaturedStickerSetCell) viewHolder.itemView;
                featuredStickerSetCell.setTag(Integer.valueOf(i));
                TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i);
                boolean z2 = i != featuredStickerSets.size() - 1;
                boolean z3 = FeaturedStickersActivity.this.unreadStickers != null && FeaturedStickersActivity.this.unreadStickers.contains(Long.valueOf(stickerSetCovered.set.id));
                boolean z4 = stickerSetCovered == featuredStickerSetCell.stickersSet && featuredStickerSetCell.wasLayout;
                featuredStickerSetCell.needDivider = z2;
                featuredStickerSetCell.stickersSet = stickerSetCovered;
                featuredStickerSetCell.setWillNotDraw(!z2);
                TextView textView = featuredStickerSetCell.textView;
                textView.setText(featuredStickerSetCell.stickersSet.set.title);
                TLRPC.Document document = null;
                if (z3) {
                    Drawable drawable = new Drawable() {
                        public final Paint paint = new Paint(1);

                        @Override
                        public final void draw(Canvas canvas) {
                            Paint paint = this.paint;
                            paint.setColor(-12277526);
                            canvas.drawCircle(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), paint);
                        }

                        @Override
                        public final int getIntrinsicHeight() {
                            return AndroidUtilities.dp(8.0f);
                        }

                        @Override
                        public final int getIntrinsicWidth() {
                            return AndroidUtilities.dp(12.0f);
                        }

                        @Override
                        public final int getOpacity() {
                            return -2;
                        }

                        @Override
                        public final void setAlpha(int i2) {
                        }

                        @Override
                        public final void setColorFilter(ColorFilter colorFilter) {
                        }
                    };
                    boolean z5 = LocaleController.isRTL;
                    Drawable drawable2 = z5 ? null : drawable;
                    if (!z5) {
                        drawable = null;
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                featuredStickerSetCell.valueTextView.setText(LocaleController.formatPluralString("Stickers", stickerSetCovered.set.count, new Object[0]));
                TLRPC.Document document2 = stickerSetCovered.cover;
                if (document2 != null) {
                    document = document2;
                } else if (!stickerSetCovered.covers.isEmpty()) {
                    document = stickerSetCovered.covers.get(0);
                }
                BackupImageView backupImageView = featuredStickerSetCell.imageView;
                if (document != null) {
                    TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
                    if (closestPhotoSizeWithSize == null) {
                        closestPhotoSizeWithSize = document;
                    }
                    c = 5;
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, Theme.key_windowBackgroundGray, 1.0f);
                    boolean z6 = closestPhotoSizeWithSize instanceof TLRPC.Document;
                    ImageLocation forDocument = z6 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
                    if (!z6 || (!MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isVideoSticker(document))) {
                        if (forDocument == null || forDocument.imageType != 1) {
                            backupImageView.setImage(forDocument, "50_50", "webp", svgThumb, stickerSetCovered);
                        } else {
                            backupImageView.setImage(forDocument, "50_50", "tgs", svgThumb, stickerSetCovered);
                        }
                        stickerSetCovered = stickerSetCovered;
                    } else if (svgThumb != null) {
                        backupImageView.setImage(ImageLocation.getForDocument(document), "50_50", svgThumb, 0, stickerSetCovered);
                    } else {
                        backupImageView.setImage(ImageLocation.getForDocument(document), "50_50", forDocument, (String) null, 0, stickerSetCovered);
                        stickerSetCovered = stickerSetCovered;
                    }
                } else {
                    c = 5;
                    backupImageView.setImage((ImageLocation) null, (String) null, "webp", (Drawable) null, stickerSetCovered);
                }
                ImageView imageView = featuredStickerSetCell.checkImage;
                int i2 = featuredStickerSetCell.currentAccount;
                ProgressButton progressButton = featuredStickerSetCell.addButton;
                if (!z4) {
                    AnimatorSet animatorSet = featuredStickerSetCell.currentAnimation;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    boolean zIsStickerPackInstalled = MediaDataController.getInstance(i2).isStickerPackInstalled(stickerSetCovered.set.id);
                    featuredStickerSetCell.isInstalled = zIsStickerPackInstalled;
                    if (zIsStickerPackInstalled) {
                        progressButton.setVisibility(4);
                        progressButton.setClickable(false);
                        imageView.setVisibility(0);
                        imageView.setScaleX(1.0f);
                        imageView.setScaleY(1.0f);
                        imageView.setAlpha(1.0f);
                    } else {
                        progressButton.setVisibility(0);
                        progressButton.setClickable(true);
                        imageView.setVisibility(4);
                        progressButton.setScaleX(1.0f);
                        progressButton.setScaleY(1.0f);
                        progressButton.setAlpha(1.0f);
                    }
                    if (FeaturedStickersActivity.this.installingStickerSets.indexOfKey(stickerSetCovered.set.id) >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && featuredStickerSetCell.isInstalled) {
                        FeaturedStickersActivity.this.installingStickerSets.remove(stickerSetCovered.set.id);
                        z = false;
                    }
                    progressButton.setDrawProgress(z, false);
                }
                boolean z7 = featuredStickerSetCell.isInstalled;
                boolean zIsStickerPackInstalled2 = MediaDataController.getInstance(i2).isStickerPackInstalled(stickerSetCovered.set.id);
                featuredStickerSetCell.isInstalled = zIsStickerPackInstalled2;
                if (zIsStickerPackInstalled2) {
                    if (!z7) {
                        imageView.setVisibility(0);
                        progressButton.setClickable(false);
                        AnimatorSet animatorSet2 = featuredStickerSetCell.currentAnimation;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                        }
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        featuredStickerSetCell.currentAnimation = animatorSet3;
                        animatorSet3.setDuration(200L);
                        AnimatorSet animatorSet4 = featuredStickerSetCell.currentAnimation;
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(progressButton, "alpha", 1.0f, 0.0f);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(progressButton, "scaleX", 1.0f, 0.01f);
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(progressButton, "scaleY", 1.0f, 0.01f);
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, "alpha", 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(imageView, "scaleX", 0.01f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(imageView, "scaleY", 0.01f, 1.0f);
                        Animator[] animatorArr = new Animator[6];
                        animatorArr[0] = objectAnimatorOfFloat;
                        animatorArr[1] = objectAnimatorOfFloat2;
                        animatorArr[2] = objectAnimatorOfFloat3;
                        animatorArr[3] = objectAnimatorOfFloat4;
                        animatorArr[4] = objectAnimatorOfFloat5;
                        animatorArr[c] = objectAnimatorOfFloat6;
                        animatorSet4.playTogether(animatorArr);
                        featuredStickerSetCell.currentAnimation.addListener(new AnimatorListenerAdapter() {
                            public AnonymousClass2() {
                            }

                            @Override
                            public final void onAnimationCancel(Animator animator) {
                                FeaturedStickerSetCell featuredStickerSetCell2 = FeaturedStickerSetCell.this;
                                AnimatorSet animatorSet5 = featuredStickerSetCell2.currentAnimation;
                                if (animatorSet5 == null || !animatorSet5.equals(animator)) {
                                    return;
                                }
                                featuredStickerSetCell2.currentAnimation = null;
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                FeaturedStickerSetCell featuredStickerSetCell2 = FeaturedStickerSetCell.this;
                                AnimatorSet animatorSet5 = featuredStickerSetCell2.currentAnimation;
                                if (animatorSet5 == null || !animatorSet5.equals(animator)) {
                                    return;
                                }
                                featuredStickerSetCell2.addButton.setVisibility(4);
                            }
                        });
                        featuredStickerSetCell.currentAnimation.start();
                    }
                } else if (z7) {
                    progressButton.setVisibility(0);
                    progressButton.setClickable(true);
                    AnimatorSet animatorSet5 = featuredStickerSetCell.currentAnimation;
                    if (animatorSet5 != null) {
                        animatorSet5.cancel();
                    }
                    AnimatorSet animatorSet6 = new AnimatorSet();
                    featuredStickerSetCell.currentAnimation = animatorSet6;
                    animatorSet6.setDuration(200L);
                    AnimatorSet animatorSet7 = featuredStickerSetCell.currentAnimation;
                    ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
                    ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 0.01f);
                    ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 0.01f);
                    ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(progressButton, "alpha", 0.0f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(progressButton, "scaleX", 0.01f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(progressButton, "scaleY", 0.01f, 1.0f);
                    Animator[] animatorArr2 = new Animator[6];
                    animatorArr2[0] = objectAnimatorOfFloat7;
                    animatorArr2[1] = objectAnimatorOfFloat8;
                    animatorArr2[2] = objectAnimatorOfFloat9;
                    animatorArr2[3] = objectAnimatorOfFloat10;
                    animatorArr2[4] = objectAnimatorOfFloat11;
                    animatorArr2[c] = objectAnimatorOfFloat12;
                    animatorSet7.playTogether(animatorArr2);
                    featuredStickerSetCell.currentAnimation.addListener(new AnimatorListenerAdapter() {
                        public AnonymousClass3() {
                        }

                        @Override
                        public final void onAnimationCancel(Animator animator) {
                            FeaturedStickerSetCell featuredStickerSetCell2 = FeaturedStickerSetCell.this;
                            AnimatorSet animatorSet8 = featuredStickerSetCell2.currentAnimation;
                            if (animatorSet8 == null || !animatorSet8.equals(animator)) {
                                return;
                            }
                            featuredStickerSetCell2.currentAnimation = null;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            FeaturedStickerSetCell featuredStickerSetCell2 = FeaturedStickerSetCell.this;
                            AnimatorSet animatorSet8 = featuredStickerSetCell2.currentAnimation;
                            if (animatorSet8 == null || !animatorSet8.equals(animator)) {
                                return;
                            }
                            featuredStickerSetCell2.checkImage.setVisibility(4);
                        }
                    });
                    featuredStickerSetCell.currentAnimation.start();
                }
                if (FeaturedStickersActivity.this.installingStickerSets.indexOfKey(stickerSetCovered.set.id) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    FeaturedStickersActivity.this.installingStickerSets.remove(stickerSetCovered.set.id);
                    z = false;
                }
                progressButton.setDrawProgress(z, false);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i != 0) {
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext, 24, null);
                textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                view = textInfoPrivacyCell;
            } else {
                FeaturedStickerSetCell featuredStickerSetCell = new FeaturedStickerSetCell(this.mContext);
                featuredStickerSetCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                featuredStickerSetCell.setAddOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 9));
                view = featuredStickerSetCell;
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }
    }

    public FeaturedStickersActivity() {
        super(null);
        this.unreadStickers = null;
        this.installingStickerSets = new LongSparseArray<>();
    }

    public void lambda$createView$0(final View view, int i) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        if (i < this.stickersStartRow || i >= this.stickersEndRow || getParentActivity() == null) {
            return;
        }
        final TLRPC.StickerSetCovered stickerSetCovered = MediaDataController.getInstance(this.currentAccount).getFeaturedStickerSets().get(i);
        if (stickerSetCovered.set.id != 0) {
            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
        } else {
            tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
        }
        TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
        inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
        StickersAlert stickersAlert = new StickersAlert(getParentActivity(), this, inputStickerSet, null, null, false);
        stickersAlert.setInstallDelegate(new StickersAlert.StickersAlertInstallDelegate() {
            @Override
            public void onStickerSetInstalled() {
                ((FeaturedStickerSetCell) view).addButton.setDrawProgress(true, true);
                LongSparseArray longSparseArray = FeaturedStickersActivity.this.installingStickerSets;
                TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                longSparseArray.put(stickerSetCovered2.set.id, stickerSetCovered2);
            }

            @Override
            public void onStickerSetUninstalled() {
            }
        });
        showDialog(stickersAlert);
    }

    private void updateRows() {
        this.rowCount = 0;
        ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = MediaDataController.getInstance(this.currentAccount).getFeaturedStickerSets();
        if (featuredStickerSets.isEmpty()) {
            this.stickersStartRow = -1;
            this.stickersEndRow = -1;
            this.stickersShadowRow = -1;
        } else {
            int i = this.rowCount;
            this.stickersStartRow = i;
            this.stickersEndRow = featuredStickerSets.size() + i;
            int size = featuredStickerSets.size() + this.rowCount;
            this.rowCount = size + 1;
            this.stickersShadowRow = size;
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        MediaDataController.getInstance(this.currentAccount).markFeaturedStickersAsRead(false, true);
    }

    private void updateVisibleTrendingSets() {
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) == -1 || (iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition()) == -1) {
            return;
        }
        this.listAdapter.notifyItemRangeChanged(iFindFirstVisibleItemPosition, (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.FeaturedStickers));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    FeaturedStickersActivity.this.finishFragment();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.lambda$onCellEnter$52(null);
        this.listView.setLayoutAnimation(null);
        this.listView.setFocusable(true);
        this.listView.setTag(14);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) {
            {
                super(1, false);
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.layoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.listView.setLayoutManager(this.layoutManager);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 13));
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.featuredStickersDidLoad) {
            if (this.unreadStickers == null) {
                this.unreadStickers = MediaDataController.getInstance(this.currentAccount).getUnreadStickerSets();
            }
            updateRows();
        } else if (i == NotificationCenter.stickersDidLoad) {
            updateVisibleTrendingSets();
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{FeaturedStickerSetCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{FeaturedStickerSetCell.class}, new String[]{"progressPaint"}, null, null, -1, null, Theme.key_featuredStickers_buttonProgress));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{FeaturedStickerSetCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{FeaturedStickerSetCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{FeaturedStickerSetCell.class}, new String[]{"addButton"}, null, null, -1, null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{FeaturedStickerSetCell.class}, new String[]{"checkImage"}, null, null, -1, null, Theme.key_featuredStickers_addedIcon));
        arrayList.add(new ThemeDescription(this.listView, 131072, new Class[]{FeaturedStickerSetCell.class}, new String[]{"addButton"}, null, null, -1, null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{FeaturedStickerSetCell.class}, new String[]{"addButton"}, null, null, -1, null, Theme.key_featuredStickers_addButtonPressed));
        return arrayList;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        ArrayList<Long> unreadStickerSets = MediaDataController.getInstance(this.currentAccount).getUnreadStickerSets();
        if (unreadStickerSets != null) {
            this.unreadStickers = new ArrayList<>(unreadStickerSets);
        }
        updateRows();
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.featuredStickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }
}
